
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktopPane.setPreferredSize(new java.awt.Dimension(1440, 1024));

        jPanel1.setLayout(null);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Next-Primary-Default.png"))); // NOI18N
        btnNext.setBorder(null);
        btnNext.setContentAreaFilled(false);
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNextMousePressed(evt);
            }
        });
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

        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Login-Default.png"))); // NOI18N
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoginMouseExited(evt);
            }
        });
        jPanel1.add(lblLogin);
        lblLogin.setBounds(1150, 751, 50, 20);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Back-Default.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
        });
        jPanel1.add(lblBack);
        lblBack.setBounds(779, 206, 60, 28);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sign Up-1.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1440, 1024);

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 1440, 1024);

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1438, 1164));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        login lg = new login();
        this.getDesktopPane().add(lg);
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Next-Primary-Click.png")));
        Register2 rg2 = new Register2();
        desktopPane.add(rg2);
        rg2.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnNextActionPerformed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Login-Hover.png")));
        login lg = new login();
        this.getDesktopPane().add(lg);
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLoginMouseClicked

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Back-Hover.png")));
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Back-Default.png")));
    }//GEN-LAST:event_lblBackMouseExited

    private void btnNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseEntered
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Next-Primary-Hover.png")));
    }//GEN-LAST:event_btnNextMouseEntered

    private void btnNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseExited
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Next-Primary-Default.png")));
    }//GEN-LAST:event_btnNextMouseExited

    private void btnNextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMousePressed
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Next-Primary-Click.png")));
    }//GEN-LAST:event_btnNextMousePressed

    private void lblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseEntered
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Login-Hover.png")));
    }//GEN-LAST:event_lblLoginMouseEntered

    private void lblLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseExited
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Login-Default.png")));
    }//GEN-LAST:event_lblLoginMouseExited


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
