package UI;

public class welcome extends javax.swing.JFrame {

    public welcome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        btnStarted = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abbie Communications Apps");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setResizable(false);
        getContentPane().setLayout(null);

        btnStarted.setBorder(null);
        btnStarted.setContentAreaFilled(false);
        btnStarted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartedActionPerformed(evt);
            }
        });
        desktopPane.add(btnStarted);
        btnStarted.setBounds(173, 637, 158, 50);

        btnSignUp.setBorder(null);
        btnSignUp.setContentAreaFilled(false);
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        desktopPane.add(btnSignUp);
        btnSignUp.setBounds(1110, 43, 133, 45);

        btnLogin.setBorder(null);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        desktopPane.add(btnLogin);
        btnLogin.setBounds(1270, 43, 133, 45);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Welcome-Page.png"))); // NOI18N
        desktopPane.add(bg);
        bg.setBounds(0, 0, 1440, 1024);

        getContentPane().add(desktopPane);
        desktopPane.setBounds(0, 0, 1440, 1024);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartedActionPerformed
        
    }//GEN-LAST:event_btnStartedActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login lg = new login();
        desktopPane.add(lg);
        lg.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btnStarted;
    private javax.swing.JDesktopPane desktopPane;
    // End of variables declaration//GEN-END:variables
}
