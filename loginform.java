/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package indonesiasehat;
import CRUD.*;
import Data_siswa.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

/**
 *
 * @author 62859
 */
public class loginform extends javax.swing.JFrame {
      private PreparedStatement st;
      private ResultSet rs;
      koneksiDb kon = new koneksiDb();
    
    public loginform() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JLabel();
        txtuser = new javax.swing.JLabel();
        jTextusername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INDONESIA SEHAT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 252, -1));

        txtpassword.setText("Password");
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 74, -1));

        txtuser.setText("Username");
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 74, -1));

        jTextusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextusernameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 125, -1));
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 125, -1));

        btnLogin.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 120, -1));

        btnBatal.setBackground(new java.awt.Color(102, 102, 255));
        btnBatal.setText("Daftar");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\62859\\Downloads\\blurred-abstract-background-interior-view-looking-out-toward-empty-office-lobby-entrance-doors-glass-curtain-wall-with-frame.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
           Connection cn = CRUD.Koneksi.Koneksi();
        try {
            Statement st = cn.createStatement();
            String sql = "SELECT * FROM user where username ='"+jTextusername.getText()+"' and password = '"+jPassword.getText()+"'";
            rs = st.executeQuery(sql);
            if(rs.next()){
                if(rs.getString("level").equals("admin")){
                    admin ds = new admin();
                    ds.show();
                    this.dispose();
                    }else if(rs.getString("level").equals("Masyarakat")){
                       userform us = new userform();
                        us.show();
                    this.dispose();

                    }
                    }else{
                    JOptionPane.showMessageDialog(null,"Maafpassword atau username anda salah");
                        jTextusername.setText("");
                        jPassword.setText("");
                        jTextusername.requestFocus();
                    }
                    }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jTextusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextusernameActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        daftar dr = new daftar();
        dr.show();
        this.dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextusername;
    private javax.swing.JLabel txtpassword;
    private javax.swing.JLabel txtuser;
    // End of variables declaration//GEN-END:variables
}
