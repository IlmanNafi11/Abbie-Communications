package UI;

import Logic.*;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class register_1 extends javax.swing.JInternalFrame {

    public register_1() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
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
        jPanel1.add(txtNik);
        txtNik.setBounds(934, 371, 298, 44);

        txtName.setBackground(new java.awt.Color(242, 242, 242));
        txtName.setForeground(new java.awt.Color(153, 153, 153));
        txtName.setText("Name");
        txtName.setBorder(null);
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(934, 447, 298, 44);

        txtTlp.setBackground(new java.awt.Color(242, 242, 242));
        txtTlp.setForeground(new java.awt.Color(153, 153, 153));
        txtTlp.setText("Phone Number");
        txtTlp.setBorder(null);
        txtTlp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTlpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTlpFocusLost(evt);
            }
        });
        jPanel1.add(txtTlp);
        txtTlp.setBounds(934, 523, 298, 44);

        txtAddress.setBackground(new java.awt.Color(242, 242, 242));
        txtAddress.setForeground(new java.awt.Color(153, 153, 153));
        txtAddress.setText("Address");
        txtAddress.setBorder(null);
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });
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
        String nik = txtNik.getText();
        String nama = txtName.getText();
        String noHp = txtTlp.getText();
        String alamat = txtAddress.getText();
        VerifikasiField verifikasi = new VerifikasiField(nik, nama, noHp, alamat, null, null, null, null);
        boolean verif = verifikasi.verifBio();
        if (verif) {
            Register2 rg2 = new Register2();
            rg2.getBio(nik, nama, noHp, alamat);
            desktopPane.add(rg2);
            rg2.setVisible(true);
        }

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

    private void txtNikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNikFocusGained
        if (txtNik.getText().equals("NIK")) {
            txtNik.setText("");
            txtNik.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNikFocusGained

    private void txtNikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNikFocusLost
        if (txtNik.getText().trim().equals("") || txtNik.getText().length() == 0) {
            txtNik.setText("NIK");
            txtNik.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNikFocusLost

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        if (txtName.getText().equals("Name")) {
            txtName.setText("");
            txtName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if (txtName.getText().trim().equals("") || txtName.getText().length() == 0) {
            txtName.setText("Name");
            txtName.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtTlpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTlpFocusGained
        if (txtTlp.getText().equals("Phone Number")) {
            txtTlp.setText("");
            txtTlp.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtTlpFocusGained

    private void txtTlpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTlpFocusLost
        if (txtTlp.getText().trim().equals("") || txtTlp.getText().length() == 0) {
            txtTlp.setText("Phone Number");
            txtTlp.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtTlpFocusLost

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        if (txtAddress.getText().equals("Address")) {
            txtAddress.setText("");
            txtAddress.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        if (txtAddress.getText().trim().equals("") || txtAddress.getText().length() == 0) {
            txtAddress.setText("Address");
            txtAddress.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtAddressFocusLost


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
