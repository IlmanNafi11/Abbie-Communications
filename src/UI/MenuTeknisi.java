package UI;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MenuTeknisi extends javax.swing.JInternalFrame {
    public MenuTeknisi() {
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
        btnService = new javax.swing.JButton();
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

        btnService.setBackground(new java.awt.Color(255, 51, 255));
        btnService.setBorder(null);
        btnService.setContentAreaFilled(false);
        btnService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnServiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnServiceMouseExited(evt);
            }
        });
        btnService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceActionPerformed(evt);
            }
        });
        getContentPane().add(btnService);
        btnService.setBounds(46, 323, 252, 64);

        btnSignOut.setBackground(new java.awt.Color(255, 51, 255));
        btnSignOut.setBorder(null);
        btnSignOut.setContentAreaFilled(false);
        getContentPane().add(btnSignOut);
        btnSignOut.setBounds(46, 960, 252, 64);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main-Menu-Teknisi.png"))); // NOI18N
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

    private void btnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServiceActionPerformed

    private void btnServiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiceMouseEntered
        btnService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Menu-Hover.png")));
    }//GEN-LAST:event_btnServiceMouseEntered

    private void btnServiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiceMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServiceMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnService;
    private javax.swing.JButton btnSignOut;
    // End of variables declaration//GEN-END:variables
}
