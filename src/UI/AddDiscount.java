package UI;

import Logic.PromoContoler;
import Logic.UpdateTable;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class AddDiscount extends javax.swing.JDialog {

    private UpdateTable update;

    public AddDiscount(JInternalFrame parent, boolean modal) {
        super((JFrame) parent.getTopLevelAncestor(), modal);
        initComponents();
        this.setUndecorated(false);
        getContentPane().setBackground(new Color(255, 255, 255, 150));
        bg.setFocusable(true);
    }

    public void setDiskon(UpdateTable update) {
        this.update = update;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMinimum = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        cmbStatus = new javax.swing.JComboBox<>();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Discount");
        setResizable(false);
        getContentPane().setLayout(null);

        txtMinimum.setForeground(new java.awt.Color(153, 153, 153));
        txtMinimum.setText("Minimum amount");
        txtMinimum.setBorder(null);
        txtMinimum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMinimumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMinimumFocusLost(evt);
            }
        });
        getContentPane().add(txtMinimum);
        txtMinimum.setBounds(50, 155, 310, 50);

        txtAmount.setForeground(new java.awt.Color(153, 153, 153));
        txtAmount.setText("Amount");
        txtAmount.setBorder(null);
        txtAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAmountFocusLost(evt);
            }
        });
        getContentPane().add(txtAmount);
        txtAmount.setBounds(50, 232, 310, 50);

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
        btnCancel.setBounds(159, 390, 95, 50);

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
        btnAdd.setBounds(270, 390, 95, 50);

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "Active", "Non Active" }));
        cmbStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cmbStatus);
        cmbStatus.setBounds(40, 308, 320, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add-Discount.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 401, 486);

        setSize(new java.awt.Dimension(418, 525));
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
        String status = (String) cmbStatus.getSelectedItem();
        PromoContoler controler = new PromoContoler(null, status);
        controler.ValidateMinPurchase(txtMinimum);
        controler.ValidateValue(txtAmount);
        boolean succes = controler.InsertDiskon();
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

    private void txtAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmountFocusGained
        if (txtAmount.getText().equals("Amount")) {
            txtAmount.setText("");
            txtAmount.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtAmountFocusGained

    private void txtAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAmountFocusLost
        if (txtAmount.getText().trim().equals("") || txtAmount.getText().length() == 0) {
            txtAmount.setText("Amount");
            txtAmount.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtAmountFocusLost

    private void txtMinimumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinimumFocusLost
        if (txtMinimum.getText().trim().equals("") || txtMinimum.getText().length() == 0) {
            txtMinimum.setText("Minimum amount");
            txtMinimum.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtMinimumFocusLost

    private void txtMinimumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinimumFocusGained
        if (txtMinimum.getText().equals("Minimum amount")) {
            txtMinimum.setText("");
            txtMinimum.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtMinimumFocusGained

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
            java.util.logging.Logger.getLogger(AddDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddDiscount dialog = new AddDiscount(new javax.swing.JInternalFrame(), true);
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
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtMinimum;
    // End of variables declaration//GEN-END:variables
}
