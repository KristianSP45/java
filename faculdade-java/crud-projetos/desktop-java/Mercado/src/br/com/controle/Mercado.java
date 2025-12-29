/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import java.time.LocalDate;
        
/**
 *
 * @author sousa
 */
public class Mercado {
    //Produtos

    private int id_produto;
    private String produtos; 
    private float valor;
    private int quantidade_produtos;

    //Clientes

    private int id_cliente;
    private String nome; 
    private String telefone;

    //Compras

    private int id_compra;
    private int id_cliente_cli;
    private int id_produto_pro;
    private int quantidade_compras; 
    private float valor_unitario; 
    private LocalDate data_compra;

    //Produtos
    
    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade_produtos() {
        return quantidade_produtos;
    }

    public void setQuantidade_produtos(int quantidade_produtos) {
        this.quantidade_produtos = quantidade_produtos;
    }

    //Clientes
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //Compras

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_cliente_cli() {
        return id_cliente_cli;
    }

    public void setId_cliente_cli(int id_cliente_cli) {
        this.id_cliente_cli = id_cliente_cli;
    }

    public int getId_produto_pro() {
        return id_produto_pro;
    }

    public void setId_produto_pro(int id_produto_pro) {
        this.id_produto_pro = id_produto_pro;
    }

    public int getQuantidade_compras() {
        return quantidade_compras;
    }

    public void setQuantidade_compras(int quantidade_compras) {
        this.quantidade_compras = quantidade_compras;
    }

    public float getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public LocalDate getData_compra() {
        return data_compra;
    }

    public void setData_compra(LocalDate data_compra) {
        this.data_compra = data_compra;
    }
    
    
}
