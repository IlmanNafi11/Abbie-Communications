package UI;

import Logic.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class AddSupplier extends javax.swing.JDialog {

    private UpdateTable update;

    public AddSupplier(JInternalFrame parent, boolean modal) {
        super((JFrame) parent.getTopLevelAncestor(), modal);
        initComponents();
        this.setUndecorated(false);
        getContentPane().setBackground(new Color(255, 255, 255, 150));
        bg.setFocusable(true);
    }

    public void setSupplier(UpdateTable update) {
        this.update = update;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdSupplier = new javax.swing.JTextField();
        txtNoHp = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        cmbCategory = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Supplier");
        setResizable(false);
        getContentPane().setLayout(null);

        txtIdSupplier.setEditable(false);
        txtIdSupplier.setBackground(new java.awt.Color(255, 255, 255));
        txtIdSupplier.setForeground(new java.awt.Color(153, 153, 153));
        txtIdSupplier.setText("Supplier ID");
        txtIdSupplier.setBorder(null);
        getContentPane().add(txtIdSupplier);
        txtIdSupplier.setBounds(40, 231, 312, 50);

        txtNoHp.setForeground(new java.awt.Color(153, 153, 153));
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

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Default.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddMousePressed(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(613, 309, 100, 60);

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category", "Accessories", "Phone credit/Internet credit", "Electronic", "Part" }));
        cmbCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCategory);
        cmbCategory.setBounds(35, 155, 322, 50);

        txtName.setForeground(new java.awt.Color(153, 153, 153));
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

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add-Supllier.png"))); // NOI18N
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Click.png")));
        String kategori = (String) cmbCategory.getSelectedItem();
        String idSupplier = txtIdSupplier.getText();
        String namaSupplier = txtName.getText();
        String noHp = txtNoHp.getText();
        SupplierControler controler = new SupplierControler(idSupplier, namaSupplier, noHp, kategori);
        boolean succes = controler.InsertSupplierData();
        if (succes) {
            update.perbarui();
            dispose();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Hover.png")));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Default.png")));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMousePressed
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Click.png")));
    }//GEN-LAST:event_btnAddMousePressed

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

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        String kategori = (String) cmbCategory.getSelectedItem();
        SupplierControler controler = new SupplierControler(null, null, null, kategori);
        String getIdSupplier = controler.GenerateIdSupplier();
        txtIdSupplier.setText(getIdSupplier);
    }//GEN-LAST:event_cmbCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddSupplier dialog = new AddSupplier(new javax.swing.JInternalFrame(), true);
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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JTextField txtIdSupplier;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNoHp;
    // End of variables declaration//GEN-END:variables
}
