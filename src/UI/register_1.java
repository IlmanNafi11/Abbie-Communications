
package UI;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class register_1 extends javax.swing.JInternalFrame {

    public register_1() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        txtNik = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtTlp = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(null);

        desktopPane.setPreferredSize(new java.awt.Dimension(1440, 1024));

        jPanel1.setLayout(null);

        btnNext.setBorder(null);
        btnNext.setContentAreaFilled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext);
        btnNext.setBounds(881, 671, 364, 52);

        txtNik.setBackground(new java.awt.Color(242, 242, 242));
        txtNik.setBorder(null);
        jPanel1.add(txtNik);
        txtNik.setBounds(934, 371, 298, 44);

        txtName.setBackground(new java.awt.Color(242, 242, 242));
        txtName.setBorder(null);
        jPanel1.add(txtName);
        txtName.setBounds(934, 447, 298, 44);

        txtTlp.setBackground(new java.awt.Color(242, 242, 242));
        txtTlp.setBorder(null);
        jPanel1.add(txtTlp);
        txtTlp.setBounds(934, 523, 298, 44);

        txtAddress.setBackground(new java.awt.Color(242, 242, 242));
        txtAddress.setBorder(null);
        jPanel1.add(txtAddress);
        txtAddress.setBounds(934, 599, 298, 44);

        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        jPanel1.add(lblLogin);
        lblLogin.setBounds(1145, 750, 50, 20);

        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack);
        lblBack.setBounds(780, 205, 60, 28);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sign Up-1.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1440, 1024);

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 1440, 1024);

        getContentPane().add(desktopPane);
        desktopPane.setBounds(0, 0, 1438, 1164);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        login lg = new login();
        this.getDesktopPane().add(lg);
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        
    }//GEN-LAST:event_lblLoginMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnNext;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtTlp;
    // End of variables declaration//GEN-END:variables
}
