
package br.com.whale.dao;


import br.com.whale.dto.ConquistaDTO;
import java.sql.*;


public class ConquistaDAO {
     public ConquistaDAO() {
    }

    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    
      
    /**
     * Método utilizado para inserir um objeto PessoaDTO no banco de dados
     *
     * @param conquistaDTO que vem da classe PessoaCTR
     * @return Um boolean 
     */
    
    
     public boolean inserirConquista(ConquistaDTO conquistaDTO) {
        try {
            
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Insert into Conquista (nomeConquista, codConquista. )"
                    + "values ("
                    + "'" + conquistaDTO.getNomeConquista() + "', " 
                    + "'" + conquistaDTO.getCodConquista() + "', ";
           stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            rs.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println("Erro ConquistaDAO" + e.getMessage());
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
     * @param pessoaDTO que vem da classe PessoaCTR
     * @return Um boolean 
     */
    public boolean alterarConquista(ConquistaDTO conquistaDTO) {
        String comando = "";
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            comando = "Update conquista set "
                    + "Nome ='" + conquistaDTO.getNomeConquista() + "', "
                    + " where codConquista =" + conquistaDTO.getCodConquista() + "', ";
                   
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println("Erro ConquistaDAO" +e.getMessage());
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
     * @param ConquistaDTO que vem da classe PessoaCTR
     * @return Um boolean 
     */
    public boolean excluirConquista(ConquistaDTO conquistaDTO) {
        try {
            String comando = "";
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            
            comando = "Delete from Conquista "+
                      "where codConquista = " + conquistaDTO.getCodConquista();
            
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
    
    public ResultSet consultarConquista(ConquistaDTO conquistaDTO, int opcao) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "";
            switch (opcao) {
                case 1:
                    comando = "Select a.* "
                            + "from conquista a "
                            + "where name like '" + conquistaDTO.getNomeConquista() + "%' "
                            + "order by a.name";

                    break;
                case 2:
                    comando = "Select a.* "
                            + "from conquista a "
                            + "where a.codconquista = " + conquistaDTO.getCodConquista();
                    break;
                case 3:
                    comando = "Select a.Codconquista, a.name "
                            + "from conquista a ";
                    break;

            }
            //Executa o comando SQL no banco de Dados
            rs = stmt.executeQuery(comando);
            return rs;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }
}
