package UI;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class forgotPassword_1 extends javax.swing.JInternalFrame {

    public forgotPassword_1() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        panel = new javax.swing.JPanel();
        txtNik = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setPreferredSize(new java.awt.Dimension(1440, 1024));
        panel.setLayout(null);

        txtNik.setBackground(new java.awt.Color(242, 242, 242));
        txtNik.setBorder(null);
        panel.add(txtNik);
        txtNik.setBounds(935, 399, 298, 44);

        btnNext.setBorder(null);
        btnNext.setContentAreaFilled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        panel.add(btnNext);
        btnNext.setBounds(879, 470, 364, 52);

        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        panel.add(lblBack);
        lblBack.setBounds(780, 207, 60, 25);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Forgot Password.png"))); // NOI18N
        panel.add(bg);
        bg.setBounds(0, 0, 1440, 1024);

        desktopPane.add(panel);
        panel.setBounds(0, 0, 1440, 1024);

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1024));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        login lg = new login();
        this.getDesktopPane().add(lg);
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        forgotPassword_2 forgotPass = new forgotPassword_2();
        desktopPane.add(forgotPass);
        forgotPass.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnNext;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblBack;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtNik;
    // End of variables declaration//GEN-END:variables
}
