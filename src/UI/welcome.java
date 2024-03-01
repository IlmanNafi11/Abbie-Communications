package UI;

public class welcome extends javax.swing.JFrame{

    public welcome() {
        initComponents();
        getContentPane().add(desktopPane);
    }

    public void bukaLogin(){
        login login = new login();
        desktopPane.add(login);
        login.setVisible(true);
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
        setResizable(false);

        btnStarted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Started-Default.png"))); // NOI18N
        btnStarted.setBorder(null);
        btnStarted.setContentAreaFilled(false);
        btnStarted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStartedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStartedMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnStartedMousePressed(evt);
            }
        });
        btnStarted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartedActionPerformed(evt);
            }
        });
        desktopPane.add(btnStarted);
        btnStarted.setBounds(173, 637, 158, 50);

        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Sign-Up-Default.png"))); // NOI18N
        btnSignUp.setBorder(null);
        btnSignUp.setContentAreaFilled(false);
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignUpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSignUpMousePressed(evt);
            }
        });
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        desktopPane.add(btnSignUp);
        btnSignUp.setBounds(1100, 43, 133, 45);

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Login-Default.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        desktopPane.add(btnLogin);
        btnLogin.setBounds(1262, 43, 133, 45);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Welcome-Page.png"))); // NOI18N
        desktopPane.add(bg);
        bg.setBounds(0, 0, 1440, 1024);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartedActionPerformed
        register_1 rg = new register_1();
        desktopPane.add(rg);
        rg.setVisible(true);
    }//GEN-LAST:event_btnStartedActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        register_1 rg = new register_1();
        desktopPane.add(rg);
        rg.setVisible(true);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login lg = new login();
        desktopPane.add(lg);
        lg.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnStartedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartedMouseEntered
        btnStarted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Started-Hover.png")));
    }//GEN-LAST:event_btnStartedMouseEntered

    private void btnStartedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartedMouseExited
        btnStarted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Started-Default.png")));
    }//GEN-LAST:event_btnStartedMouseExited

    private void btnStartedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartedMouseClicked
        btnStarted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Started-Click.png")));
    }//GEN-LAST:event_btnStartedMouseClicked

    private void btnStartedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartedMousePressed
        btnStarted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Started-Click.png")));
    }//GEN-LAST:event_btnStartedMousePressed

    private void btnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseEntered
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Sign-Up-Hover.png")));
    }//GEN-LAST:event_btnSignUpMouseEntered

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Login-Hover.png")));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseExited
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Sign-Up-Default.png")));
    }//GEN-LAST:event_btnSignUpMouseExited

    private void btnSignUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMousePressed
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Sign-Up-Click.png")));
    }//GEN-LAST:event_btnSignUpMousePressed

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Sign-Up-Click.png")));
    }//GEN-LAST:event_btnSignUpMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Login-Click.png")));
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Login-Default.png")));
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Login-Click.png")));
    }//GEN-LAST:event_btnLoginMousePressed

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
    public javax.swing.JDesktopPane desktopPane;
    // End of variables declaration//GEN-END:variables
}
