
package br.com.whale.ctr;

import java.sql.ResultSet;
import br.com.whale.dto.AdmDTO;
import br.com.whale.dao.AdmDAO;
import br.com.whale.dao.ConexaoDAO;
public class AdmCTR {
    
    AdmDAO admDAO = new AdmDAO();
    
    public AdmCTR(){
        
    }
    public String inserirAdm (AdmDTO admDTO) {
        try{
            if (admDAO.inserirAdm(admDTO)) {
                return "Adm cadastrado com sucesso";
            } else {
                return "Adm não cadastrado";
            }
         }

       catch (Exception e) {
           System.out.println(e.getMessage());
           return "Adm não cadastrado";
       } 
    }

      public String alterarAdm (AdmDTO admDTO) {
        try{
            if (admDAO.alterarAdm(admDTO)) {
                return "Adm alterado com sucesso";
            } else {
                return "Adm não alterado";
            }
         }

       catch (Exception e) {
           System.out.println(e.getMessage());
           return "Adm não alterado";
       } 
    }

       public String excluirAdm (AdmDTO admDTO) {
        try{
            if (admDAO.excluirAdm(admDTO)) {
                return "Adm excluído com sucesso";
            } else {
                return "Adm não excluído";
            }
         }

       catch (Exception e) {
           System.out.println(e.getMessage());
           return "Adm não excluído";
       } 
    }

           
    public int logarAdm(AdmDTO admDTO) {
        
        return admDAO.logarAdm(admDTO);

    }//Fecha o método logarAdm
           
           
        
    }
    

