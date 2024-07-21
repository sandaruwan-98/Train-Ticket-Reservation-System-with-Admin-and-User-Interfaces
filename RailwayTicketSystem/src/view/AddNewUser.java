/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nipun sandaruwan
 */
public class AddNewUser extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public AddNewUser() throws SQLException {
        initComponents();
        connect();
        shoowbtn.setVisible(true);
        Hidebtn.setVisible(false);
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs; 
    
    
    public void connect() throws SQLException
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddTrain.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        AdUserBtn = new javax.swing.JButton();
        Resetbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ContactTxt = new javax.swing.JTextField();
        AgeTxt = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTxt = new javax.swing.JTextArea();
        maleRBtn = new javax.swing.JRadioButton();
        femaleRBtn = new javax.swing.JRadioButton();
        Hidebtn = new javax.swing.JButton();
        shoowbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));

        AdUserBtn.setBackground(new java.awt.Color(0, 0, 0));
        AdUserBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AdUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        AdUserBtn.setText("Add User");
        AdUserBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        AdUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdUserBtnActionPerformed(evt);
            }
        });

        Resetbtn.setBackground(new java.awt.Color(0, 0, 0));
        Resetbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        Resetbtn.setText("Reset");
        Resetbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(0, 0, 0));
        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("Cancel");
        exitbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Full Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contact No");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Age");

        ContactTxt.setBackground(new java.awt.Color(0, 0, 0));
        ContactTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ContactTxt.setForeground(new java.awt.Color(255, 255, 255));
        ContactTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));

        AgeTxt.setBackground(new java.awt.Color(0, 0, 0));
        AgeTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AgeTxt.setForeground(new java.awt.Color(255, 255, 255));
        AgeTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));

        fname.setBackground(new java.awt.Color(0, 0, 0));
        fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 2, true));

        AddressTxt.setBackground(new java.awt.Color(0, 0, 0));
        AddressTxt.setColumns(20);
        AddressTxt.setForeground(new java.awt.Color(255, 255, 255));
        AddressTxt.setRows(5);
        AddressTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        jScrollPane1.setViewportView(AddressTxt);

        maleRBtn.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(maleRBtn);
        maleRBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maleRBtn.setForeground(new java.awt.Color(255, 255, 255));
        maleRBtn.setText("Male");

        femaleRBtn.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(femaleRBtn);
        femaleRBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        femaleRBtn.setForeground(new java.awt.Color(255, 255, 255));
        femaleRBtn.setText("Female");

        Hidebtn.setBackground(new java.awt.Color(0, 0, 0));
        Hidebtn.setForeground(new java.awt.Color(255, 255, 255));
        Hidebtn.setText("Hide");
        Hidebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        Hidebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HidebtnActionPerformed(evt);
            }
        });

        shoowbtn.setBackground(new java.awt.Color(0, 0, 0));
        shoowbtn.setForeground(new java.awt.Color(255, 255, 255));
        shoowbtn.setText("show");
        shoowbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        shoowbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoowbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(641, Short.MAX_VALUE)
                .addComponent(AdUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fname)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(maleRBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(femaleRBtn))
                                .addComponent(ContactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(Hidebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shoowbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(877, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleRBtn)
                    .addComponent(femaleRBtn))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shoowbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hidebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(598, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1040, 690));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Add New User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jPasswordField1.setText("");
        fname.setText("");
        AddressTxt.setText("");
        ContactTxt.setText("");
        AgeTxt.setText("");
        maleRBtn.setSelected(true);
    }//GEN-LAST:event_ResetbtnActionPerformed

    private void AdUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdUserBtnActionPerformed
        // TODO add your handling code here:
        String fullname=fname.getText();
        String address=AddressTxt.getText();
        String phoneNo=ContactTxt.getText();
        String age=AgeTxt.getText();
        String uname=jTextField1.getText();
        String upassworde=jPasswordField1.getText();
/////Radio button seclection //////////////////////////////////////////
        String gender = null;
             if(maleRBtn.isSelected()){
                      gender = "Male";
         
            }else if (femaleRBtn.isSelected()){
                      gender = "Female";
                    }
/////////////////////////////////////////////////////////////////////////        
        try {
            pst=con.prepareStatement("INSERT INTO  userlogin(fullname,address,contactno,age,gender,username,password) VALUES(?,?,?,?,?,?,?)");
            
            pst.setString(1, fullname);
            pst.setString(2, address);
            pst.setString(3, phoneNo);
            pst.setString(4, age);
            pst.setString(5, gender);
            pst.setString(6, uname);
            pst.setString(7, upassworde);
            

            
            int k=pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(null,"Record Added to the Database!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Insertion failed!!");
            }
            
        jTextField1.setText("");
        jPasswordField1.setText("");
        fname.setText("");
        AddressTxt.setText("");
        ContactTxt.setText("");
        AgeTxt.setText("");
        maleRBtn.setSelected(true);
            
            
        } catch (Exception e) {
            Logger.getLogger(AddTrain.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_AdUserBtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void shoowbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoowbtnActionPerformed
        // TODO add your handling code here:
        
        
        jPasswordField1.setEchoChar((char)0);
        shoowbtn.setVisible(false);
        Hidebtn.setVisible(true);
    }//GEN-LAST:event_shoowbtnActionPerformed

    private void HidebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HidebtnActionPerformed
        // TODO add your handling code here:
        
        jPasswordField1.setEchoChar('*');
        shoowbtn.setVisible(true);
         Hidebtn.setVisible(false);
    }//GEN-LAST:event_HidebtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddNewUser().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddNewUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdUserBtn;
    private javax.swing.JTextArea AddressTxt;
    private javax.swing.JTextField AgeTxt;
    private javax.swing.JTextField ContactTxt;
    private javax.swing.JButton Hidebtn;
    private javax.swing.JButton Resetbtn;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton exitbtn;
    private javax.swing.JRadioButton femaleRBtn;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton maleRBtn;
    private javax.swing.JButton shoowbtn;
    // End of variables declaration//GEN-END:variables
}
