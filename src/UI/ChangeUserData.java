package UI;

import Logic.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class ChangeUserData extends javax.swing.JDialog {
    
    private String nikLama;
    private String noHpLama;
    private UpdateTable update;
    
    public ChangeUserData(JInternalFrame parent, boolean modal) {
        super((JFrame) parent.getTopLevelAncestor(), modal);
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255, 150));
        bg.setFocusable(true);
    }
    
    public void setUserData(UpdateTable update) {
        this.update = update;
    }
    
    public void setField(String idUser, String nik, String nama, String noHp, String alamat, String posisi, String nikLama, String noHpLama) {
        txtUserId.setText(idUser);
        txtNik.setText(nik);
        txtName.setText(nama);
        txtHp.setText(noHp);
        txtAlamat.setText(alamat);
        cmbPosisi.setSelectedItem(posisi);
        this.nikLama = nikLama;
        this.noHpLama = noHpLama;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnChange = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtUserId = new javax.swing.JTextField();
        txtNik = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtHp = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        cmbPosisi = new javax.swing.JComboBox<>();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        btnChange.setBorder(null);
        btnChange.setContentAreaFilled(false);
        btnChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChangeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChangeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnChangeMousePressed(evt);
            }
        });
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        getContentPane().add(btnChange);
        btnChange.setBounds(992, 379, 90, 50);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Cancel-Primary-Default.png"))); // NOI18N
        btnCancel.setBorder(null);
        btnCancel.setContentAreaFilled(false);
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
        btnCancel.setBounds(881, 379, 90, 50);

        txtUserId.setEditable(false);
        txtUserId.setBackground(new java.awt.Color(255, 255, 255));
        txtUserId.setForeground(new java.awt.Color(153, 153, 153));
        txtUserId.setText("User ID");
        txtUserId.setToolTipText("");
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
        txtUserId.setBounds(53, 146, 490, 45);

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
        txtNik.setBounds(53, 222, 490, 45);

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
        txtName.setBounds(53, 298, 490, 45);

        txtHp.setForeground(new java.awt.Color(153, 153, 153));
        txtHp.setText("Phone Number");
        txtHp.setBorder(null);
        txtHp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHpFocusLost(evt);
            }
        });
        getContentPane().add(txtHp);
        txtHp.setBounds(583, 146, 490, 45);

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
        txtAlamat.setBounds(583, 222, 490, 45);

        cmbPosisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Position", "admin", "teknisi", "owner" }));
        getContentPane().add(cmbPosisi);
        cmbPosisi.setBounds(575, 296, 506, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Change-Users.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1125, 494);

        setSize(new java.awt.Dimension(1141, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Change-Click.png")));
        String idUser = txtUserId.getText();
        String nik = txtNik.getText();
        String nama = txtName.getText();
        String noHp = txtHp.getText();
        String alamat = txtAlamat.getText();
        String posisi = (String) cmbPosisi.getSelectedItem();
        UserDataControler controler = new UserDataControler(null, idUser, nama, noHp, alamat, nik, posisi);
        controler.SetNikLama(nikLama);
        controler.SetNoHpLama(noHpLama);
        boolean succes = controler.ChangeUserData();
        if (succes) {
            update.perbarui();
            dispose();
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnChangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeMouseEntered
        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Change-Hover.png")));
    }//GEN-LAST:event_btnChangeMouseEntered

    private void btnChangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeMouseExited
        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Change-Default.png")));
    }//GEN-LAST:event_btnChangeMouseExited

    private void btnChangeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeMousePressed
        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Change-Click.png")));
    }//GEN-LAST:event_btnChangeMousePressed

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

    private void txtUserIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserIdFocusGained
//        if (txtName.getText().equals("User ID")) {
//            txtName.setText("");
//            txtName.setForeground(Color.BLACK);
//        }
    }//GEN-LAST:event_txtUserIdFocusGained

    private void txtUserIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserIdFocusLost
//        if (txtName.getText().trim().equals("")|| txtName.getText().length() == 0) {
//            txtName.setText("User ID");
//            txtName.setForeground(new Color(153,153,153));
//        }
    }//GEN-LAST:event_txtUserIdFocusLost

    private void txtNikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNikFocusGained
        if (txtName.getText().equals("NIK")) {
            txtName.setText("");
            txtName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNikFocusGained

    private void txtNikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNikFocusLost
        if (txtName.getText().trim().equals("") || txtName.getText().length() == 0) {
            txtName.setText("NIK");
            txtName.setForeground(new Color(153, 153, 153));
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

    private void txtHpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHpFocusGained
        if (txtName.getText().equals("Phone Number")) {
            txtName.setText("");
            txtName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtHpFocusGained

    private void txtHpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHpFocusLost
        if (txtName.getText().trim().equals("") || txtName.getText().length() == 0) {
            txtName.setText("Phone Number");
            txtName.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtHpFocusLost

    private void txtAlamatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlamatFocusGained
        if (txtName.getText().equals("Address")) {
            txtName.setText("");
            txtName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtAlamatFocusGained

    private void txtAlamatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlamatFocusLost
        if (txtName.getText().trim().equals("") || txtName.getText().length() == 0) {
            txtName.setText("Address");
            txtName.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtAlamatFocusLost

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
            java.util.logging.Logger.getLogger(ChangeUserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeUserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeUserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeUserData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeUserData dialog = new ChangeUserData(new javax.swing.JInternalFrame(), true);
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
    private javax.swing.JButton btnChange;
    private javax.swing.JComboBox<String> cmbPosisi;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtHp;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
