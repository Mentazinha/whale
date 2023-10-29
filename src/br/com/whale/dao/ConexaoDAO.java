package br.com.whale.dao;

import java.sql.*;

public class ConexaoDAO {
    
    public static Connection con = null;
    
    public ConexaoDAO() {    
    }
 
    public static void ConectDB() {
        try {
            String dsn = "whale";
            String user = "root";
            String senha = "mydba";
            
            
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        
            
            String url = "jdbc:mysql://localhost:3306/" + dsn;
            
            
            con = DriverManager.getConnection(url, user, senha);
            
            con.setAutoCommit(false);
            if (con == null) {
                System.out.println("erro ao abrir o banco de dados Postgres");
            }
        }
        
        catch (Exception e){
            System.out.println("Problema ao abrir a base de dados!" +
                    e.getMessage());
        }
                
    }
    public static void CloseDB() {
        try {
            con.close();
        }
            catch (Exception e) {
                   System.out.println("erro ao fechar o banco de dados Postgres" +
                           e.getMessage());
                    }
        
    } 
}