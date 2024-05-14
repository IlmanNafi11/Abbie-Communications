package UI;

import Logic.ProductControler;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class PrintProduct extends javax.swing.JDialog {
    
    public PrintProduct(JInternalFrame parent, boolean modal) {
        super((JFrame) parent.getTopLevelAncestor(), modal);
        initComponents();
        this.setUndecorated(false);
        getContentPane().setBackground(new Color(255,255,255,150));
        setAlwaysOnTop(true);
        bg.setFocusable(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPrintAll = new javax.swing.JLabel();
        cmbJumlah = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        txtIdProduct = new javax.swing.JTextField();
        txtNamaProduk = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        lblBarcode = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Print Product");
        setAlwaysOnTop(true);
        getContentPane().setLayout(null);

        lblPrintAll.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPrintAll.setText("Print All Product?");
        lblPrintAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrintAllMouseClicked(evt);
            }
        });
        getContentPane().add(lblPrintAll);
        lblPrintAll.setBounds(422, 130, 150, 25);

        cmbJumlah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select print amount", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        getContentPane().add(cmbJumlah);
        cmbJumlah.setBounds(302, 237, 258, 50);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Icon-Search.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(234, 178, 40, 32);

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
        txtIdProduct.setBounds(40, 169, 190, 50);

        txtNamaProduk.setEditable(false);
        txtNamaProduk.setBackground(new java.awt.Color(255, 255, 255));
        txtNamaProduk.setForeground(new java.awt.Color(153, 153, 153));
        txtNamaProduk.setText("Product Name");
        txtNamaProduk.setBorder(null);
        getContentPane().add(txtNamaProduk);
        txtNamaProduk.setBounds(315, 169, 234, 50);

        txtPrice.setEditable(false);
        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice.setForeground(new java.awt.Color(153, 153, 153));
        txtPrice.setText("Price");
        txtPrice.setBorder(null);
        getContentPane().add(txtPrice);
        txtPrice.setBounds(40, 236, 230, 50);
        getContentPane().add(lblBarcode);
        lblBarcode.setBounds(300, 310, 260, 90);

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
        btnCancel.setBounds(360, 420, 96, 55);

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Print-Primary-Default.png"))); // NOI18N
        btnPrint.setBorder(null);
        btnPrint.setContentAreaFilled(false);
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrintMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrintMousePressed(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint);
        btnPrint.setBounds(470, 420, 96, 55);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Print Product.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(-10, 0, 600, 510);

        setSize(new java.awt.Dimension(609, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Cancel-Primary-Hover.png")));
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Cancel-Primary-Default.png")));
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMousePressed
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Cancel-Primary-Click.png")));
    }//GEN-LAST:event_btnCancelMousePressed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Cancel-Primary-Click.png")));
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseEntered
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Print-Primary-Hover.png")));
    }//GEN-LAST:event_btnPrintMouseEntered

    private void btnPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseExited
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Print-Primary-Default.png")));
    }//GEN-LAST:event_btnPrintMouseExited

    private void btnPrintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMousePressed
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Print-Primary-click.png")));
    }//GEN-LAST:event_btnPrintMousePressed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Print-Primary-click.png")));
        setAlwaysOnTop(false);
        ProductControler controler = new ProductControler(null, null);
        boolean succes = controler.PrintDataSelected(txtIdProduct, cmbJumlah);
        if (succes) {
            dispose();
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void lblPrintAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrintAllMouseClicked
        ProductControler controler = new ProductControler(null, null);
        controler.PrintAllProduct();
        dispose();
    }//GEN-LAST:event_lblPrintAllMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        ProductControler controler = new ProductControler(null, null);
        controler.SetDataToPrint(txtIdProduct, txtNamaProduk, txtPrice);
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(PrintProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrintProduct dialog = new PrintProduct(new javax.swing.JInternalFrame(), true);
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
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbJumlah;
    private javax.swing.JLabel lblBarcode;
    private javax.swing.JLabel lblPrintAll;
    private javax.swing.JTextField txtIdProduct;
    private javax.swing.JTextField txtNamaProduk;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
