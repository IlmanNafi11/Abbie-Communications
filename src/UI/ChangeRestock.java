package UI;

import Logic.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class ChangeRestock extends javax.swing.JDialog {

    private UpdateTable update;
    private String idTransaksi;

    public ChangeRestock(JInternalFrame parent, boolean modal) {
        super((JFrame) parent.getTopLevelAncestor(), modal);
        initComponents();
        this.setUndecorated(false);
        getContentPane().setBackground(new Color(255, 255, 255, 150));
    }

    public void setRestock(UpdateTable update) {
        this.update = update;
    }

    public void SetField(String idTransaksi, String kategori, String idProduk, String namaProduk, int jumlah, String idSupplier, String namaSupplier, int harga) {
        this.idTransaksi = idTransaksi;
        cmbKategori.setSelectedItem(kategori);
        cmbProductId.setSelectedItem(idProduk);
        cmbIdSupplier.setSelectedItem(idSupplier);
        txtQuantity.setText(String.valueOf(jumlah));
        txtPrice.setText(String.valueOf(harga));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNamaProduk = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtNamaSupplier = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        cmbKategori = new javax.swing.JComboBox<>();
        cmbIdSupplier = new javax.swing.JComboBox<>();
        cmbProductId = new javax.swing.JComboBox<>();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Data");
        setResizable(false);
        getContentPane().setLayout(null);

        txtNamaProduk.setEditable(false);
        txtNamaProduk.setBackground(new java.awt.Color(255, 255, 255));
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
        txtNamaProduk.setBounds(50, 297, 488, 50);

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
        txtQuantity.setBounds(50, 373, 488, 50);

        txtNamaSupplier.setEditable(false);
        txtNamaSupplier.setBackground(new java.awt.Color(255, 255, 255));
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
        txtNamaSupplier.setBounds(580, 221, 488, 50);

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
        txtPrice.setBounds(580, 297, 488, 50);

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
        btnCancel.setBounds(855, 454, 96, 55);

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
        btnChange.setBounds(966, 454, 96, 55);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category", "Accessories", "Phone credit/Internet credit", "Electronic", "Part" }));
        cmbKategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKategoriActionPerformed(evt);
            }
        });
        getContentPane().add(cmbKategori);
        cmbKategori.setBounds(40, 145, 506, 50);

        cmbIdSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier ID" }));
        cmbIdSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbIdSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdSupplierActionPerformed(evt);
            }
        });
        getContentPane().add(cmbIdSupplier);
        cmbIdSupplier.setBounds(570, 145, 506, 50);

        cmbProductId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Product ID" }));
        cmbProductId.setEnabled(false);
        cmbProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductIdActionPerformed(evt);
            }
        });
        getContentPane().add(cmbProductId);
        cmbProductId.setBounds(40, 221, 506, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Change-Restock-Product.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1115, 578);

        setSize(new java.awt.Dimension(1132, 629));
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
        String kategori = (String) cmbKategori.getSelectedItem();
        String idProduk = (String) cmbProductId.getSelectedItem();
        String namaProduk = txtNamaProduk.getText();
        int jumlah = Integer.parseInt(txtQuantity.getText());
        String idSupplier = (String) cmbIdSupplier.getSelectedItem();
        String namaSupplier = txtNamaSupplier.getText();
        int harga = Integer.parseInt(txtPrice.getText());
        RestockControler controler = new RestockControler(idTransaksi, kategori, idProduk, namaProduk, jumlah, idSupplier, namaSupplier, harga);
        controler.ValidatePrice(txtPrice);
        controler.ValidateQuantity(txtQuantity);
        boolean succes = controler.ChangeData();
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

    private void txtNamaProdukFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaProdukFocusGained
        if (txtNamaProduk.getText().equals("Product Name")) {
            txtNamaProduk.setText("");
            txtNamaProduk.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNamaProdukFocusGained

    private void txtNamaProdukFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaProdukFocusLost
        if (txtNamaProduk.getText().trim().equals("") || txtNamaProduk.getText().length() == 0) {
            txtNamaProduk.setText("Product Name");
            txtNamaProduk.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNamaProdukFocusLost

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusGained
        if (txtQuantity.getText().equals("Quantity")) {
            txtQuantity.setText("");
            txtQuantity.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtQuantityFocusGained

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        if (txtQuantity.getText().trim().equals("") || txtQuantity.getText().length() == 0) {
            txtQuantity.setText("Quantity");
            txtQuantity.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtQuantityFocusLost

    private void txtNamaSupplierFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaSupplierFocusGained
        if (txtNamaSupplier.getText().equals("Supplier Name")) {
            txtNamaSupplier.setText("");
            txtNamaSupplier.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNamaSupplierFocusGained

    private void txtNamaSupplierFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaSupplierFocusLost
        if (txtNamaSupplier.getText().trim().equals("") || txtNamaSupplier.getText().length() == 0) {
            txtNamaSupplier.setText("Supplier Name");
            txtNamaSupplier.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNamaSupplierFocusLost

    private void txtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusGained
        if (txtPrice.getText().equals("Price")) {
            txtPrice.setText("");
            txtPrice.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPriceFocusGained

    private void txtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPriceFocusLost
        if (txtPrice.getText().trim().equals("") || txtNamaSupplier.getText().length() == 0) {
            txtPrice.setText("Price");
            txtPrice.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtPriceFocusLost

    private void cmbKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKategoriActionPerformed
        String kategori = (String) cmbKategori.getSelectedItem();
        // get id supplier berdasarkan kategori
        RestockControler controler = new RestockControler(null, kategori, null, null, 0, null, null, 0);
        if (kategori != null) {
            controler.SetComboProdukId(cmbProductId);
            controler.SetComboIdSupplier(cmbIdSupplier);
            cmbProductId.addItem("Product ID");
            cmbProductId.setSelectedItem("Product ID");
            cmbIdSupplier.addItem("Supplier ID");
            cmbIdSupplier.setSelectedItem("Supplier ID");
        }
    }//GEN-LAST:event_cmbKategoriActionPerformed

    private void cmbProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductIdActionPerformed
        String produkId = (String) cmbProductId.getSelectedItem();
        String kategori = (String) cmbKategori.getSelectedItem();
        RestockControler controler = new RestockControler(null, kategori, produkId, null, 0, null, null, 0);
        controler.SetTxtProdukName(produkId, txtNamaProduk);
    }//GEN-LAST:event_cmbProductIdActionPerformed

    private void cmbIdSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdSupplierActionPerformed
        String idSupplier = (String) cmbIdSupplier.getSelectedItem();
        String produkId = (String) cmbProductId.getSelectedItem();
        String kategori = (String) cmbKategori.getSelectedItem();
        RestockControler controler = new RestockControler(null, kategori, produkId, null, 0, idSupplier, null, 0);
        controler.setTxtSupplierName(idSupplier, txtNamaSupplier);
    }//GEN-LAST:event_cmbIdSupplierActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeRestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeRestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeRestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeRestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeRestock dialog = new ChangeRestock(new javax.swing.JInternalFrame(), true);
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
    private javax.swing.JComboBox<String> cmbIdSupplier;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JComboBox<String> cmbProductId;
    private javax.swing.JTextField txtNamaProduk;
    private javax.swing.JTextField txtNamaSupplier;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
