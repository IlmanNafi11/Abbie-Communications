package UI;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class forgotPassword_2 extends javax.swing.JInternalFrame {

    public forgotPassword_2() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        txtPassword = new javax.swing.JTextField();
        txtRePassword = new javax.swing.JTextField();
        lblBack = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        panel.setLayout(null);

        txtPassword.setBackground(new java.awt.Color(242, 242, 242));
        txtPassword.setBorder(null);
        panel.add(txtPassword);
        txtPassword.setBounds(937, 400, 298, 44);

        txtRePassword.setBackground(new java.awt.Color(242, 242, 242));
        txtRePassword.setBorder(null);
        panel.add(txtRePassword);
        txtRePassword.setBounds(937, 475, 298, 44);

        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        panel.add(lblBack);
        lblBack.setBounds(780, 205, 60, 28);

        btnUpdate.setBorder(null);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panel.add(btnUpdate);
        btnUpdate.setBounds(881, 546, 364, 52);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Forgot Password-1.png"))); // NOI18N
        panel.add(bg);
        bg.setBounds(0, 0, 1440, 1024);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 1440, 1024);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblBack;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRePassword;
    // End of variables declaration//GEN-END:variables
}
