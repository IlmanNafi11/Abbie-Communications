package UI;

import Logic.UpdateTable;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import Logic.*;

public class AddMember extends javax.swing.JDialog {

    private UpdateTable update;

    public AddMember(JInternalFrame parent, boolean modal) {
        super((JFrame) parent.getTopLevelAncestor(), modal);
        initComponents();
        this.setUndecorated(false);
        getContentPane().setBackground(new Color(255, 255, 255, 150));
        bg.setFocusable(true);
    }

    public void setMember(UpdateTable update) {
        this.update = update;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        txtNoHp = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Member");
        setResizable(false);
        getContentPane().setLayout(null);

        txtName.setForeground(new java.awt.Color(153, 153, 153));
        txtName.setText("Member Name");
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
        txtName.setBounds(46, 157, 310, 50);

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
        txtNoHp.setBounds(46, 233, 310, 50);

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
        getContentPane().add(txtAddress);
        txtAddress.setBounds(46, 309, 310, 50);

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
        btnCancel.setBounds(159, 397, 95, 50);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Default.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setContentAreaFilled(false);
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
        btnAdd.setBounds(270, 397, 95, 50);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add-Member.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 401, 488);

        setSize(new java.awt.Dimension(417, 524));
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
        String nama = txtName.getText();
        String noHp = txtNoHp.getText();
        String alamat = txtAddress.getText();
        MemberControler controler = new MemberControler(null, noHp, nama, alamat);
        boolean succes = controler.InsertMember();
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

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        if (txtName.getText().equals("Member Name")) {
            txtName.setText("");
            txtName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if (txtName.getText().trim().equals("") || txtName.getText().length() == 0) {
            txtName.setText("Member Name");
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

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        if (txtAddress.getText().equals("Address")) {
            txtAddress.setText("");
            txtAddress.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        if (txtAddress.getText().trim().equals("") || txtNoHp.getText().length() == 0) {
            txtAddress.setText("Address");
            txtAddress.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtAddressFocusLost

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
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddMember dialog = new AddMember(new javax.swing.JInternalFrame(), true);
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
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNoHp;
    // End of variables declaration//GEN-END:variables
}
