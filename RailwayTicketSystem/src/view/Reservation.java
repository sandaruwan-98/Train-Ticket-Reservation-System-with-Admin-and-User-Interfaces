/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nipun sandaruwan
 */
public class Reservation extends javax.swing.JFrame {

    /**
     * Creates new form Reservation
     */
    public Reservation() throws SQLException {
        initComponents();
        connect();
        LoadStartPlace();
        LoadDestinationPlace();
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
    
    
    public void LoadStartPlace()
    {
        try {
            pst=con.prepareStatement("SELECT startplace FROM ttraindetails");
            rs=pst.executeQuery();
            SPlaceTxt.removeAllItems();
            
            while(rs.next())
            {
            SPlaceTxt.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    
    }
    
    
        public void LoadDestinationPlace()
    {
        try {
            pst=con.prepareStatement("SELECT destinationplace FROM ttraindetails");
            rs=pst.executeQuery();
            eplaceTxt.removeAllItems();
            
            while(rs.next())
            {
            eplaceTxt.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    
    }
        
        
        public void SearchLoad()
        {
         String splace=SPlaceTxt.getSelectedItem().toString();
         String eplace=eplaceTxt.getSelectedItem().toString();
         
            try {
            pst=con.prepareStatement("SELECT * FROM ttraindetails WHERE startplace=? AND destinationplace=?");
            pst.setString(1, splace);
            pst.setString(2, eplace);
            rs=pst.executeQuery();
            
            if(rs.next()==true)
            {
             TxtTno1.setText(rs.getString(1));
             TxtTname.setText(rs.getString(2));
             TxtPrice.setText(rs.getString(5));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Record not found");
            }
            } catch (Exception e) {
                
                e.printStackTrace();
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        TxtTname = new javax.swing.JTextField();
        TxtPrice = new javax.swing.JTextField();
        TxtTicketNo = new javax.swing.JTextField();
        TxtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SPlaceTxt = new javax.swing.JComboBox();
        eplaceTxt = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        TxtTno1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Start place");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 126, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Destination Place");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 175, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Train Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 296, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 339, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 394, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No Of Tickets");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 453, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 513, -1, -1));

        jDateChooser1.setBackground(new java.awt.Color(204, 255, 255));
        jDateChooser1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 394, 281, 30));

        TxtTname.setBackground(new java.awt.Color(204, 255, 255));
        TxtTname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(TxtTname, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 284, 281, 29));

        TxtPrice.setBackground(new java.awt.Color(204, 255, 255));
        TxtPrice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(TxtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 331, 281, 34));

        TxtTicketNo.setBackground(new java.awt.Color(204, 255, 255));
        TxtTicketNo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TxtTicketNo.setToolTipText("Press Enter key After entering the Qty of the tickets");
        TxtTicketNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtTicketNoKeyPressed(evt);
            }
        });
        getContentPane().add(TxtTicketNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 447, 281, 30));

        TxtTotal.setBackground(new java.awt.Color(204, 255, 255));
        TxtTotal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(TxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 507, 168, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reserve");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 495, 119, 54));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 127, 119, 52));

        SPlaceTxt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SPlaceTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        getContentPane().add(SPlaceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 120, 265, 31));

        eplaceTxt.setBackground(new java.awt.Color(204, 255, 255));
        eplaceTxt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        eplaceTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 2, true));
        getContentPane().add(eplaceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 169, 265, 31));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Train No");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 237, -1, -1));

        TxtTno1.setBackground(new java.awt.Color(204, 255, 255));
        TxtTno1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(TxtTno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 232, 281, 29));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Add Reservation");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 310, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SearchLoad();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtTicketNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTicketNoKeyPressed
        // TODO add your handling code here:
        int price,ticketQty,total;
        
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
         price=Integer.parseInt(TxtPrice.getText());
         ticketQty=Integer.parseInt(TxtTicketNo.getText());
         
         total=price * ticketQty;
         
         TxtTotal.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_TxtTicketNoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //String passengerno=TxtPno.getText();
        String splace=SPlaceTxt.getSelectedItem().toString();
        String eplace=eplaceTxt.getSelectedItem().toString();
        String trainno=TxtTno1.getText();
        String trainname=TxtTname.getText();
        String ticketprice=TxtPrice.getText();
        
        SimpleDateFormat date_form=new SimpleDateFormat("yyyy-mm-dd");
        String date=date_form.format(jDateChooser1.getDate());
        
        String ticketqty=TxtTicketNo.getText();
        String totalammount=TxtTotal.getText();
        
        try {
            pst=con.prepareStatement("INSERT INTO reservation(StartPlace,EndPlace,TrainNumber,TrainName,Price,date,NoOfTickets,Total) VALUES(?,?,?,?,?,?,?,?)");
            
            //pst.setString(1, passengerno);
            pst.setString(1, splace);
            pst.setString(2, eplace);
            pst.setString(3, trainno);
            pst.setString(4, trainname);
            pst.setString(5, ticketprice);
            pst.setString(6, date);
            pst.setString(7, ticketqty);
            pst.setString(8, totalammount);
            
            int k=pst.executeUpdate();
            
            if(k==1){
                JOptionPane.showMessageDialog(null,"Record added sucessfully!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Record insertion failed!!");
            }
            
            //TxtPno.setText("");
            SPlaceTxt.setSelectedItem("");
            eplaceTxt.setSelectedItem("");
            TxtTno1.setText("");
            TxtTname.setText("");
            TxtPrice.setText("");
            //to clear the calender date
            jDateChooser1.setCalendar(null);
            //
            TxtTicketNo.setText("");
            TxtTotal.setText("");
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddTrain.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Reservation().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox SPlaceTxt;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JTextField TxtTicketNo;
    private javax.swing.JTextField TxtTname;
    private javax.swing.JTextField TxtTno1;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JComboBox eplaceTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
