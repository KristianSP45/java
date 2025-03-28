/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sousa
 */
public class DAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public void abrirBanco() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/java_mercado";
            String user = "root";
            String pass = "";
            con=(Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("Conectado ao banco de dados");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe nã encontrada, adicione o drive nas bibliotecas.");
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
    
    public void fecharBanco() throws Exception{
        if (ps!= null) {
            ps.close();
            System.out.println("Execução da query fechada");
        }
    }
}
