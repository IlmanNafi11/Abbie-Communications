package UI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
public class AddRestock extends javax.swing.JDialog {

    public AddRestock(JInternalFrame parent, boolean modal) {
        super((JFrame) parent.getTopLevelAncestor(), modal);
        initComponents();
        this.setUndecorated(false);
        getContentPane().setBackground(new Color(255,255,255,150));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdProduct = new javax.swing.JTextField();
        txtNamaProduk = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtNamaSupplier = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnRestock = new javax.swing.JButton();
        cmbKategori = new javax.swing.JComboBox<>();
        cmbIdSupplier = new javax.swing.JComboBox<>();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        txtIdProduct.setForeground(new java.awt.Color(153, 153, 153));
        txtIdProduct.setText("Product ID");
        txtIdProduct.setBorder(null);
        txtIdProduct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdProductFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdProductFocusLost(evt);
            }
        });
        getContentPane().add(txtIdProduct);
        txtIdProduct.setBounds(31, 221, 488, 50);

        txtNamaProduk.setForeground(new java.awt.Color(153, 153, 153));
        txtNamaProduk.setText("Product Name");
        txtNamaProduk.setBorder(null);
        txtNamaProduk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNamaProdukFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNamaProdukFocusLost(evt);
            }
        });
        getContentPane().add(txtNamaProduk);
        txtNamaProduk.setBounds(31, 297, 488, 50);

        txtQuantity.setForeground(new java.awt.Color(153, 153, 153));
        txtQuantity.setText("Quantity");
        txtQuantity.setBorder(null);
        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantityFocusLost(evt);
            }
        });
        getContentPane().add(txtQuantity);
        txtQuantity.setBounds(31, 373, 488, 50);

        txtNamaSupplier.setForeground(new java.awt.Color(153, 153, 153));
        txtNamaSupplier.setText("Supplier Name");
        txtNamaSupplier.setBorder(null);
        txtNamaSupplier.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNamaSupplierFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNamaSupplierFocusLost(evt);
            }
        });
        getContentPane().add(txtNamaSupplier);
        txtNamaSupplier.setBounds(561, 221, 488, 50);

        txtPrice.setForeground(new java.awt.Color(153, 153, 153));
        txtPrice.setText("Price");
        txtPrice.setBorder(null);
        txtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPriceFocusLost(evt);
            }
        });
        getContentPane().add(txtPrice);
        txtPrice.setBounds(561, 297, 488, 50);

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
        btnCancel.setBounds(855, 454, 96, 55);

        btnRestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Restock-Default.png"))); // NOI18N
        btnRestock.setBorder(null);
        btnRestock.setContentAreaFilled(false);
        btnRestock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestockMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRestockMousePressed(evt);
            }
        });
        btnRestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestockActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestock);
        btnRestock.setBounds(966, 454, 96, 55);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksesoris", "Pulsa", "Elektronik", "Suku Cadang" }));
        getContentPane().add(cmbKategori);
        cmbKategori.setBounds(22, 145, 506, 50);

        cmbIdSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbIdSupplier);
        cmbIdSupplier.setBounds(552, 145, 506, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add-Restock.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1080, 545);

        setSize(new java.awt.Dimension(1096, 553));
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

    private void btnRestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestockActionPerformed
        btnRestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Restock-Click.png")));
    }//GEN-LAST:event_btnRestockActionPerformed

    private void btnRestockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestockMouseEntered
        btnRestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Restock-Hover.png")));
    }//GEN-LAST:event_btnRestockMouseEntered

    private void btnRestockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestockMouseExited
        btnRestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Restock-Default.png")));
    }//GEN-LAST:event_btnRestockMouseExited

    private void btnRestockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestockMousePressed
        btnRestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Restock-Click.png")));
    }//GEN-LAST:event_btnRestockMousePressed

    private void txtIdProductFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProductFocusGained
        if (txtIdProduct.getText().equals("Product ID")) {
            txtIdProduct.setText("");
            txtIdProduct.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtIdProductFocusGained

    private void txtIdProductFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProductFocusLost
        if (txtIdProduct.getText().trim().equals("")|| txtIdProduct.getText().length() == 0) {
            txtIdProduct.setText("Product ID");
            txtIdProduct.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtIdProductFocusLost

    private void txtNamaProdukFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaProdukFocusGained
        if (txtNamaProduk.getText().equals("Product Name")) {
            txtNamaProduk.setText("");
            txtNamaProduk.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNamaProdukFocusGained

    private void txtNamaProdukFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaProdukFocusLost
        if (txtNamaProduk.getText().trim().equals("")|| txtNamaProduk.getText().length() == 0) {
            txtNamaProduk.setText("Product Name");
            txtNamaProduk.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNamaProdukFocusLost

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusGained
        if (txtQuantity.getText().equals("Quantity")) {
            txtQuantity.setText("");
            txtQuantity.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtQuantityFocusGained

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        if (txtQuantity.getText().trim().equals("")|| txtQuantity.getText().length() == 0) {
            txtQuantity.setText("Quantity");
            txtQuantity.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtQuantityFocusLost

    private void txtNamaSupplierFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaSupplierFocusGained
        if (txtNamaSupplier.getText().equals("Supplier Name")) {
            txtNamaSupplier.setText("");
            txtNamaSupplier.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNamaSupplierFocusGained

    private void txtNamaSupplierFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaSupplierFocusLost
        if (txtNamaSupplier.getText().trim().equals("")|| txtNamaSupplier.getText().length() == 0) {
            txtNamaSupplier.setText("Supplier Name");
            txtNamaSupplier.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNamaSupplierFocusLost

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        if (txtPrice.getText().equals("Price")) {
            txtPrice.setText("");
            txtPrice.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPriceFocusGained

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        if (txtPrice.getText().trim().equals("")|| txtNamaSupplier.getText().length() == 0) {
            txtPrice.setText("Price");
            txtPrice.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtPriceFocusLost

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
            java.util.logging.Logger.getLogger(AddRestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddRestock dialog = new AddRestock(new javax.swing.JInternalFrame(), true);
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
    private javax.swing.JButton btnRestock;
    private javax.swing.JComboBox<String> cmbIdSupplier;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JTextField txtIdProduct;
    private javax.swing.JTextField txtNamaProduk;
    private javax.swing.JTextField txtNamaSupplier;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}