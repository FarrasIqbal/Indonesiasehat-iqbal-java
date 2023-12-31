/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package indonesiasehat;

import CRUD.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 62859
 */
public class admin extends javax.swing.JFrame {
    
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = CRUD.Koneksi.Koneksi();
    
    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        judul();
        tampilData("");
        
        
        btnHapus.setEnabled(false);
        btnUpdate.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nik = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jk = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSiswa = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        notelp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jv = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DASHBOARD ADMIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 193, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("NIS");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 50, 88, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nama");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 84, 88, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 230, 88, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Jenis Kelamin");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 160, 88, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Alamat");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 250, 88, -1));

        nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nikActionPerformed(evt);
            }
        });
        jPanel1.add(nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 50, 254, -1));
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 84, 254, -1));

        jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        jk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkActionPerformed(evt);
            }
        });
        jPanel1.add(jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 160, 254, -1));

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 250, 254, 127));

        tableSiswa.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tableSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSiswa);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 6, 625, -1));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 406, 96, -1));

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 406, 93, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 446, 93, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 446, 96, -1));

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("No.Telepon");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 118, 88, -1));
        jPanel1.add(notelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 118, 254, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Jenis vaksin");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 200, 88, -1));

        jv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinovac", "AstraZeneca", "Moderna", "Sinopharm", "Pfizer" }));
        jv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvActionPerformed(evt);
            }
        });
        jPanel1.add(jv, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 200, 254, -1));

        jButton1.setBackground(new java.awt.Color(51, 215, 2));
        jButton1.setText("R");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 38, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\62859\\Downloads\\blurred-abstract-background-interior-view-looking-out-toward-empty-office-lobby-entrance-doors-glass-curtain-wall-with-frame.jpg")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        loginform fl = new loginform();
        fl.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
            st = cn.createStatement();
            st.executeUpdate("UPDATE daftarvaksin set "
                +"nama='" + nama.getText()+ "', "
                +"notelp='" + notelp.getText()+ "', "
                +"jv='" + jv.getSelectedItem()+"', "
                +"jk='" + jk.getSelectedItem()+"', "
                +"alamat='"+ alamat.getText()+"' where "+ "nik='"+nik.getText()+"'");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Update Berhasil");
            reset();

        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try{
            int jawab;

            if((jawab = JOptionPane.showConfirmDialog(null, "Ingin Menghapus Data?",
                "Konfirmasi", JOptionPane.YES_NO_OPTION))==0){
        st = cn.createStatement();
        st.executeUpdate("DELETE FROM daftarvaksin WHERE nik='"
            +tabModel.getValueAt(tableSiswa.getSelectedRow(), 0) + "'");
        tampilData("");
        reset();
        }

        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try
        {
            String sql="INSERT INTO daftarvaksin VALUES ('"+nik.getText()+"','"+
            nama.getText()+"','"+
            notelp.getText()+"','"+
            jv.getSelectedItem()+"','"+
            jk.getSelectedItem()+"','"+
            alamat.getText()+"')";
            java.sql.Connection conn=(Connection)Koneksi.Koneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            tampilData("");
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tableSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSiswaMouseClicked
        // TODO add your handling code here:
        nik.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(),0).toString());
        nama.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(),1).toString());
        notelp.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(),2).toString());
        jk.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(),3).toString());
        jv.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(),4).toString());
        alamat.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(),5).toString());
        btnSimpan.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnHapus.setEnabled(true);
        nik.setEnabled(false);
    }//GEN-LAST:event_tableSiswaMouseClicked

    private void jkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkActionPerformed

    private void nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nikActionPerformed

    private void jvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)tableSiswa.getModel();
        model.setRowCount(0);
        tampilData("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }
    
    public void judul(){
        Object[] judul = {
          "Nik","Nama","No.Telepon","JK","Jenis Vaksin","alamat"  
        
        };
        tabModel = new DefaultTableModel(null,judul);
        tableSiswa.setModel(tabModel);
    
    }
    
    public void tampilData(String where){
      try{
          st = cn.createStatement();
          tabModel.getDataVector().removeAllElements();
          tabModel.fireTableDataChanged();
          rs = st.executeQuery("SELECT * FROM daftarvaksin" + where);
          
          while (rs.next()){
              Object[] data = {
                  rs.getString("nik"),
                  rs.getString("nama"),
                  rs.getString("notelp"),
                  rs.getString("jk"),
                  rs.getString("jv"),
                  rs.getString("alamat"),
              };
              tabModel.addRow(data);
          }
      }catch(Exception e){
          e.printStackTrace();
      }
      
    
    }
    
    public void reset(){
        nik.setText("");
        nama.setText("");
        notelp.setText("");
        jk.setSelectedItem("");
        jv.setSelectedItem("");
        alamat.setText("");
        btnSimpan.setEnabled(true);
        nik.setEnabled(true);
        btnHapus.setEnabled(false);
        btnUpdate.setEnabled(false);
    
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jk;
    private javax.swing.JComboBox<String> jv;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JTextField notelp;
    private javax.swing.JTable tableSiswa;
    // End of variables declaration//GEN-END:variables
}
