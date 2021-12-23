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

/**
 *
 * @author Isuru
 */
public class OrderManagenemt extends javax.swing.JFrame {

     Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public void ClearText(){
  
        OrdDate.setText("");
        SuppCom.setText("");
        Amount.setText("");
        Price.setText("");
        
}
    
    public OrderManagenemt() {
        initComponents();
        
        con = DBconnection.connect();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AddOrd = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        SuppCom = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        OrdDate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        Status = new javax.swing.JComboBox<>();
        VccType = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        OrderList = new javax.swing.JButton();
        DeliDate = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(19, 79, 92));

        jPanel2.setBackground(new java.awt.Color(162, 196, 201));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(95, 158, 160));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(19, 79, 92));
        jLabel3.setText("Order Management");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        AddOrd.setBackground(new java.awt.Color(19, 79, 92));
        AddOrd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        AddOrd.setForeground(new java.awt.Color(255, 255, 255));
        AddOrd.setText("Add Order");
        AddOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrdActionPerformed(evt);
            }
        });
        jPanel2.add(AddOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 120, 33));

        jLabel11.setBackground(new java.awt.Color(95, 158, 160));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(19, 79, 92));
        jLabel11.setText("Sign out");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru\\Downloads\\285645_user_icon.png")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru\\Downloads\\1156709_bbb_finance_logo_icon (1).png")); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 15, 160, -1));

        jLabel14.setBackground(new java.awt.Color(95, 158, 160));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(19, 79, 92));
        jLabel14.setText("Amount");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));
        jPanel2.add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 213, 29));

        jLabel15.setBackground(new java.awt.Color(95, 158, 160));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(19, 79, 92));
        jLabel15.setText("Supply company");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel2.add(SuppCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 213, 29));

        jLabel16.setBackground(new java.awt.Color(95, 158, 160));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(19, 79, 92));
        jLabel16.setText("Order Date");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));
        jPanel2.add(OrdDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 213, 29));

        jLabel17.setBackground(new java.awt.Color(95, 158, 160));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(19, 79, 92));
        jLabel17.setText("Vaccing Type");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel18.setBackground(new java.awt.Color(95, 158, 160));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(19, 79, 92));
        jLabel18.setText("Delivary Status");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));
        jPanel2.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 213, 29));

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Processing" }));
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });
        jPanel2.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 210, 30));

        VccType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(VccType, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 210, 30));

        jLabel19.setBackground(new java.awt.Color(95, 158, 160));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(19, 79, 92));
        jLabel19.setText("Price");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        OrderList.setBackground(new java.awt.Color(19, 79, 92));
        OrderList.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        OrderList.setForeground(new java.awt.Color(255, 255, 255));
        OrderList.setText("Order List");
        OrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderListActionPerformed(evt);
            }
        });
        jPanel2.add(OrderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 120, 33));

        DeliDate.setText("null");
        jPanel2.add(DeliDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 213, 29));

        jLabel20.setBackground(new java.awt.Color(95, 158, 160));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(19, 79, 92));
        jLabel20.setText("Delivary Date");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

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

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru\\Downloads\\WhatsApp Image 2021-08-17 at 8.02.40 PM.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 580));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrdActionPerformed
        String vccType = VccType.getSelectedItem().toString();
        String ordDate = OrdDate.getText();
        String supCom = SuppCom.getText();
        String amount = Amount.getText();
        String price = Price.getText();
        String delDate = DeliDate.getText();
        String status = Status.getSelectedItem().toString();
        
        
        try {
            String insert = "INSERT INTO orderManage (VccType, OrdDate,SuppCom,Amount,Price,DeliDate,status) values ('"+vccType+"','"+ordDate+"','"+supCom+"','"+amount+"','"+price+"','"+delDate+"','"+status+"')";
            pst = con.prepareStatement(insert);
            pst.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        ClearText();
    }//GEN-LAST:event_AddOrdActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    private void OrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderListActionPerformed
        OrderProfile op = new OrderProfile();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OrderListActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        Dashboard op = new Dashboard();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(OrderManagenemt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderManagenemt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderManagenemt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderManagenemt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderManagenemt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrd;
    private javax.swing.JTextField Amount;
    private javax.swing.JTextField DeliDate;
    private javax.swing.JTextField OrdDate;
    private javax.swing.JButton OrderList;
    private javax.swing.JTextField Price;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JTextField SuppCom;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JComboBox<String> VccType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
