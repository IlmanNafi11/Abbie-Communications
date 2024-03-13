package UI;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import Logic.*;

public class Register2 extends javax.swing.JInternalFrame {

    private String nik;
    private String nama;
    private String noHp;
    private String alamat;
    private VerifikasiField verifikasi;
    
    public Register2() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        Pane.setFocusable(true);
    }

    public void getBio(String nik, String nama, String noHp, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Role = new javax.swing.ButtonGroup();
        Pane = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtRepassword = new javax.swing.JPasswordField();
        rdOwner = new javax.swing.JRadioButton();
        rdAdmin = new javax.swing.JRadioButton();
        rdTeknisi = new javax.swing.JRadioButton();
        btnRegister = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pane.setLayout(null);

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
        Pane.add(lblBack);
        lblBack.setBounds(779, 210, 60, 20);

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
        Pane.add(txtUsername);
        txtUsername.setBounds(933, 371, 298, 44);

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
        Pane.add(txtPassword);
        txtPassword.setBounds(933, 447, 298, 44);

        txtRepassword.setBackground(new java.awt.Color(242, 242, 242));
        txtRepassword.setForeground(new java.awt.Color(153, 153, 153));
        txtRepassword.setText("Re-Enter Password");
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
        Pane.add(txtRepassword);
        txtRepassword.setBounds(933, 523, 298, 44);

        Role.add(rdOwner);
        rdOwner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Default.png"))); // NOI18N
        rdOwner.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Hover.png"))); // NOI18N
        rdOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rdOwnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rdOwnerMouseExited(evt);
            }
        });
        Pane.add(rdOwner);
        rdOwner.setBounds(967, 588, 24, 25);

        Role.add(rdAdmin);
        rdAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Default.png"))); // NOI18N
        rdAdmin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Hover.png"))); // NOI18N
        rdAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rdAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rdAdminMouseExited(evt);
            }
        });
        Pane.add(rdAdmin);
        rdAdmin.setBounds(1046, 588, 24, 25);

        Role.add(rdTeknisi);
        rdTeknisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Default.png"))); // NOI18N
        rdTeknisi.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Hover.png"))); // NOI18N
        rdTeknisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rdTeknisiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rdTeknisiMouseExited(evt);
            }
        });
        Pane.add(rdTeknisi);
        rdTeknisi.setBounds(1123, 587, 24, 25);

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Register-Primary-Default.png"))); // NOI18N
        btnRegister.setBorder(null);
        btnRegister.setContentAreaFilled(false);
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegisterMousePressed(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        Pane.add(btnRegister);
        btnRegister.setBounds(880, 634, 364, 52);

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
        Pane.add(lblLogin);
        lblLogin.setBounds(1149, 714, 50, 20);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sign Up-2.png"))); // NOI18N
        Pane.add(bg);
        bg.setBounds(0, 0, 1440, 1024);

        getContentPane().add(Pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1024));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Back-Hover.png")));
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Back-Hover.png")));
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Back-Default.png")));
    }//GEN-LAST:event_lblBackMouseExited

    private void rdOwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdOwnerMouseEntered
        rdOwner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Hover.png")));
    }//GEN-LAST:event_rdOwnerMouseEntered

    private void rdAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdAdminMouseEntered
        rdAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Hover.png")));
    }//GEN-LAST:event_rdAdminMouseEntered

    private void rdTeknisiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdTeknisiMouseEntered
        rdTeknisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Hover.png")));
    }//GEN-LAST:event_rdTeknisiMouseEntered

    private void rdOwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdOwnerMouseExited
        rdOwner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Default.png")));
    }//GEN-LAST:event_rdOwnerMouseExited

    private void rdAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdAdminMouseExited
        rdAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Default.png")));
    }//GEN-LAST:event_rdAdminMouseExited

    private void rdTeknisiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdTeknisiMouseExited
        rdTeknisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Radio-Button-Default.png")));
    }//GEN-LAST:event_rdTeknisiMouseExited

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Register-Primary-Click.png")));
        String status;
        String password = txtPassword.getText();
        String repas = txtRepassword.getText();
        if (rdAdmin.isSelected()) {
            status = "admin";
        } else if (rdTeknisi.isSelected()) {
            status = "teknisi";
        } else {
            status = "owner";
        }
        verifikasi = new VerifikasiField(nik, nama, noHp, alamat, txtUsername.getText(), txtPassword.getText(),txtRepassword.getText(), status);
            boolean verif = verifikasi.verifFieldAkun();
            if (verif) {
                RegisterControler registrasi = new RegisterControler(verifikasi);
                registrasi.display();
            }
        


    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Register-Primary-Hover.png")));
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Register-Primary-Default.png")));
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMousePressed
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Register-Primary-Click.png")));
    }//GEN-LAST:event_btnRegisterMousePressed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Login-Hover.png")));
        login lg = new login();
        this.getDesktopPane().add(lg);
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLoginMouseClicked

    private void lblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseEntered
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Login-Hover.png")));
    }//GEN-LAST:event_lblLoginMouseEntered

    private void lblLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseExited
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Login-Default.png")));
    }//GEN-LAST:event_lblLoginMouseExited

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

    private void txtRepasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepasswordFocusGained
        if (txtRepassword.getText().equals("Re-Enter Password")) {
            txtRepassword.setText("");
            txtRepassword.setEchoChar('*');
            txtRepassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtRepasswordFocusGained

    private void txtRepasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepasswordFocusLost
        if (txtRepassword.getText().trim().equals("") || txtRepassword.getText().length() == 0) {
            txtRepassword.setText("Re-Enter Password");
            txtRepassword.setEchoChar((char) 0);
            txtRepassword.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtRepasswordFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pane;
    private javax.swing.ButtonGroup Role;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JRadioButton rdAdmin;
    private javax.swing.JRadioButton rdOwner;
    private javax.swing.JRadioButton rdTeknisi;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
