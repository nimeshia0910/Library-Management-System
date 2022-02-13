
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nimesha
 */
public class forgot extends javax.swing.JFrame {

    /**
     * Creates new form forgot
     */
Connection conn;
ResultSet rs;
PreparedStatement pst;
    public forgot() {
        super("forgot");
        initComponents();
        conn=javaConnect.connecrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        retrieve = new javax.swing.JButton();
        search = new javax.swing.JButton();
        pswd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ans = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        sec_q = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryMangementSystem/images/Actions-window-close-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, -1, 40));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Forgot Password?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryMangementSystem/images/back.jpg"))); // NOI18N
        back.setText("   back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 140, 40));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 390, 40));

        retrieve.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        retrieve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryMangementSystem/images/retrieve.png"))); // NOI18N
        retrieve.setText(" retrieve");
        retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveActionPerformed(evt);
            }
        });
        jPanel1.add(retrieve, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 140, 40));

        search.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryMangementSystem/images/search.png"))); // NOI18N
        search.setText("  search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 140, 40));
        jPanel1.add(pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 390, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Enter Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Security Question");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Answer");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Your Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));
        jPanel1.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 390, 40));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 390, 40));
        jPanel1.add(sec_q, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 390, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1120, 650));

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveActionPerformed
        // TODO add your handling code here:
         String answer=ans.getText();
    try {
        pst=conn.prepareStatement("select * from account where answer='"+answer+"'");
        rs=pst.executeQuery();
        if(rs.next()){
            pswd.setText(rs.getString(3));
        }else{
            JOptionPane.showMessageDialog(null,"your answer is incorrect");
        }
    } catch (SQLException ex) {
        Logger.getLogger(forgot.class.getName()).log(Level.SEVERE, null, ex);
    }      
    }//GEN-LAST:event_retrieveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login ob=new Login();
        ob.setVisible(true);
    }//GEN-LAST:event_backActionPerformed
public class function{
    public ResultSet find(String s){
        try{
          pst=conn.prepareStatement("select * from account where username=?")  ;
          pst.setString(1, s);
          rs=pst.executeQuery();
          
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
}
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        function f=new function();
        rs=f.find(username.getText());
        
        try{
         if(rs.next()){
                 name.setText(rs.getString("name"));
               sec_q.setText(rs.getString("sec_q"));
                
                
            }else{
                JOptionPane.showMessageDialog(null,"no data for this username");
            }
            
            rs.close();
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
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
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pswd;
    private javax.swing.JButton retrieve;
    private javax.swing.JButton search;
    private javax.swing.JTextField sec_q;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
