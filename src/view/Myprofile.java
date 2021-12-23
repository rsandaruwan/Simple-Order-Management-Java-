/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DB.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author Isuru
 */
public class Myprofile extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Myprofile() {
        initComponents();
        
        //connect to DB
        
        con = DBconnection.connect();
        TableLoad();
    }
    
    public void TableLoad(){
        try {
            String sql = "Select Cid,Name,Email,Birth,Mobile,Nic,Password from customer";
            pst = con.prepareStatement(sql);
            
             rs = pst.executeQuery();
            
            ProfileTbl.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            
        }
    }

    public void ClearText(){
        Id.setText("");
        Name.setText("");
        Email.setText("");
        Birth.setText("");
        Mobile.setText("");
        Nic.setText("");
        Password.setText("");
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Birth = new javax.swing.JTextField();
        Nic = new javax.swing.JTextField();
        Mobile = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProfileTbl = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        UpdateBtn1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(95, 158, 160));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(19, 79, 92));

        jPanel2.setBackground(new java.awt.Color(162, 196, 201));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(95, 158, 160));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(19, 79, 92));
        jLabel3.setText("My Profile");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel5.setBackground(new java.awt.Color(95, 158, 160));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(19, 79, 92));
        jLabel5.setText("Edit");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabel6.setBackground(new java.awt.Color(95, 158, 160));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(19, 79, 92));
        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, 20));

        jLabel7.setBackground(new java.awt.Color(95, 158, 160));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(19, 79, 92));
        jLabel7.setText("Date of Birth");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel8.setBackground(new java.awt.Color(95, 158, 160));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(19, 79, 92));
        jLabel8.setText("Mobile");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jLabel9.setBackground(new java.awt.Color(95, 158, 160));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(19, 79, 92));
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        jLabel10.setBackground(new java.awt.Color(95, 158, 160));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(19, 79, 92));
        jLabel10.setText("NIC");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));
        jPanel2.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 213, 29));
        jPanel2.add(Birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 213, 29));
        jPanel2.add(Nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 213, 29));
        jPanel2.add(Mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 213, 29));
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 213, 29));
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 213, 29));

        UpdateBtn.setBackground(new java.awt.Color(19, 79, 92));
        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("<  Back");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 110, 33));

        logout.setBackground(new java.awt.Color(95, 158, 160));
        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(19, 79, 92));
        logout.setText("Sign out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 32, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru\\Downloads\\285645_user_icon.png")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 15, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru\\Downloads\\1156709_bbb_finance_logo_icon (1).png")); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, -1));

        ProfileTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Birth", "Mobile", "Nic", "Password"
            }
        ));
        ProfileTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProfileTbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 640, 100));

        jLabel14.setBackground(new java.awt.Color(95, 158, 160));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(19, 79, 92));
        jLabel14.setText("Full Name");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel13.setBackground(new java.awt.Color(95, 158, 160));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(19, 79, 92));
        jLabel13.setText("Full Name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel16.setBackground(new java.awt.Color(95, 158, 160));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(19, 79, 92));
        jLabel16.setText("Profile");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        Id.setBackground(new java.awt.Color(95, 158, 160));
        Id.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Id.setForeground(new java.awt.Color(19, 79, 92));
        Id.setText("No");
        jPanel2.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        DeleteBtn.setBackground(new java.awt.Color(19, 79, 92));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 110, 33));

        UpdateBtn1.setBackground(new java.awt.Color(19, 79, 92));
        UpdateBtn1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        UpdateBtn1.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn1.setText("Update");
        UpdateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 110, 33));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru\\Downloads\\WhatsApp Image 2021-08-17 at 8.02.40 PM.jpeg")); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 580));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("x");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void ProfileTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileTblMouseClicked
        int r = ProfileTbl.getSelectedRow();
        
        String id = ProfileTbl.getValueAt(r, 0).toString();
        String name = ProfileTbl.getValueAt(r, 1).toString();
        String email = ProfileTbl.getValueAt(r, 2).toString();
        String birth = ProfileTbl.getValueAt(r, 3).toString();
        String mobile = ProfileTbl.getValueAt(r, 4).toString();
        String nic = ProfileTbl.getValueAt(r, 5).toString();
        String password = ProfileTbl.getValueAt(r, 6).toString();
        
        Name.setText(name);
        Email.setText(email);
        Birth.setText(birth);
        Mobile.setText(mobile);
        Nic.setText(nic);
        Password.setText(password);
        
        Id.setText(id);
        
        
    }//GEN-LAST:event_ProfileTblMouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
       Dashboard op = new Dashboard();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        int x =  JOptionPane.showConfirmDialog(null, "Do you want to Delete profile");
        
        if(x == 0){
            String id = Id.getText();
            String sql = "Delete from customer where Cid ='"+id+"'";
            
            try {
                
                pst = con.prepareStatement(sql);
                pst.execute();
            } catch (Exception e) {
            }
        }
            TableLoad();
            ClearText();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void UpdateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn1ActionPerformed
         int x =  JOptionPane.showConfirmDialog(null, "Do you want to update Order");
        
                if (x == 0){
            
                        String id = Id.getText();
                        String name = Name.getText();
                        String email = Email.getText();
                        String birth = Birth.getText();
                        String mobile = Mobile.getText();
                        String nic = Nic.getText();
                        String password = Password.getText();
                        
                        
            
                        String sql = "Update customer set Name = '"+name+"',Email = '"+email+"', Birth = '"+birth+"',Mobile = '"+mobile+"',Nic = '"+nic+"',Password = '"+password+"' where Cid = '"+id+"' ";
                        try {
                                pst = con.prepareStatement(sql);
                                pst.execute();
                            } catch (Exception e) {
                            }
            
                        TableLoad();
                        ClearText();
                        

                    }
                
    }//GEN-LAST:event_UpdateBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Myprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Myprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Myprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Myprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Myprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Birth;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel Id;
    private javax.swing.JTextField Mobile;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Nic;
    private javax.swing.JTextField Password;
    private javax.swing.JTable ProfileTbl;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton UpdateBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    // End of variables declaration//GEN-END:variables
}
