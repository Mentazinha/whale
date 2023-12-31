/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.whale.view;

     import java.awt.Dimension;
     import javax.swing.JOptionPane;
     import javax.swing.table.DefaultTableModel;
     import java.sql.ResultSet;
     import javax.swing.JTextArea;
     import javax.swing.JTextField;
     import br.com.whale.dto.AdmDTO;
     import br.com.whale.ctr.AdmCTR;
/**
 *
 * @author Aluno
 */
public class SignUpVIEW extends javax.swing.JInternalFrame {
    AdmDTO admDTO = new AdmDTO();
    AdmCTR admCTR = new AdmCTR();
    
    ResultSet rs;
    int gravar_alterar;
    DefaultTableModel modelo_jtl_consultar_car;

    /**
     * Creates new form SignUpVIEW
     */
    public SignUpVIEW() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        se_nha = new javax.swing.JLabel();
        No_me = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        btnExcluirSignUp = new javax.swing.JButton();
        btnVoltarSignUp = new javax.swing.JButton();
        senha = new javax.swing.JPasswordField();
        ema_il1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        se_nha.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        se_nha.setText("Senha:");

        No_me.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        No_me.setText("Nome:");

        btnCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_whale/view/imagens/novo.png"))); // NOI18N
        btnCadastro.setText("Cadastrar-se");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnExcluirSignUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluirSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_whale/view/imagens/excluir.png"))); // NOI18N
        btnExcluirSignUp.setText("Excluir");
        btnExcluirSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirSignUpActionPerformed(evt);
            }
        });

        btnVoltarSignUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltarSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_whale/view/imagens/prod_add.png"))); // NOI18N
        btnVoltarSignUp.setText("Voltar");
        btnVoltarSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarSignUpActionPerformed(evt);
            }
        });

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        ema_il1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ema_il1.setText("Email:");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(No_me)
                            .addComponent(ema_il1)
                            .addComponent(se_nha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(btnExcluirSignUp)
                        .addGap(79, 79, 79)
                        .addComponent(btnVoltarSignUp)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No_me)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ema_il1)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(se_nha)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
       gravar();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnExcluirSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirSignUpActionPerformed
        excluir();
    }//GEN-LAST:event_btnExcluirSignUpActionPerformed

    private void btnVoltarSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarSignUpActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnVoltarSignUpActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void gravar(){
        try{
             
            admDTO.setEmail(email.getText());
            
            admDTO.setNome(nome.getText());
            
            admDTO.setSenha(String.valueOf(senha.getPassword())); 
            
            JOptionPane.showMessageDialog(null, admCTR.inserirAdm(admDTO));
        }
        catch(Exception e){
            System.out.println("Erro ao gravar" + e.getMessage());
        }
    }
    
    private void alterar(){
        try{
             
            admDTO.setEmail(email.getText());
            
            admDTO.setNome(nome.getText());
             
            admDTO.setSenha(senha.getPassword().toString()); 
            
            JOptionPane.showMessageDialog(null, admCTR.alterarAdm(admDTO));
        }
        catch(Exception e){
            System.out.println("Erro ao gravar" + e.getMessage());
        }
    }
    
     private void excluir(){
        try{
             
            admDTO.setEmail(email.getText());
            
            admDTO.setNome(nome.getText());
             
            admDTO.setSenha(senha.getPassword().toString()); 
            
            JOptionPane.showMessageDialog(null, admCTR.excluirAdm(admDTO));
        }
        catch(Exception e){
            System.out.println("Erro ao gravar" + e.getMessage());
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel No_me;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnExcluirSignUp;
    private javax.swing.JButton btnVoltarSignUp;
    private javax.swing.JLabel ema_il1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel se_nha;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
