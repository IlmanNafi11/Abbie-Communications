package UI;

import java.awt.Color;
import Logic.*;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Profile extends javax.swing.JDialog {
    
    private String role;
    private String usernameLama;
    private String noHpLama;
    private String nikLama;
    private boolean counterButton = false;
    
    public Profile(JInternalFrame parent, boolean modal) {
        super((JFrame) parent.getTopLevelAncestor(), modal);
        initComponents();
        getContentPane().setBackground(new Color(255,255,255,150));
        bg.setFocusable(true);
    }
    
    public void SetField(String idUser, String nik, String namaUser, String noHp, String alamat, String username, String role){
        txtUserId.setText(idUser);
        txtNik.setText(nik);
        txtName.setText(namaUser);
        txtNoHp.setText(noHp);
        txtAlamat.setText(alamat);
        txtUsername.setText(username);
        lblNameUser.setText(namaUser);
        lblPosisi.setText(role);
        this.role = role;
        this.usernameLama = username;
        this.noHpLama = noHp;
        this.nikLama = nik;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUserId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtNik = new javax.swing.JTextField();
        txtNoHp = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblNameUser = new javax.swing.JLabel();
        lblPosisi = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Profile");
        setResizable(false);
        getContentPane().setLayout(null);

        txtUserId.setEditable(false);
        txtUserId.setBackground(new java.awt.Color(245, 246, 250));
        txtUserId.setForeground(new java.awt.Color(153, 153, 153));
        txtUserId.setText("User ID");
        txtUserId.setBorder(null);
        txtUserId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserIdFocusLost(evt);
            }
        });
        getContentPane().add(txtUserId);
        txtUserId.setBounds(68, 568, 488, 45);

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(245, 246, 250));
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
        getContentPane().add(txtName);
        txtName.setBounds(68, 644, 488, 45);

        txtNik.setEditable(false);
        txtNik.setBackground(new java.awt.Color(245, 246, 250));
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
        getContentPane().add(txtNik);
        txtNik.setBounds(68, 730, 488, 45);

        txtNoHp.setEditable(false);
        txtNoHp.setBackground(new java.awt.Color(245, 246, 250));
        txtNoHp.setForeground(new java.awt.Color(153, 153, 153));
        txtNoHp.setText("Phone Number");
        txtNoHp.setBorder(null);
        txtNoHp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNoHpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNoHpFocusLost(evt);
            }
        });
        getContentPane().add(txtNoHp);
        txtNoHp.setBounds(598, 568, 488, 45);

        txtAlamat.setEditable(false);
        txtAlamat.setBackground(new java.awt.Color(245, 246, 250));
        txtAlamat.setForeground(new java.awt.Color(153, 153, 153));
        txtAlamat.setText("Address");
        txtAlamat.setBorder(null);
        txtAlamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAlamatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAlamatFocusLost(evt);
            }
        });
        getContentPane().add(txtAlamat);
        txtAlamat.setBounds(598, 644, 490, 45);

        txtUsername.setEditable(false);
        txtUsername.setBackground(new java.awt.Color(245, 246, 250));
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
        getContentPane().add(txtUsername);
        txtUsername.setBounds(598, 730, 490, 45);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Cancel-Primary-Default.png"))); // NOI18N
        btnCancel.setBorder(null);
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelMousePressed(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(898, 811, 95, 50);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Primary-Default.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaveMousePressed(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(1004, 811, 95, 50);

        lblNameUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNameUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameUser.setText("Ilman Nafian");
        getContentPane().add(lblNameUser);
        lblNameUser.setBounds(350, 410, 480, 40);

        lblPosisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPosisi.setText("Admin");
        getContentPane().add(lblPosisi);
        lblPosisi.setBounds(520, 450, 140, 20);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pofile.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1150, 920);

        setSize(new java.awt.Dimension(1166, 930));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Cancel-Primary-Click.png")));
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Cancel-Primary-Hover.png")));
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Cancel-Primary-Default.png")));
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMousePressed
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Cancel-Primary-Click.png")));
    }//GEN-LAST:event_btnCancelMousePressed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (!counterButton) {
            counterButton = true;
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Save-Primary-Default.png")));
            UserDataControler controler = new UserDataControler(null, null, null, null, null, null, null, role);
            controler.SetEditableProfile(txtNik, txtName, txtNoHp, txtAlamat);
            return;
        }
        
        String idUser = txtUserId.getText();
        String nik = txtNik.getText();
        String namaUser = txtName.getText();
        String noHp = txtNoHp.getText();
        String alamat = txtAlamat.getText();
        String username = txtUsername.getText();
        UserDataControler controler = new UserDataControler(username, null, idUser, namaUser, noHp, alamat, nik, role);
        controler.SetNikLama(nikLama);
        controler.SetNoHpLama(noHpLama);
        controler.SetUsernameLama(usernameLama);
        boolean succes = controler.UpdateProfile();
        if (succes) {
            lblNameUser.setText(namaUser);
            dispose();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        if (counterButton) {
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Save-Primary-Hover.png")));
        } else {
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Primary-Hover.png")));
        }       
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        if (counterButton) {
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Save-Primary-Default.png")));
        } else {
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Primary-Default.png")));
        }      
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMousePressed
        if (counterButton) {
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Save-Primary-Click.png")));
        } else {
            btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Primary-Click.png")));
        }  
    }//GEN-LAST:event_btnSaveMousePressed

    private void txtUserIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserIdFocusGained
        if (txtUserId.getText().equals("User ID")) {
            txtUserId.setText("");
            txtUserId.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUserIdFocusGained

    private void txtUserIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserIdFocusLost
        if (txtUserId.getText().trim().equals("")|| txtUserId.getText().length() == 0) {
            txtUserId.setText("User ID");
            txtUserId.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtUserIdFocusLost

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        if (txtName.getText().equals("Name")) {
            txtName.setText("");
            txtName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if (txtName.getText().trim().equals("")|| txtName.getText().length() == 0) {
            txtName.setText("Name");
            txtName.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtNikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNikFocusGained
        if (txtNik.getText().equals("NIK")) {
            txtNik.setText("");
            txtNik.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNikFocusGained

    private void txtNikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNikFocusLost
        if (txtNik.getText().trim().equals("")|| txtNik.getText().length() == 0) {
            txtNik.setText("NIK");
            txtNik.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNikFocusLost

    private void txtNoHpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpFocusGained
        if (txtNoHp.getText().equals("Phone Number")) {
            txtNoHp.setText("");
            txtNoHp.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNoHpFocusGained

    private void txtNoHpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpFocusLost
        if (txtNoHp.getText().trim().equals("")|| txtNoHp.getText().length() == 0) {
            txtNoHp.setText("Phone Number");
            txtNoHp.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNoHpFocusLost

    private void txtAlamatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlamatFocusGained
        if (txtAlamat.getText().equals("Address")) {
            txtAlamat.setText("");
            txtAlamat.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtAlamatFocusGained

    private void txtAlamatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlamatFocusLost
        if (txtAlamat.getText().trim().equals("")|| txtAlamat.getText().length() == 0) {
            txtAlamat.setText("Address");
            txtAlamat.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtAlamatFocusLost

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if (txtUsername.getText().equals("Username")) {
            txtUsername.setText("");
            txtUsername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if (txtUsername.getText().trim().equals("")|| txtName.getText().length() == 0) {
            txtUsername.setText("Username");
            txtUsername.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Profile dialog = new Profile(new javax.swing.JInternalFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblNameUser;
    private javax.swing.JLabel lblPosisi;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtNoHp;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
