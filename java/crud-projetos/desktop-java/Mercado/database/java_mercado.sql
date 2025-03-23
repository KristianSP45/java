CREATE DATABASE java_mercado;

USE java_mercado;

CREATE TABLE produtos (
    id_produto INT PRIMARY KEY AUTO_INCREMENT,
    produtos VARCHAR(45), 
    valor FLOAT,
    quantidade_produtos INT not null
) ENGINE = InnoDB;

CREATE TABLE clientes (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45),
    telefone VARCHAR(45)
) ENGINE = InnoDB;

CREATE TABLE compras (
    id_compra INT PRIMARY KEY AUTO_INCREMENT,
    id_cliente_cli INT,
    id_produto_pro INT,
    quantidade_compras INT,
    valor_unitario FLOAT,
    data_compra DATE,
    FOREIGN KEY (id_cliente_cli) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_produto_pro) REFERENCES produtos(id_produto)
) ENGINE = InnoDB;


DELIMITER $
CREATE TRIGGER diminuir_estoque_ao_comprar
AFTER INSERT ON compras
FOR EACH ROW
BEGIN
    UPDATE produtos
    SET quantidade_produtos = quantidade_produtos - NEW.quantidade_compras
    WHERE id_produto = NEW.id_produto_pro;
END;
DELIMITER ;

DELIMITER $
CREATE TRIGGER restaurar_estoque_ao_cancelar
AFTER DELETE ON compras
FOR EACH ROW
BEGIN
    UPDATE produtos
    SET quantidade_produtos = quantidade_produtos + OLD.quantidade_compras
    WHERE id_produto = OLD.id_produto_pro;
END;
DELIMITER ;

DELIMITER $
CREATE TRIGGER calcular_valor_total_compra
BEFORE INSERT ON compras
FOR EACH ROW
BEGIN
    DECLARE preco_unitario FLOAT;
    SELECT valor INTO preco_unitario FROM produtos WHERE id_produto = NEW.id_produto_pro;
    SET NEW.valor_unitario = preco_unitario * NEW.quantidade_compras;
END;
DELIMITER ;

DELIMITER $
CREATE TRIGGER verifica_estoque
BEFORE INSERT ON compras
FOR EACH ROW
BEGIN
    DECLARE quantidade_estoque INT;
    SELECT quantidade_produtos 
    INTO quantidade_estoque 
    FROM produtos 
    WHERE id_produto = NEW.id_produto_pro;
    IF quantidade_estoque < NEW.quantidade_compras THEN
        SIGNAL SQLSTATE '45000' 
        SET MESSAGE_TEXT = 'Erro: Não há estoque suficiente para essa quantidade.';
    END IF;
END ;
DELIMITER ;










-- Nada relevante --
/*SELECT com.id_compra, 
       cli.nome, 
       pro.produtos, 
       com.quantidade_compras, 
       com.valor_unitario
FROM compras AS com 
JOIN clientes AS cli ON com.id_cliente_cli = cli.id_cliente
JOIN produtos AS pro ON com.id_produto_pro = pro.id_produto;*/


-- select * from compras; --
-- select * from produtos; --
-- select * from clientes; --
drop database java_mercado;
-- DELETE FROM clientes WHERE id_cliente = 1; --
-- INSERT INTO compras (id_cliente_cli, id_produto_pro, quantidade_compras, valor_unitario, data_compra) VALUES (1, 1,2, 12, '2006-04-12'); --