package UI;

import Logic.SupplierControler;
import Logic.UpdateTable;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class ChangeSupplier extends javax.swing.JDialog {

    private UpdateTable update;

    public ChangeSupplier(JInternalFrame parent, boolean modal) {
        super((JFrame) parent.getTopLevelAncestor(), modal);
        initComponents();
        this.setUndecorated(false);
        getContentPane().setBackground(new Color(255, 255, 255, 150));
        bg.setFocusable(true);
    }

    public void setSupplier(UpdateTable update) {
        this.update = update;
    }

    public void setField(String idSupplier, String namaSupplier, String noHp, String kategori) {
        this.txtIdSupplier.setText(idSupplier);
        this.txtName.setText(namaSupplier);
        this.txtNoHp.setText(noHp);
        this.cmbCategory.setSelectedItem(kategori);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        txtNoHp = new javax.swing.JTextField();
        txtIdSupplier = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        cmbCategory = new javax.swing.JComboBox<>();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Supplier");
        setResizable(false);
        getContentPane().setLayout(null);

        txtName.setText("Supplier Name");
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
        txtName.setBounds(388, 155, 312, 50);

        txtNoHp.setText("Telephone Number");
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
        txtNoHp.setBounds(388, 231, 312, 50);

        txtIdSupplier.setEditable(false);
        txtIdSupplier.setBackground(new java.awt.Color(255, 255, 255));
        txtIdSupplier.setText("Supplier ID");
        txtIdSupplier.setBorder(null);
        getContentPane().add(txtIdSupplier);
        txtIdSupplier.setBounds(40, 231, 312, 50);

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
        btnCancel.setBounds(505, 314, 95, 50);

        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Change-Default.png"))); // NOI18N
        btnChange.setBorder(null);
        btnChange.setContentAreaFilled(false);
        btnChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnChange.setBounds(613, 309, 100, 60);

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category", "Accessories", "Phone credit/Internet credit", "Electronic", "Part" }));
        cmbCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cmbCategory);
        cmbCategory.setBounds(35, 155, 322, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Change-Supllier.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 749, 415);

        setSize(new java.awt.Dimension(765, 455));
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

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Change-Click.png")));
        String kategori = (String) cmbCategory.getSelectedItem();
        String idSupplier = txtIdSupplier.getText();
        String namaSupplier = txtName.getText();
        String noHp = txtNoHp.getText();
        SupplierControler controler = new SupplierControler(idSupplier, namaSupplier, noHp, kategori);
        boolean succes = controler.ChangeSupplierData();
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

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        if (txtName.getText().equals("Supplier Name")) {
            txtName.setText("");
            txtName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if (txtName.getText().trim().equals("") || txtName.getText().length() == 0) {
            txtName.setText("Supplier Name");
            txtName.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtNoHpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpFocusGained
        if (txtNoHp.getText().equals("Telephone Number")) {
            txtNoHp.setText("");
            txtNoHp.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNoHpFocusGained

    private void txtNoHpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpFocusLost
        if (txtNoHp.getText().trim().equals("") || txtNoHp.getText().length() == 0) {
            txtNoHp.setText("Telephone Number");
            txtNoHp.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNoHpFocusLost

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
            java.util.logging.Logger.getLogger(ChangeSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeSupplier dialog = new ChangeSupplier(new javax.swing.JInternalFrame(), true);
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
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JTextField txtIdSupplier;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNoHp;
    // End of variables declaration//GEN-END:variables
}
