/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.whale.dao;

import br.com.whale.dto.AdmDTO;
import java.sql.*;
/**
 *
 * @author Aluno
 */
public class AdmDAO {
   /**
     * Método construtor da classe
     */
    public AdmDAO() {
    }

    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    
      
    /**
     * Método utilizado para inserir um objeto PessoaDTO no banco de dados
     *
     * @param admDTO que vem da classe PessoaCTR
     * @return Um boolean 
     */
    
    
     public boolean inserirAdm(AdmDTO admDTO) {
        String comando = "";
        try {
            
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            comando = "Insert into Adm (nome, email,senha )"
                    + "values ("
                    + "'" + admDTO.getNome() + "', "
                    + "'" + admDTO.getEmail() + "', "
                    + "'" + admDTO.getSenha() + "')";
           stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println("Erro AdmDAO" + e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método inserirPessoa
    
    
    /**
     * Método utilizado para alterar um objeto PessoaDTO no banco de dados
     *
     * @param AdmDTO que vem da classe PessoaCTR
     * @return Um boolean 
     */
    public boolean alterarAdm(AdmDTO admDTO) {
        String comando = "";
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            comando = "Update adm set "
                    + "nome = '" + admDTO.getNome() + "', "
                    + "email = '" + admDTO.getEmail() + "', ";
                   
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println("Erro AdmDAO" +e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método aletarPessoa

   
    /**
     * Método utilizado para excluir um objeto PessoaDTO no banco de dados
     *
     * @param AdmDTO que vem da classe PessoaCTR
     * @return Um boolean 
     */
    public boolean excluirAdm(AdmDTO admDTO) {
        try {
            String comando = "";
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            
            comando = "Delete from Adm "+
                      "where codadm = " + admDTO.getCodadm();
            
            stmt.execute(comando);
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método excluirPessoa 
    
    
    public int logarAdm(AdmDTO admDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Select a.id " +
                             "from Adm a " + 
                             "where a.email = '" + admDTO.getEmail()+ "'" +
                             " and a.senha = '" + admDTO.getSenha() + "'";

            //Executa o comando SQL no banco de Dados
            rs = null;
            rs = stmt.executeQuery(comando);
            if(rs.next()){
                return rs.getInt("id");
            }
            else{
                return 0;
            }
                
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método logarAdm
    
    
    
    
    
}
