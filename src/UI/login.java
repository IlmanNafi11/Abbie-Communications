package UI;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class login extends javax.swing.JInternalFrame {

    public login() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnRfid = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        lblForgot = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setBorder(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBorder(null);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 530, 364, 52));

        txtUsername.setBorder(null);
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 382, 300, 44));

        txtPassword.setBorder(null);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 458, 300, 44));

        btnRfid.setBorder(null);
        btnRfid.setContentAreaFilled(false);
        btnRfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRfidActionPerformed(evt);
            }
        });
        jPanel1.add(btnRfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 692, 364, 52));

        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 172, 60, 25));

        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 773, 115, 20));

        lblForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotMouseClicked(evt);
            }
        });
        jPanel1.add(lblForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 600, 144, 20));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMouseClicked
        
    }//GEN-LAST:event_lblForgotMouseClicked

    private void btnRfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRfidActionPerformed
        
    }//GEN-LAST:event_btnRfidActionPerformed

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        
    }//GEN-LAST:event_lblRegisterMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRfid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblForgot;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
