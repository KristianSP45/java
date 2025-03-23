/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modelo;

import br.com.controle.Mercado;
import javax.swing.JOptionPane;
//import java.sql.Connection; // Para a conexão com o banco de dados
import java.sql.PreparedStatement; // Para usar PreparedStatement
import java.sql.ResultSet;
//import java.sql.SQLException; // Para capturar exceções SQL
import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author sousa
 */
public class MercadoDAO extends DAO{
    
    //Produtos
    
    public void inserirProdutos(Mercado m) throws Exception{
        abrirBanco();
        String query = "INSERT INTO produtos (id_produto,produtos,valor,quantidade_produtos) values(null,?,?,?)";
        ps = (PreparedStatement) con.prepareStatement(query);
        ps.setString(1, m.getProdutos());
        ps.setFloat(2, m.getValor());
        ps.setInt(3, m.getQuantidade_produtos());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Produto Inserido com sucesso!");
        fecharBanco();
    }
    
    public void PesquisarRegistroProdutos(Mercado m) throws Exception{
        try {
            abrirBanco();
            String query = "SELECT id_produto,produtos,valor,quantidade_produtos FROM produtos WHERE id_produto=?";
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setInt(1, m.getId_produto());
            ResultSet tr = ps.executeQuery();
            if (tr.next()) {
                m.setId_produto(tr.getInt("id_produto"));
                m.setProdutos(tr.getString("produtos"));
                m.setValor(tr.getFloat("valor"));
                m.setQuantidade_produtos(tr.getInt("quantidade_produtos"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro"+ e.getMessage());
        }
    }
    
    public ArrayList<Mercado> PesquisarTudoProdutos() throws Exception {
        ArrayList<Mercado> produtos = new ArrayList<Mercado>();
        try {
            abrirBanco();
            String query = "SELECT id_produto,produtos,valor,quantidade_produtos FROM produtos";
            ps = (PreparedStatement) con.prepareStatement(query);
            ResultSet tr = ps.executeQuery();
            Mercado m;
            while (tr.next()) {                
                m = new Mercado();
                m.setId_produto(tr.getInt("id_produto"));
                m.setProdutos(tr.getString("produtos"));
                m.setValor(tr.getFloat("valor"));
                m.setQuantidade_produtos(tr.getInt("quantidade_produtos"));
                produtos.add(m);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro"+e.getMessage());
        }
        return produtos;
    }
    
    public void deletarProdutos(Mercado m) throws Exception{
    abrirBanco();
    String query = "DELETE FROM produtos WHERE id_produto=?";
    ps = (PreparedStatement) con.prepareStatement(query);
    ps.setInt(1, m.getId_produto());
    ps.execute();
    JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");
    fecharBanco();
    }
    
    public void alterarProdutos(Mercado m) throws Exception{
        abrirBanco();
        String query = "UPDATE produtos set produtos=?, valor=?, quantidade_produtos=? WHERE id_produto=?";
        ps = (PreparedStatement) con.prepareStatement(query);
        ps.setString(1, m.getProdutos());
        ps.setFloat(2, m.getValor());
        ps.setInt(3, m.getQuantidade_produtos());
        ps.setInt(4, m.getId_produto());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Produto Alterado com sucesso!");
        fecharBanco();
    }

    //Clientes
    
    public void inserirClientes(Mercado m) throws Exception{
        abrirBanco();
        String query = "INSERT INTO clientes (id_cliente,nome,telefone) VALUES(null,?,?)";
        ps = (PreparedStatement) con.prepareStatement(query);
        ps.setString(1, m.getNome());
        ps.setString(2, m.getTelefone());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Cliente Inserido com sucesso!");
        fecharBanco();
    }
    
    public void PesquisarRegistroClientes(Mercado m) throws Exception{
        try {
            abrirBanco();
            String query = "SELECT id_cliente,nome,telefone FROM clientes WHERE id_cliente=?";
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setInt(1, m.getId_cliente());
            ResultSet tr = ps.executeQuery();
            if (tr.next()) {
                m.setId_cliente(tr.getInt("id_cliente"));
                m.setNome(tr.getString("nome"));
                m.setTelefone(tr.getString("telefone"));
            } else{
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro"+e.getMessage());
        }
    }
    
    public ArrayList<Mercado> PesquisarTudoClientes() throws Exception{
        ArrayList<Mercado> clientes = new ArrayList<Mercado>();
        try {
            abrirBanco();
            String query = "SELECT id_cliente,nome,telefone FROM clientes";
            ps = (PreparedStatement) con.prepareStatement(query);
            ResultSet tr = ps.executeQuery();
            Mercado m;
            while (tr.next()) {                
                m = new Mercado();
                m.setId_cliente(tr.getInt("id_cliente"));
                m.setNome(tr.getString("nome"));
                m.setTelefone(tr.getString("telefone"));
                clientes.add(m);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }
        return clientes;
    }
    
    public void deletarClientes(Mercado m) throws Exception{
        abrirBanco();
        String query = "DELETE FROM clientes WHERE id_cliente=?";
        ps = (PreparedStatement) con.prepareStatement(query);
        ps.setInt(1, m.getId_cliente());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!");
        fecharBanco();
    }
    
    public void alterarClientes(Mercado m) throws Exception{
        abrirBanco();
        String query = "UPDATE clientes set nome=? ,telefone=? WHERE id_cliente=?";
        ps=(PreparedStatement) con.prepareStatement(query);
        ps.setString(1, m.getNome());
        ps.setString(2, m.getTelefone());
        ps.setInt(3, m.getId_cliente());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Cliente Alterado com sucesso!");
        fecharBanco();
    }
    
    //Compras

    public void inserirCompras(Mercado m) throws Exception{
        abrirBanco();
        String query = "INSERT INTO compras(id_compra,id_cliente_cli,id_produto_pro,quantidade_compras,valor_unitario,data_compra) values(null,?,?,?,?,?)";
        ps = (PreparedStatement) con.prepareStatement(query);
        ps.setInt(1, m.getId_cliente_cli());
        ps.setInt(2, m.getId_produto_pro());
        ps.setInt(3, m.getQuantidade_compras());
        ps.setFloat(4, m.getValor_unitario());
        ps.setDate(5, java.sql.Date.valueOf(m.getData_compra()));
        ps.execute();
        JOptionPane.showMessageDialog(null, "Compra feita com sucesso!");
        fecharBanco();
    }
    
    public void PesquisarRegistroCompras(Mercado m) throws Exception{
        try {
            abrirBanco();
            String query = "SELECT id_compra,id_cliente_cli,id_produto_pro,quantidade_compras,valor_unitario,data_compra FROM compras WHERE id_compra=?";
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setInt(1, m.getId_compra());
            ResultSet tr = ps.executeQuery();
            if (tr.next()) {
                m.setId_compra(tr.getInt("id_compra"));
                m.setId_cliente_cli(tr.getInt("id_cliente_cli"));
                m.setId_produto_pro(tr.getInt("id_produto_pro"));
                m.setQuantidade_compras(tr.getInt("quantidade_compras"));
                m.setValor_unitario(tr.getFloat("valor_unitario"));
                m.setData_compra(tr.getDate("data_compra").toLocalDate());
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }
    }
    
    public ArrayList<Mercado> PesquisarTudoCompras() throws Exception{
        ArrayList<Mercado> compras = new ArrayList<Mercado>();
        try {
            abrirBanco();
            String query = "SELECT compras.id_compra, clientes.nome, produtos.produtos, compras.quantidade_compras, compras.valor_unitario, compras.data_compra\n" +
                    "FROM compras\n" +
                    "JOIN clientes ON clientes.id_cliente = compras.id_cliente_cli\n" +
                    "JOIN produtos ON produtos.id_produto = compras.id_produto_pro\n" +
                    "ORDER BY data_compra DESC";
            ps = (PreparedStatement) con.prepareStatement(query);
            ResultSet tr = ps.executeQuery();
            Mercado m;
            while (tr.next()) {                
                m = new Mercado();
                m.setId_compra(tr.getInt("id_compra"));
                m.setNome(tr.getString("nome"));
                m.setProdutos(tr.getString("produtos"));
                m.setQuantidade_compras(tr.getInt("quantidade_compras"));
                m.setValor_unitario(tr.getFloat("valor_unitario"));
                m.setData_compra(tr.getDate("data_compra").toLocalDate());
                
                compras.add(m);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }
        return compras;
    }
    
    public void deletarCompras(Mercado m) throws Exception{
        abrirBanco();
        String query = "DELETE FROM compras WHERE id_compra=?";
        ps = (PreparedStatement) con.prepareStatement(query);
        ps.setInt(1, m.getId_compra());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Compra deletada com sucesso!");
        fecharBanco();
    }
    
}
