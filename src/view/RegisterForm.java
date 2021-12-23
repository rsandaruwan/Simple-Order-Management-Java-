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
public class RegisterForm extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public RegisterForm() {
        initComponents();
        
        //connect to DB
        
        con = DBconnection.connect();
       
    }
    
    public void ClearText(){
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Nic = new javax.swing.JTextField();
        Mobile = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        Birth = new javax.swing.JTextField();
        RegisterBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ProfilePic = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(19, 79, 92));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(19, 79, 92));

        jPanel2.setBackground(new java.awt.Color(162, 196, 201));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(95, 158, 160));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(19, 79, 92));
        jLabel5.setText("Full Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel6.setBackground(new java.awt.Color(95, 158, 160));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(19, 79, 92));
        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jLabel7.setBackground(new java.awt.Color(95, 158, 160));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(19, 79, 92));
        jLabel7.setText("Date of Birth");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel8.setBackground(new java.awt.Color(95, 158, 160));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(19, 79, 92));
        jLabel8.setText("Mobile");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        jLabel9.setBackground(new java.awt.Color(95, 158, 160));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(19, 79, 92));
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, 30));

        jLabel10.setBackground(new java.awt.Color(95, 158, 160));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(19, 79, 92));
        jLabel10.setText("NIC");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, 20));
        jPanel2.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 213, 29));
        jPanel2.add(Nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 213, 29));
        jPanel2.add(Mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 213, 29));
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 213, 29));
        jPanel2.add(Birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 213, 29));

        RegisterBtn.setBackground(new java.awt.Color(19, 79, 92));
        RegisterBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        RegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBtn.setText("Register");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });
        jPanel2.add(RegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 120, 33));

        jLabel11.setBackground(new java.awt.Color(95, 158, 160));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(19, 79, 92));
        jLabel11.setText("Sign out");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 32, -1, -1));

        ProfilePic.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru\\Downloads\\285645_user_icon.png")); // NOI18N
        ProfilePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfilePicMouseClicked(evt);
            }
        });
        jPanel2.add(ProfilePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 15, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru\\Downloads\\1156709_bbb_finance_logo_icon (1).png")); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 15, 160, -1));
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 213, 29));

        jLabel13.setBackground(new java.awt.Color(95, 158, 160));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(19, 79, 92));
        jLabel13.setText("Register Form");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

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

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru\\Downloads\\WhatsApp Image 2021-08-17 at 8.02.40 PM.jpeg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 590));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        String name = Name.getText();
        String email = Email.getText();
        String birth = Birth.getText();
        String mobile = Mobile.getText();
        String nic = Nic.getText();
        String password = Password.getText();
        
        try {
            String insert = "INSERT INTO customer (Name, Email,Birth,Mobile,Nic,Password) values ('"+name+"','"+email+"','"+birth+"','"+mobile+"','"+nic+"','"+password+"')";
            pst = con.prepareStatement(insert);
            pst.execute();
            
            JOptionPane.showMessageDialog(this, "Customer Added Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        ClearText();
        
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void ProfilePicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfilePicMouseClicked
        Myprofile mp = new Myprofile();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProfilePicMouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        Dashboard op = new Dashboard();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Birth;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Mobile;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Nic;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel ProfilePic;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
