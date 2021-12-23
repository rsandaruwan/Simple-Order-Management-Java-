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
public class OrderProfile extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public OrderProfile() {
        initComponents();
        
        con = DBconnection.connect();
        TableLoad();
    }
    
     public void TableLoad(){
        try {
            String sql = "Select Oid,VccType,OrdDate,SuppCom,Amount,Price,status,DeliDate from orderManage";
            pst = con.prepareStatement(sql);
            
             rs = pst.executeQuery();
            
            orderTbl.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            
        }
    }

   public void ClearText(){
        
        
        
       Id.setText("No");
       VccType.setText("*");
       OrdDate.setText("*");
       Price.setText("*");
       Amount.setText("*"); 
       SuppCom.setText("*");
        
}
   
   public void billView(){
       BillTxt.setText(BillTxt.getText()+"============Delivary Status============\n\n"+"Vaccine type -     " +VccType.getText().toString()+"\n"+"Order Date -      " +OrdDate.getText().toString()+"\n"+"Supplier Company - " +SuppCom.getText().toString()+"\n"+"Amount -           " +Amount.getText().toString()+"\n"+"Price -          " +Price.getText().toString()+"\n" +"Delivary Date -       " +DeliDate.getText().toString()+"\n" +"Status -            "+Status.getSelectedItem().toString()+"\n");
        
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        SuppCom = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTbl = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        OrdDate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        VccType = new javax.swing.JLabel();
        UpdateBtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        DeliDate = new javax.swing.JTextField();
        UpdateBtn2 = new javax.swing.JButton();
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
        jLabel3.setText("Order Profile");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        SuppCom.setBackground(new java.awt.Color(95, 158, 160));
        SuppCom.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SuppCom.setForeground(new java.awt.Color(19, 79, 92));
        SuppCom.setText("*");
        jPanel2.add(SuppCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        UpdateBtn.setBackground(new java.awt.Color(19, 79, 92));
        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 110, 33));

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

        Id.setBackground(new java.awt.Color(95, 158, 160));
        Id.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Id.setForeground(new java.awt.Color(19, 79, 92));
        Id.setText("No");
        jPanel2.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        DeleteBtn.setBackground(new java.awt.Color(19, 79, 92));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 110, 33));

        orderTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        orderTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderTbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 140));

        jLabel17.setBackground(new java.awt.Color(95, 158, 160));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(19, 79, 92));
        jLabel17.setText("Vaccing Type     =");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel18.setBackground(new java.awt.Color(95, 158, 160));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(19, 79, 92));
        jLabel18.setText("Order Date        =");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel15.setBackground(new java.awt.Color(95, 158, 160));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(19, 79, 92));
        jLabel15.setText("Supply company=");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel14.setBackground(new java.awt.Color(95, 158, 160));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(19, 79, 92));
        jLabel14.setText("Amount             =");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel19.setBackground(new java.awt.Color(95, 158, 160));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(19, 79, 92));
        jLabel19.setText("Price                  =");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Processing", "On The way", "Delivered" }));
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });
        jPanel2.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 210, 30));

        jLabel20.setBackground(new java.awt.Color(95, 158, 160));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(19, 79, 92));
        jLabel20.setText("Delivary Date");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        OrdDate.setBackground(new java.awt.Color(95, 158, 160));
        OrdDate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        OrdDate.setForeground(new java.awt.Color(19, 79, 92));
        OrdDate.setText("*");
        jPanel2.add(OrdDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel7.setBackground(new java.awt.Color(95, 158, 160));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(19, 79, 92));
        jLabel7.setText("Edit");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        Amount.setBackground(new java.awt.Color(95, 158, 160));
        Amount.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Amount.setForeground(new java.awt.Color(19, 79, 92));
        Amount.setText("*");
        jPanel2.add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        Price.setBackground(new java.awt.Color(95, 158, 160));
        Price.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Price.setForeground(new java.awt.Color(19, 79, 92));
        Price.setText("*");
        jPanel2.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        VccType.setBackground(new java.awt.Color(95, 158, 160));
        VccType.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        VccType.setForeground(new java.awt.Color(19, 79, 92));
        VccType.setText("*");
        jPanel2.add(VccType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        UpdateBtn1.setBackground(new java.awt.Color(19, 79, 92));
        UpdateBtn1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        UpdateBtn1.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn1.setText("Print");
        UpdateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 110, 33));

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 300, 150));

        jLabel21.setBackground(new java.awt.Color(95, 158, 160));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(19, 79, 92));
        jLabel21.setText("Status");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));
        jPanel2.add(DeliDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 213, 29));

        UpdateBtn2.setBackground(new java.awt.Color(19, 79, 92));
        UpdateBtn2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        UpdateBtn2.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn2.setText("<  Back");
        UpdateBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 110, 33));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru\\Downloads\\WhatsApp Image 2021-08-17 at 8.02.40 PM.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 580));

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

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
                int x =  JOptionPane.showConfirmDialog(null, "Do you want to Delete Order");
        
                if(x == 0){
                        String id = Id.getText();
                        String sql = "Delete from orderManage where Oid ='"+id+"'";
            
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

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
                int x =  JOptionPane.showConfirmDialog(null, "Do you want to update Order");
        
                if (x == 0){
            
                        String id = Id.getText();
                        String vccType = VccType.getText();
                        String ordDate = OrdDate.getText();
                        String supCom = SuppCom.getText();
                        String amount = Amount.getText();
                        String price = Price.getText();
                        
                        String status = Status.getSelectedItem().toString();
                        String delDate = DeliDate.getText();
            
                        String sql = "Update orderManage set VccType = '"+vccType+"',OrdDate = '"+ordDate+"', SuppCom = '"+supCom+"',Amount = '"+amount+"',Price = '"+price+"',Status = '"+status+"',DeliDate = '"+delDate+"' where Oid = '"+id+"' ";
                        try {
                                pst = con.prepareStatement(sql);
                                pst.execute();
                            } catch (Exception e) {
                            }
            
                        TableLoad();
//                        ClearText();
                        billView();

                    }
                
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    private void UpdateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn1ActionPerformed
        try{
            BillTxt.print();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_UpdateBtn1ActionPerformed

    private void orderTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTblMouseClicked
        int r = orderTbl.getSelectedRow();

        String id = orderTbl.getValueAt(r, 0).toString();
        String vccType = orderTbl.getValueAt(r, 1).toString();
        String ordDate = orderTbl.getValueAt(r, 2).toString();
        String supCom = orderTbl.getValueAt(r, 3).toString();
        String amount = orderTbl.getValueAt(r, 4).toString();
        String price = orderTbl.getValueAt(r, 5).toString();
        String status = orderTbl.getValueAt(r, 6).toString();
        String deliDate = orderTbl.getValueAt(r, 7).toString();

        VccType.setText(vccType);
        OrdDate.setText(ordDate);
        SuppCom.setText(supCom);
        Amount.setText(amount);
        Price.setText(price);
        Status.setSelectedItem(status);
        DeliDate.setText(deliDate);

        Id.setText(id);

        //       billView();
    }//GEN-LAST:event_orderTblMouseClicked

    private void UpdateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn2ActionPerformed
        Dashboard op = new Dashboard();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdateBtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(OrderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField DeliDate;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel OrdDate;
    private javax.swing.JLabel Price;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JLabel SuppCom;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton UpdateBtn1;
    private javax.swing.JButton UpdateBtn2;
    private javax.swing.JLabel VccType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout;
    private javax.swing.JTable orderTbl;
    // End of variables declaration//GEN-END:variables
}
