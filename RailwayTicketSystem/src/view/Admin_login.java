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
import javax.swing.JOptionPane;

/**
 *
 * @author Nipun sandaruwan
 */
public class Admin_login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Admin_login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnReset1 = new javax.swing.JButton();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, 50));

        txtUsername.setBackground(new java.awt.Color(0, 0, 0));
        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 260, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 120, 50));

        txtPassword.setBackground(new java.awt.Color(0, 0, 0));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 2, true));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 260, 40));

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("cancel");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 130, 50));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 130, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Admin Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 320, 90));

        btnReset1.setBackground(new java.awt.Color(0, 0, 0));
        btnReset1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset1.setForeground(new java.awt.Color(255, 255, 255));
        btnReset1.setText("Reset");
        btnReset1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
      //Database check
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            String sql="SELECT * FROM userdetails WHERE username=? AND password=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,txtUsername.getText());
            pst.setString(2,txtPassword.getText());
            ResultSet rs=pst.executeQuery();
            
            if(rs.next())
            {
                Home_Admin homesc=new Home_Admin();
                homesc.setVisible(true);
                JOptionPane.showMessageDialog(null,"User name and password matched!!");
            }
            else
            {
               JOptionPane.showMessageDialog(null,"User name and password Incorrect"); 
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this,e);
        }
            
        txtUsername.setText("");
        txtPassword.setText("");
                
    //2nd check            
     /*          
        if(txtUsername.getText().equals("")&& txtPassword.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null,"Blanks not allowed!!");
        }
        
        else if(txtUsername.getText().equals("Admin")&& txtPassword.getText().equals("123"))
        {
         Home homesc=new Home();
         this.hide();
         homesc.setVisible(true);
        }
        
        else
        {
         JOptionPane.showMessageDialog(null,"Username or Password Incorrect!!");
        }
      */
            
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        // TODO add your handling code here:
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnReset1ActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
