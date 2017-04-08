/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantastock;

/**
 *
 * @author Josh
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
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

        portfolioButton = new javax.swing.JButton();
        hostButton = new javax.swing.JButton();
        joinButton = new javax.swing.JButton();
        myLeaguesButton = new javax.swing.JButton();
        tradeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        portfolioButton.setText("View Portfolio");
        portfolioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portfolioButtonActionPerformed(evt);
            }
        });

        hostButton.setText("Host League");
        hostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostButtonActionPerformed(evt);
            }
        });

        joinButton.setText("Join League");
        joinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButtonActionPerformed(evt);
            }
        });

        myLeaguesButton.setText("My Leagues");
        myLeaguesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myLeaguesButtonActionPerformed(evt);
            }
        });

        tradeButton.setText("Make A Trade");
        tradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tradeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(myLeaguesButton)
                        .addComponent(joinButton)
                        .addComponent(portfolioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hostButton)
                            .addComponent(tradeButton))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(portfolioButton)
                .addGap(18, 18, 18)
                .addComponent(tradeButton)
                .addGap(26, 26, 26)
                .addComponent(hostButton)
                .addGap(30, 30, 30)
                .addComponent(joinButton)
                .addGap(32, 32, 32)
                .addComponent(myLeaguesButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void portfolioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portfolioButtonActionPerformed
        this.dispose();
           YourPortfolio portfolio = new YourPortfolio();
           portfolio.setVisible(true);
    }//GEN-LAST:event_portfolioButtonActionPerformed

    private void hostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostButtonActionPerformed
        this.dispose();
           HostLeague host = new HostLeague();
           host.setVisible(true);
    }//GEN-LAST:event_hostButtonActionPerformed

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButtonActionPerformed
        this.dispose();
           JoinLeague join = new JoinLeague();
           join.setVisible(true);
    }//GEN-LAST:event_joinButtonActionPerformed

    private void myLeaguesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myLeaguesButtonActionPerformed
        this.dispose();
           MyLeagues leagues = new MyLeagues();
           leagues.setVisible(true);
    }//GEN-LAST:event_myLeaguesButtonActionPerformed

    private void tradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tradeButtonActionPerformed
        this.dispose();
        MakeTrade trade = new MakeTrade();
        trade.setVisible(true);
    }//GEN-LAST:event_tradeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hostButton;
    private javax.swing.JButton joinButton;
    private javax.swing.JButton myLeaguesButton;
    private javax.swing.JButton portfolioButton;
    private javax.swing.JButton tradeButton;
    // End of variables declaration//GEN-END:variables
}