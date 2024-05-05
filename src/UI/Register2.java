package UI;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import Logic.*;

public class Register2 extends javax.swing.JInternalFrame {

    private String nik;
    private String nama;
    private String noHp;
    private String alamat;
    private AuthRegister verifikasi;

    public Register2() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        Pane.setFocusable(true);
        btnHidePassword.setVisible(false);
        btnHidePassword2.setVisible(false);
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
        btnShowPassword = new javax.swing.JButton();
        btnHidePassword = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnShowPassword2 = new javax.swing.JButton();
        btnHidePassword2 = new javax.swing.JButton();
        txtRepassword = new javax.swing.JPasswordField();
        txtRfid = new javax.swing.JTextField();
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
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        btnShowPassword.setBackground(new java.awt.Color(242, 242, 242));
        btnShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/show-password-default.png"))); // NOI18N
        btnShowPassword.setBorder(null);
        btnShowPassword.setContentAreaFilled(false);
        btnShowPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnShowPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnShowPasswordMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnShowPasswordMousePressed(evt);
            }
        });
        btnShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPasswordActionPerformed(evt);
            }
        });
        Pane.add(btnShowPassword);
        btnShowPassword.setBounds(1195, 455, 40, 30);

        btnHidePassword.setBackground(new java.awt.Color(242, 242, 242));
        btnHidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/hide-password-default.png"))); // NOI18N
        btnHidePassword.setBorder(null);
        btnHidePassword.setContentAreaFilled(false);
        btnHidePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHidePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHidePasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHidePasswordMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHidePasswordMousePressed(evt);
            }
        });
        btnHidePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHidePasswordActionPerformed(evt);
            }
        });
        Pane.add(btnHidePassword);
        btnHidePassword.setBounds(1195, 455, 40, 30);

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
        txtPassword.setBounds(933, 447, 260, 44);

        btnShowPassword2.setBackground(new java.awt.Color(242, 242, 242));
        btnShowPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/show-password-default.png"))); // NOI18N
        btnShowPassword2.setBorder(null);
        btnShowPassword2.setContentAreaFilled(false);
        btnShowPassword2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowPassword2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnShowPassword2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnShowPassword2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnShowPassword2MousePressed(evt);
            }
        });
        btnShowPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPassword2ActionPerformed(evt);
            }
        });
        Pane.add(btnShowPassword2);
        btnShowPassword2.setBounds(1195, 530, 40, 30);

        btnHidePassword2.setBackground(new java.awt.Color(242, 242, 242));
        btnHidePassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/hide-password-default.png"))); // NOI18N
        btnHidePassword2.setBorder(null);
        btnHidePassword2.setContentAreaFilled(false);
        btnHidePassword2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHidePassword2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHidePassword2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHidePassword2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHidePassword2MousePressed(evt);
            }
        });
        btnHidePassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHidePassword2ActionPerformed(evt);
            }
        });
        Pane.add(btnHidePassword2);
        btnHidePassword2.setBounds(1195, 530, 40, 30);

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

        txtRfid.setBackground(new java.awt.Color(242, 242, 242));
        txtRfid.setForeground(new java.awt.Color(153, 153, 153));
        txtRfid.setText("RfidD ID, paste your Rfid ID card into the scanner");
        txtRfid.setBorder(null);
        txtRfid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRfidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRfidFocusLost(evt);
            }
        });
        Pane.add(txtRfid);
        txtRfid.setBounds(933, 599, 298, 44);

        Role.add(rdOwner);
        rdOwner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        rdOwner.setBounds(967, 658, 24, 25);

        Role.add(rdAdmin);
        rdAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        rdAdmin.setBounds(1047, 658, 24, 25);

        Role.add(rdTeknisi);
        rdTeknisi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        rdTeknisi.setBounds(1123, 658, 24, 25);

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Register-Primary-Default.png"))); // NOI18N
        btnRegister.setBorder(null);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnRegister.setBounds(880, 705, 364, 52);

        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Login-Default.png"))); // NOI18N
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        lblLogin.setBounds(1149, 785, 50, 20);

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
        String idAkun = txtRfid.getText();
        if (rdAdmin.isSelected()) {
            status = "admin";
        } else if (rdTeknisi.isSelected()) {
            status = "teknisi";
        } else {
            status = "owner";
        }
        verifikasi = new AuthRegister(nik, nama, noHp, alamat, txtUsername.getText(), txtPassword.getText(), txtRepassword.getText(), status, idAkun);
        boolean verif = verifikasi.VerifFieldAkun();
        if (verif) {
            RegisterControler registrasi = new RegisterControler(verifikasi);
            if (registrasi.InsertData()) {
                login lg = new login(null);
                this.getDesktopPane().add(lg);
                lg.setVisible(true);
                this.dispose();
            }
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
        login lg = new login(null);
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

    private void txtRfidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRfidFocusGained
        if (txtRfid.getText().equals("RfidD ID, paste your Rfid ID card into the scanner")) {
            txtRfid.setText("");
            txtRfid.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtRfidFocusGained

    private void txtRfidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRfidFocusLost
        if (txtRfid.getText().trim().equals("") || txtRfid.getText().length() == 0) {
            txtRfid.setText("RfidD ID, paste your Rfid ID card into the scanner");
            txtRfid.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtRfidFocusLost

    private void btnShowPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPasswordMouseEntered
        btnShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/show-password-hover.png")));
        btnShowPassword.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnShowPasswordMouseEntered

    private void btnShowPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPasswordMouseExited
        btnShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/show-password-default.png")));
        btnShowPassword.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnShowPasswordMouseExited

    private void btnShowPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPasswordMousePressed
        btnShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/show-password-click.png")));
        btnShowPassword.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnShowPasswordMousePressed

    private void btnShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPasswordActionPerformed
        if (!txtPassword.getText().trim().equalsIgnoreCase("Password")) {
            txtPassword.setEchoChar((char)0);
            btnHidePassword.setVisible(true);
            btnShowPassword.setVisible(false);
        }
    }//GEN-LAST:event_btnShowPasswordActionPerformed

    private void btnHidePasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHidePasswordMouseEntered
        btnHidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/hide-password-hover.png")));
        btnHidePassword.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnHidePasswordMouseEntered

    private void btnHidePasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHidePasswordMouseExited
        btnHidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/hide-password-default.png")));
        btnHidePassword.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnHidePasswordMouseExited

    private void btnHidePasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHidePasswordMousePressed
        btnHidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/hide-password-click.png")));
        btnHidePassword.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnHidePasswordMousePressed

    private void btnHidePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHidePasswordActionPerformed
        if (!txtPassword.getText().trim().equalsIgnoreCase("Password")) {
            txtPassword.setEchoChar('*');
            btnHidePassword.setVisible(false);
            btnShowPassword.setVisible(true);
        }
    }//GEN-LAST:event_btnHidePasswordActionPerformed

    private void btnHidePassword2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHidePassword2MouseEntered
        btnHidePassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/hide-password-hover.png")));
        btnHidePassword2.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnHidePassword2MouseEntered

    private void btnHidePassword2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHidePassword2MouseExited
        btnHidePassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/hide-password-default.png")));
        btnHidePassword2.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnHidePassword2MouseExited

    private void btnHidePassword2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHidePassword2MousePressed
        btnHidePassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/hide-password-click.png")));
        btnHidePassword2.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnHidePassword2MousePressed

    private void btnHidePassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHidePassword2ActionPerformed
        if (!txtRepassword.getText().trim().equalsIgnoreCase("Re-Enter Password")) {
            txtRepassword.setEchoChar('*');
            btnHidePassword2.setVisible(false);
            btnShowPassword2.setVisible(true);
        }
    }//GEN-LAST:event_btnHidePassword2ActionPerformed

    private void btnShowPassword2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassword2MouseEntered
        btnShowPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/show-password-hover.png")));
        btnShowPassword2.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnShowPassword2MouseEntered

    private void btnShowPassword2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassword2MouseExited
        btnShowPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/show-password-default.png")));
        btnShowPassword2.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnShowPassword2MouseExited

    private void btnShowPassword2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassword2MousePressed
        btnShowPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/show-password-click.png")));
        btnShowPassword2.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_btnShowPassword2MousePressed

    private void btnShowPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPassword2ActionPerformed
        if (!txtRepassword.getText().trim().equalsIgnoreCase("Re-Enter Password")) {
            txtRepassword.setEchoChar((char)0);
            btnHidePassword2.setVisible(true);
            btnShowPassword2.setVisible(false);
        }
    }//GEN-LAST:event_btnShowPassword2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pane;
    private javax.swing.ButtonGroup Role;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnHidePassword;
    private javax.swing.JButton btnHidePassword2;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnShowPassword;
    private javax.swing.JButton btnShowPassword2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JRadioButton rdAdmin;
    private javax.swing.JRadioButton rdOwner;
    private javax.swing.JRadioButton rdTeknisi;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRepassword;
    private javax.swing.JTextField txtRfid;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
