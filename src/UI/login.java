package UI;

import java.awt.Color;
import Logic.*;
import java.awt.Window;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class login extends javax.swing.JInternalFrame {
private JFrame parentFrame;
    public login(JFrame parentFrame) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        this.parentFrame = parentFrame;
        jPanel1.setFocusable(true);
    }

    public void tutupFrame(String username, String role) {
        Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof JFrame) {
            MainFrame mainFrame = new MainFrame(username, role);
            mainFrame.setVisible(true);
            ((JFrame) window).dispose();
        }
    }

    public void tutupJInternalDanFrame(JInternalFrame internalFrameLogin) {
        Window window = SwingUtilities.getWindowAncestor(internalFrameLogin);
        if (window instanceof JFrame) {
            ((JFrame) window).dispose();
        }
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

        jPanel1.setLayout(null);

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Login-Primary-Default.png"))); // NOI18N
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
        jPanel1.add(btnLogin);
        btnLogin.setBounds(196, 531, 364, 52);

        txtUsername.setBackground(new java.awt.Color(242, 242, 242));
        txtUsername.setForeground(new java.awt.Color(153, 153, 153));
        txtUsername.setText("Username");
        txtUsername.setBorder(null);
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        jPanel1.add(txtUsername);
        txtUsername.setBounds(250, 382, 300, 44);

        txtPassword.setBackground(new java.awt.Color(242, 242, 242));
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setText("Password");
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
        jPanel1.add(txtPassword);
        txtPassword.setBounds(250, 458, 300, 44);

        btnRfid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-RFID-Primary-Default.png"))); // NOI18N
        btnRfid.setBorder(null);
        btnRfid.setContentAreaFilled(false);
        btnRfid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRfidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRfidMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRfidMousePressed(evt);
            }
        });
        btnRfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRfidActionPerformed(evt);
            }
        });
        jPanel1.add(btnRfid);
        btnRfid.setBounds(196, 692, 364, 52);

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
        lblBack.setBounds(73, 165, 60, 40);

        lblRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Register-Default.png"))); // NOI18N
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterMouseExited(evt);
            }
        });
        jPanel1.add(lblRegister);
        lblRegister.setBounds(438, 775, 115, 20);

        lblForgot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Forgot-Default.png"))); // NOI18N
        lblForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblForgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblForgotMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblForgotMousePressed(evt);
            }
        });
        jPanel1.add(lblForgot);
        lblForgot.setBounds(420, 601, 144, 20);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login.png"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 1440, 1024);

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
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        LoginControler login = new LoginControler(username, password, null);
        String role = login.AuthLogin();
        if (role != null) {
            tutupFrame(username,role);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMouseClicked
        lblForgot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Forgot-Hover.png")));
        forgotPassword_1 rg = new forgotPassword_1();
        this.getDesktopPane().add(rg);
        rg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblForgotMouseClicked

    private void btnRfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRfidActionPerformed
        btnRfid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-RFID-Primary-Default.png")));
        Rfid rfid = new Rfid(parentFrame,this, true);
        rfid.setVisible(true);
    }//GEN-LAST:event_btnRfidActionPerformed

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        register_1 rg = new register_1();
        this.getDesktopPane().add(rg);
        rg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Back-Hover.png")));
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Back-Default.png")));
    }//GEN-LAST:event_lblBackMouseExited

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Login-Primary-Click.png")));
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Login-Primary-Hover.png")));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Login-Primary-Default.png")));
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Login-Primary-Click.png")));
    }//GEN-LAST:event_btnLoginMousePressed

    private void lblForgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMouseEntered
        lblForgot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Forgot-Hover.png")));
    }//GEN-LAST:event_lblForgotMouseEntered

    private void lblForgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMouseExited
        lblForgot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Forgot-Default.png")));
    }//GEN-LAST:event_lblForgotMouseExited

    private void lblForgotMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMousePressed
        lblForgot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Forgot-Hover.png")));
    }//GEN-LAST:event_lblForgotMousePressed

    private void btnRfidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRfidMouseEntered
        btnRfid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-RFID-Hover.png")));
    }//GEN-LAST:event_btnRfidMouseEntered

    private void btnRfidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRfidMouseExited
        btnRfid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-RFID-Primary-Default.png")));
    }//GEN-LAST:event_btnRfidMouseExited

    private void btnRfidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRfidMousePressed
        btnRfid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-RFID-Click.png")));
    }//GEN-LAST:event_btnRfidMousePressed

    private void lblRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseEntered
        lblRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Register-Hover.png")));
    }//GEN-LAST:event_lblRegisterMouseEntered

    private void lblRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseExited
        lblRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Register-Default.png")));
    }//GEN-LAST:event_lblRegisterMouseExited

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if (txtUsername.getText().equals("Username")) {
            txtUsername.setText("");
            txtUsername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if (txtUsername.getText().trim().equals("") || txtUsername.getText().length() == 0) {
            txtUsername.setText("Username");
            txtUsername.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (txtPassword.getText().equals("Password")) {
            txtPassword.setText("");
            txtPassword.setEchoChar('*');
            txtPassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (txtPassword.getText().trim().equals("") || txtPassword.getText().length() == 0) {
            txtPassword.setText("Password");
            txtPassword.setEchoChar((char) 0);
            txtPassword.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtPasswordFocusLost


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
