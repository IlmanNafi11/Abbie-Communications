package UI;

import Logic.ExceptionHandler;
import Logic.LaporanControler;
import Logic.LoginControler;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MenuAdmin extends javax.swing.JInternalFrame {

    private String username;
    private String role;
    private String userId;
    
    public MenuAdmin() {
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

        btnPenjualan.setBackground(new java.awt.Color(255, 51, 255));
        btnPenjualan.setBorder(null);
        btnPenjualan.setContentAreaFilled(false);
        btnPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnRestock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnSignOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main-Menu-Admin.png"))); // NOI18N
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

    private void btnPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjualanActionPerformed
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Sales-Transaction-Click.png")));
        TransaksiPenjualan tranP = new TransaksiPenjualan();
        tranP.SetProfile(username, role, userId);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(tranP);
    }//GEN-LAST:event_btnPenjualanActionPerformed

    private void btnPenjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseEntered
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Sales-Transaction-Hover.png")));
    }//GEN-LAST:event_btnPenjualanMouseEntered

    private void btnPenjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseExited
        btnPenjualan.setIcon(null);
    }//GEN-LAST:event_btnPenjualanMouseExited

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        btnMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Member-Click.png")));
        Member member = new Member();
        member.SetProfile(username, role);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(member);
    }//GEN-LAST:event_btnMemberActionPerformed

    private void btnMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMouseEntered
        btnMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Member-Hover.png")));
    }//GEN-LAST:event_btnMemberMouseEntered

    private void btnMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMouseExited
        btnMember.setIcon(null);
    }//GEN-LAST:event_btnMemberMouseExited

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        btnSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Supplier-Click.png")));
        Supplier supplier = new Supplier();
        supplier.SetProfile(username, role);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(supplier);
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseEntered
        btnSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Supplier-Hover.png")));
    }//GEN-LAST:event_btnSupplierMouseEntered

    private void btnSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseExited
        btnSupplier.setIcon(null);
    }//GEN-LAST:event_btnSupplierMouseExited

    private void btnRestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestockActionPerformed
        btnRestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Restock-Click.png")));
        Restock restock = new Restock();
        restock.SetProfile(username, role);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(restock);
    }//GEN-LAST:event_btnRestockActionPerformed

    private void btnRestockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestockMouseEntered
        btnRestock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Restock-Hover.png")));
    }//GEN-LAST:event_btnRestockMouseEntered

    private void btnRestockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestockMouseExited
        btnRestock.setIcon(null);
    }//GEN-LAST:event_btnRestockMouseExited

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
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnPenjualan;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnRestock;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton btnSupplier;
    // End of variables declaration//GEN-END:variables
}
