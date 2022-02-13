
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
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
public class BookPanel extends javax.swing.JFrame {

    /**
     * Creates new form BookPanel
     */
    Connection conn;
ResultSet rs;
ResultSet sr;
PreparedStatement pst;
PreparedStatement ps;
    public BookPanel() {
        conn=javaConnect.connecrDb();
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

        MainPanel = new javax.swing.JPanel();
        close = new javax.swing.JButton();
        search = new javax.swing.JButton();
        infoPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        infoPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        publisher = new javax.swing.JTextField();
        edition = new javax.swing.JTextField();
        availability = new javax.swing.JTextField();
        return_date = new javax.swing.JTextField();
        ok_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainPanel.setBackground(new java.awt.Color(204, 204, 255));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryMangementSystem/images/Actions-window-close-icon.png"))); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryMangementSystem/images/search.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        infoPanel1.setBackground(new java.awt.Color(204, 204, 255));
        infoPanel1.setLayout(new java.awt.CardLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("BOOK ID");

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryMangementSystem/images/back.jpg"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        infoPanel2.setBackground(new java.awt.Color(204, 204, 255));
        infoPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Availability", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36))); // NOI18N
        infoPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book Name");
        infoPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Author");
        infoPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Publisher");
        infoPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edition");
        infoPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));
        infoPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 310, 40));
        infoPanel2.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 310, 40));

        publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherActionPerformed(evt);
            }
        });
        infoPanel2.add(publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 310, 40));
        infoPanel2.add(edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 310, 40));

        availability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityActionPerformed(evt);
            }
        });
        infoPanel2.add(availability, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 310, 40));
        infoPanel2.add(return_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 310, 40));

        ok_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ok_btn.setText("OK");
        ok_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_btnActionPerformed(evt);
            }
        });
        infoPanel2.add(ok_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Availability");
        infoPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Return Date");
        infoPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryMangementSystem/images/shutterstock_1068141515.jpg"))); // NOI18N
        infoPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 710, 460));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(infoPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search)
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(infoPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(close))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(infoPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(search)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        if(!"".equals(id.getText())){
          try{
          String bk="Select * from book where id=?";
          String available="Select * from issued_books where book_id=?";
//        String bk=("Select * from book where name like"+"'%"+title.getText()+"%'or author like"+"'%"+authorName.getText()+"%'");
          pst=conn.prepareStatement(bk);
          pst.setString(1,id.getText());
//       pst.setString(2,authorName.getText());*/
         rs=pst.executeQuery();
         ps=conn.prepareStatement(available);
         ps.setString(1,id.getText());
        if(rs.next()){
           name.setText(rs.getString("name"));
           author.setText(rs.getString("author"));
           publisher.setText(rs.getString("publisher"));
           edition.setText(rs.getString("edition"));
                
         }else{
                JOptionPane.showMessageDialog(null,"no matching output");
                id.setText("");
                name.setText("");
                author.setText("");
                publisher.setText("");
                edition.setText("");
                
            }
        sr=ps.executeQuery();
        if(sr.next()){
            availability.setText("not available");
            return_date.setText(sr.getString("due_date"));
        }else{
            availability.setText("available");
            return_date.setText("");
        }
         }catch(Exception ex){
        System.out.println(ex);
   }  

        }else{
        JOptionPane.showMessageDialog(null,"Please enter the relevant information");
    }
    }//GEN-LAST:event_searchActionPerformed

    private void ok_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_btnActionPerformed
        // TODO add your handling code here:
        id.setText("");
        name.setText("");
        author.setText("");
        publisher.setText("");
        edition.setText("");
        availability.setText("");
        return_date.setText("");
    }//GEN-LAST:event_ok_btnActionPerformed

    private void availabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availabilityActionPerformed

    private void publisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisherActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Home ob=new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(BookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField author;
    private javax.swing.JTextField availability;
    private javax.swing.JButton back;
    private javax.swing.JButton close;
    private javax.swing.JTextField edition;
    private javax.swing.JTextField id;
    private javax.swing.JPanel infoPanel1;
    private javax.swing.JPanel infoPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField name;
    private javax.swing.JButton ok_btn;
    private javax.swing.JTextField publisher;
    private javax.swing.JTextField return_date;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
