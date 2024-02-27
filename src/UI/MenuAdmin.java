package UI;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MenuAdmin extends javax.swing.JInternalFrame {
    public MenuAdmin() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDashboard = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnPenjualan = new javax.swing.JButton();
        btnMember = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnRestock = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(345, 1060));
        getContentPane().setLayout(null);

        btnDashboard.setBackground(new java.awt.Color(255, 51, 255));
        btnDashboard.setBorder(null);
        btnDashboard.setContentAreaFilled(false);
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardMouseExited(evt);
            }
        });
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });
        getContentPane().add(btnDashboard);
        btnDashboard.setBounds(46, 141, 252, 64);

        btnProduct.setBackground(new java.awt.Color(255, 51, 255));
        btnProduct.setBorder(null);
        btnProduct.setContentAreaFilled(false);
        btnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductMouseExited(evt);
            }
        });
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnProduct);
        btnProduct.setBounds(46, 232, 252, 64);

        btnPenjualan.setBackground(new java.awt.Color(255, 51, 255));
        btnPenjualan.setBorder(null);
        btnPenjualan.setContentAreaFilled(false);
        btnPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPenjualanMouseExited(evt);
            }
        });
        btnPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjualanActionPerformed(evt);
            }
        });
        getContentPane().add(btnPenjualan);
        btnPenjualan.setBounds(46, 323, 252, 64);

        btnMember.setBackground(new java.awt.Color(255, 51, 255));
        btnMember.setBorder(null);
        btnMember.setContentAreaFilled(false);
        btnMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMemberMouseExited(evt);
            }
        });
        btnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberActionPerformed(evt);
            }
        });
        getContentPane().add(btnMember);
        btnMember.setBounds(46, 414, 252, 64);

        btnSupplier.setBackground(new java.awt.Color(255, 51, 255));
        btnSupplier.setBorder(null);
        btnSupplier.setContentAreaFilled(false);
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupplierMouseExited(evt);
            }
        });
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });
        getContentPane().add(btnSupplier);
        btnSupplier.setBounds(46, 505, 252, 64);

        btnRestock.setBackground(new java.awt.Color(255, 51, 255));
        btnRestock.setBorder(null);
        btnRestock.setContentAreaFilled(false);
        btnRestock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestockMouseExited(evt);
            }
        });
        btnRestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestockActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestock);
        btnRestock.setBounds(46, 596, 252, 64);

        btnSignOut.setBackground(new java.awt.Color(255, 51, 255));
        btnSignOut.setBorder(null);
        btnSignOut.setContentAreaFilled(false);
        getContentPane().add(btnSignOut);
        btnSignOut.setBounds(46, 960, 252, 64);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main-Menu-Admin.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 345, 1024);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Menu-Hover.png")));
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Menu-Default.png")));
    }//GEN-LAST:event_btnDashboardMouseExited

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseEntered
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Menu-Hover.png")));
    }//GEN-LAST:event_btnProductMouseEntered

    private void btnProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductMouseExited

    private void btnPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjualanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPenjualanActionPerformed

    private void btnPenjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseEntered
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Menu-Hover.png")));
    }//GEN-LAST:event_btnPenjualanMouseEntered

    private void btnPenjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPenjualanMouseExited

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMemberActionPerformed

    private void btnMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMouseEntered
        btnMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Menu-Hover.png")));
    }//GEN-LAST:event_btnMemberMouseEntered

    private void btnMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMemberMouseExited

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseEntered
        btnSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Menu-Hover.png")));
    }//GEN-LAST:event_btnSupplierMouseEntered

    private void btnSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierMouseExited

    private void btnRestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestockActionPerformed

    private void btnRestockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestockMouseEntered
        btnRestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Menu-Hover.png")));
    }//GEN-LAST:event_btnRestockMouseEntered

    private void btnRestockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestockMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestockMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnPenjualan;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnRestock;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton btnSupplier;
    // End of variables declaration//GEN-END:variables
}
