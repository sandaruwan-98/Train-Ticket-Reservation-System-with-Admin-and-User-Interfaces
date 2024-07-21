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
public class DeleteTrainDetails extends javax.swing.JFrame {

    /**
     * Creates new form DeleteTrainDetails
     */
    public DeleteTrainDetails() throws SQLException {
        initComponents();
        connect();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
 //TO CONNECT THE DATABASE   
    public void connect() throws SQLException
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddTrain.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
/////////////////////////////////////////////////////////////   
    
    public void LoadDataToTextfields()
    {
        String srch=SearchField2.getText();
        
        try {
            pst=con.prepareStatement("SELECT * FROM ttraindetails WHERE tno='"+srch+"'" );
            rs=pst.executeQuery();
            
            if(rs.next())
            {
            Txtf1.setText(rs.getString("tno"));
            Txtf2.setText(rs.getString("tname"));
            Txtf3.setText(rs.getString("startplace"));
            Txtf4.setText(rs.getString("destinationplace"));
            Txtf5.setText(rs.getString("price"));
            }
            else{
                Txtf1.setText("");
                Txtf2.setText("");
                Txtf3.setText("");
                Txtf4.setText("");
                Txtf5.setText("");
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    
    }
/////////////////////////////////////////////////////////   
    public void DeleteDataFromSql()
    {
        String tno=Txtf1.getText();
        
        try {
            pst=con.prepareStatement("DELETE FROM ttraindetails WHERE tno=?");
            pst.setString(1, tno);
            
            int k=pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(null,"Record Deleted!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Record Deletion failed!!");
            }
            Txtf1.setText("");
            Txtf2.setText("");
            Txtf3.setText("");
            Txtf4.setText("");
            Txtf5.setText("");
            SearchField2.setText(" ");
            
        } catch (SQLException ex) {
            Logger.getLogger(AddTrain.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        SearchField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txtf5 = new javax.swing.JTextField();
        Txtf1 = new javax.swing.JTextField();
        Txtf2 = new javax.swing.JTextField();
        Txtf3 = new javax.swing.JTextField();
        Txtf4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Search Train ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        SearchField2.setBackground(new java.awt.Color(51, 204, 255));
        SearchField2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SearchField2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        SearchField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchField2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(SearchField2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchField2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 500, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Delete Train Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Train No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Train Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Start Place");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Destination");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        Txtf5.setBackground(new java.awt.Color(0, 0, 0));
        Txtf5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Txtf5.setForeground(new java.awt.Color(255, 255, 255));
        Txtf5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        jPanel1.add(Txtf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 200, 40));

        Txtf1.setBackground(new java.awt.Color(0, 0, 0));
        Txtf1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Txtf1.setForeground(new java.awt.Color(255, 255, 255));
        Txtf1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        jPanel1.add(Txtf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 500, 40));

        Txtf2.setBackground(new java.awt.Color(0, 0, 0));
        Txtf2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Txtf2.setForeground(new java.awt.Color(255, 255, 255));
        Txtf2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        jPanel1.add(Txtf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 500, 40));

        Txtf3.setBackground(new java.awt.Color(0, 0, 0));
        Txtf3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Txtf3.setForeground(new java.awt.Color(255, 255, 255));
        Txtf3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        jPanel1.add(Txtf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 500, 40));

        Txtf4.setBackground(new java.awt.Color(0, 0, 0));
        Txtf4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Txtf4.setForeground(new java.awt.Color(255, 255, 255));
        Txtf4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        jPanel1.add(Txtf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 500, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reset");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 160, 60));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 160, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DeleteDataFromSql();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SearchField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchField2KeyReleased
        // TODO add your handling code here:
        LoadDataToTextfields();
    }//GEN-LAST:event_SearchField2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            Txtf1.setText("");
            Txtf2.setText("");
            Txtf3.setText("");
            Txtf4.setText("");
            Txtf5.setText("");
            SearchField2.setText(" ");
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
            java.util.logging.Logger.getLogger(DeleteTrainDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteTrainDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteTrainDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteTrainDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DeleteTrainDetails().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DeleteTrainDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchField2;
    private javax.swing.JTextField Txtf1;
    private javax.swing.JTextField Txtf2;
    private javax.swing.JTextField Txtf3;
    private javax.swing.JTextField Txtf4;
    private javax.swing.JTextField Txtf5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
