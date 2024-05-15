package UI;

import Logic.ExceptionHandler;
import Logic.LaporanControler;
import Logic.LoginControler;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MenuTeknisi extends javax.swing.JInternalFrame {

    private String username;
    private String role;
    private String userId;
    
    public MenuTeknisi() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }
    
    public void SetUser(String username, String role){
        this.username = username;
        this.role = role;
        LoginControler loginControler = new LoginControler(username, null, null);
        ArrayList<String> IdUser = loginControler.DataProfile();
        this.userId = IdUser.get(0);
    }

    private void UpdateLaporan() {
        LoginControler loginControler = new LoginControler(username, null, null);
        ArrayList<String> IdUser = loginControler.DataProfile();
        LaporanControler laporanControler = new LaporanControler();
        laporanControler.setIdUser(IdUser.get(0));
        laporanControler.InsertLaporan();
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
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnSignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignOutMouseExited(evt);
            }
        });
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignOut);
        btnSignOut.setBounds(101, 961, 140, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main-Menu-Teknisi.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 345, 1024);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Dashboard-Click.png")));
        Dashboard ds = new Dashboard();
        ds.SetProfile(username, role);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(ds);
        UpdateLaporan();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Dashboard-Hover.png")));
        UpdateLaporan();
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
        btnDashboard.setIcon(null);
    }//GEN-LAST:event_btnDashboardMouseExited

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Product-Click.png")));
        Product prod = new Product();
        prod.SetProfile(username, role);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(prod);
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseEntered
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Product-Hover.png")));
    }//GEN-LAST:event_btnProductMouseEntered

    private void btnProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseExited
        btnProduct.setIcon(null);
    }//GEN-LAST:event_btnProductMouseExited

    private void btnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceActionPerformed
        btnService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Service-Transaction-Click.png")));
        TransaksiService transS = new TransaksiService();
        transS.SetProfile(username, role, userId);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(transS);
    }//GEN-LAST:event_btnServiceActionPerformed

    private void btnServiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiceMouseEntered
        btnService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Service-Transaction-Hover.png")));
    }//GEN-LAST:event_btnServiceMouseEntered

    private void btnServiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiceMouseExited
        btnService.setIcon(null);
    }//GEN-LAST:event_btnServiceMouseExited

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        btnSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Sign-Out-Click.png")));
        ExceptionHandler exceptionHandler = new ExceptionHandler();
        boolean confirm = exceptionHandler.ConfirmLogOut("Are you sure you want to exit the application?");
        if (confirm) {
            tutupMainFrame();
            bukaWelcomeFrame();
        }
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void btnSignOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignOutMouseEntered
        btnSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Sign-Out-Hover.png")));
    }//GEN-LAST:event_btnSignOutMouseEntered

    private void btnSignOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignOutMouseExited
        btnSignOut.setIcon(null);
    }//GEN-LAST:event_btnSignOutMouseExited

    private void tutupMainFrame() {
        Window window = SwingUtilities.getWindowAncestor(this);
        if (window instanceof JFrame) {
            ((JFrame) window).dispose();
        }
    }

    private void bukaWelcomeFrame() {
        welcome welcome = new welcome();
        welcome.bukaLogin();
        welcome.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnService;
    private javax.swing.JButton btnSignOut;
    // End of variables declaration//GEN-END:variables
}
