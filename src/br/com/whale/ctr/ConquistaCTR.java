/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.whale.ctr;
import java.sql.ResultSet;
import br.com.whale.dao.ConexaoDAO;
import br.com.whale.dto.ConquistaDTO;
import br.com.whale.dao.ConquistaDAO;
/**
 *
 * @author Aluno
 */
public class ConquistaCTR {
     ConquistaDAO conquistaDAO = new ConquistaDAO();
    
    public ConquistaCTR(){
        
    }
        public String inserirConquista (ConquistaDTO conquistaDTO) {
            try{
                if (conquistaDAO.inserirConquista(conquistaDTO)) {
                    return "Conquista cadastrado com sucesso";
                } else {
                    return "Conquista não cadastrado";
                }
             }
            
           catch (Exception e) {
               System.out.println(e.getMessage());
               return "Conquista não cadastrado";
           } 
        }
        
          public String alterarConquista (ConquistaDTO conquistaDTO) {
            try{
                if (conquistaDAO.alterarConquista(conquistaDTO)) {
                    return "Conquista alterado com sucesso";
                } else {
                    return "Conquista não alterado";
                }
             }
            
           catch (Exception e) {
               System.out.println(e.getMessage());
               return "Conquista não alterado";
           } 
        }
          
           public String excluirConquista (ConquistaDTO conquistaDTO) {
            try{
                if (conquistaDAO.excluirConquista(conquistaDTO)) {
                    return "Conquista excluído com sucesso";
                } else {
                    return "Conquista não excluído";
                }
             }
            
           catch (Exception e) {
               System.out.println(e.getMessage());
               return "Conquista não excluído";
           } 
        }
           
           public ResultSet consultarConquista(ConquistaDTO conquistaDTO, int opcao) {
               ResultSet rs = null;
               
               rs = conquistaDAO.consultarConquista(conquistaDTO, opcao);
               
               return rs;
           }
            
           public void CloseDB(){
               ConexaoDAO.CloseDB();
           }
 
        
}
