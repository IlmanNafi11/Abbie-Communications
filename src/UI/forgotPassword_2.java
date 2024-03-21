package UI;

import java.awt.Color;
import Logic.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class forgotPassword_2 extends javax.swing.JInternalFrame {

    private String nik;
    private String nama;

    public forgotPassword_2() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        panel.setFocusable(true);
    }

    public void getUser(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public void setSapaan() {
        lblSapaan.setText("Happy to help you " + nama + ", please enter");
        lblNextLine.setText("your new password");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        lblSapaan = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtRepassword = new javax.swing.JPasswordField();
        lblNextLine = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setLayout(null);

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
        lblBack.setBounds(779, 206, 60, 28);

        lblSapaan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSapaan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel.add(lblSapaan);
        lblSapaan.setBounds(890, 330, 345, 30);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Update-Primary-Default.png"))); // NOI18N
        btnUpdate.setBorder(null);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateMousePressed(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panel.add(btnUpdate);
        btnUpdate.setBounds(881, 546, 364, 52);

        txtPassword.setBackground(new java.awt.Color(242, 242, 242));
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setText("Enter New Password");
        txtPassword.setBorder(null);
        txtPassword.setEchoChar('\u0000');
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        panel.add(txtPassword);
        txtPassword.setBounds(937, 400, 298, 44);

        txtRepassword.setBackground(new java.awt.Color(242, 242, 242));
        txtRepassword.setForeground(new java.awt.Color(153, 153, 153));
        txtRepassword.setText("Re-Enter New Password");
        txtRepassword.setBorder(null);
        txtRepassword.setEchoChar('\u0000');
        txtRepassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRepasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRepasswordFocusLost(evt);
            }
        });
        panel.add(txtRepassword);
        txtRepassword.setBounds(937, 475, 298, 44);

        lblNextLine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNextLine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel.add(lblNextLine);
        lblNextLine.setBounds(890, 360, 345, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Forgot Password-1.png"))); // NOI18N
        panel.add(bg);
        bg.setBounds(0, 0, 1440, 1024);

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1024));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Update-Primary-Click.png")));
        String password = txtPassword.getText();
        String rePassword = txtRepassword.getText();
        ResetPasswordControler controler = new ResetPasswordControler(password, rePassword, nik);
        boolean succesReset = controler.ResetPassword();
        if (succesReset) {
            login lg = new login();
            this.getDesktopPane().add(lg);
            lg.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Back-Hover.png")));
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Back-Default.png")));
    }//GEN-LAST:event_lblBackMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Update-Primary-Hover.png")));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Update-Primary-Default.png")));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMousePressed
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Update-Primary-Click.png")));
    }//GEN-LAST:event_btnUpdateMousePressed

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (txtPassword.getText().equals("Enter New Password")) {
            txtPassword.setText("");
            txtPassword.setEchoChar('*');
            txtPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (txtPassword.getText().trim().equals("") || txtPassword.getText().length() == 0) {
            txtPassword.setText("Enter New Password");
            txtPassword.setEchoChar((char) 0);
            txtPassword.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtRepasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepasswordFocusGained
        if (txtRepassword.getText().equals("Re-Enter New Password")) {
            txtRepassword.setText("");
            txtRepassword.setEchoChar('*');
            txtRepassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtRepasswordFocusGained

    private void txtRepasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepasswordFocusLost
        if (txtRepassword.getText().trim().equals("") || txtRepassword.getText().length() == 0) {
            txtRepassword.setText("Re-Enter New Password");
            txtRepassword.setEchoChar((char) 0);
            txtRepassword.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtRepasswordFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblNextLine;
    private javax.swing.JLabel lblSapaan;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepassword;
    // End of variables declaration//GEN-END:variables
}
