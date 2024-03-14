package UI;

import java.awt.Color;
import Logic.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class forgotPassword_1 extends javax.swing.JInternalFrame {
private ChangeUserDataControler changeUserDataControler;

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
        txtNik.setForeground(new java.awt.Color(153, 153, 153));
        txtNik.setText("NIK");
        txtNik.setBorder(null);
        txtNik.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNikFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNikFocusLost(evt);
            }
        });
        panel.add(txtNik);
        txtNik.setBounds(935, 399, 298, 44);

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
        panel.add(btnNext);
        btnNext.setBounds(879, 470, 364, 52);

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
        panel.add(lblBack);
        lblBack.setBounds(779, 208, 60, 25);

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
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Next-Primary-Default.png")));
        String nik = txtNik.getText();
        changeUserDataControler = new ChangeUserDataControler(nik);
        String verif = changeUserDataControler.cekNik();
        if(verif != null){
            forgotPassword_2 forgotPass = new forgotPassword_2();
            forgotPass.getUser(nik, verif);
            forgotPass.setSapaan();
            desktopPane.add(forgotPass);
            forgotPass.setVisible(true);
        }
        
    }//GEN-LAST:event_btnNextActionPerformed

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

    private void txtNikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNikFocusGained
        if (txtNik.getText().equals("NIK")){
            txtNik.setText("");
            txtNik.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNikFocusGained

    private void txtNikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNikFocusLost
        if (txtNik.getText().trim().equals("") || txtNik.getText().length() == 0) {
            txtNik.setText("NIK");
            txtNik.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNikFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnNext;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblBack;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtNik;
    // End of variables declaration//GEN-END:variables
}
