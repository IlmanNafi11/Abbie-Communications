package UI;

import Logic.LaporanControler;
import Logic.LoginControler;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class MenuOwner extends javax.swing.JInternalFrame {

    private String username;
    private String role;

    public MenuOwner() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    public void SetUser(String username, String role) {
        this.username = username;
        this.role = role;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDashboard = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnPenjualan = new javax.swing.JButton();
        btnService = new javax.swing.JButton();
        btnMember = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnRestock = new javax.swing.JButton();
        btnUserData = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        btnService.setBounds(46, 414, 252, 64);

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
        btnMember.setBounds(46, 505, 252, 64);

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
        btnSupplier.setBounds(46, 596, 252, 64);

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
        btnRestock.setBounds(46, 687, 252, 64);

        btnUserData.setBackground(new java.awt.Color(255, 51, 255));
        btnUserData.setBorder(null);
        btnUserData.setContentAreaFilled(false);
        btnUserData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUserDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUserDataMouseExited(evt);
            }
        });
        btnUserData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnUserData);
        btnUserData.setBounds(46, 778, 252, 64);

        btnReport.setBackground(new java.awt.Color(255, 51, 255));
        btnReport.setBorder(null);
        btnReport.setContentAreaFilled(false);
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportMouseExited(evt);
            }
        });
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        getContentPane().add(btnReport);
        btnReport.setBounds(46, 869, 252, 64);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main-Menu-Owner.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 345, 1024);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Dashboard-Click.png")));
        Dashboard ds = new Dashboard();
        ds.SetProfile(username, role);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(ds);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Dashboard-Hover.png")));
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
        tranP.SetProfile(username, role);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(tranP);
    }//GEN-LAST:event_btnPenjualanActionPerformed

    private void btnPenjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseEntered
        btnPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Sales-Transaction-Hover.png")));
    }//GEN-LAST:event_btnPenjualanMouseEntered

    private void btnPenjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPenjualanMouseExited
        btnPenjualan.setIcon(null);
    }//GEN-LAST:event_btnPenjualanMouseExited

    private void btnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceActionPerformed
        btnService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Service-Transaction-Click.png")));
        TransaksiService transS = new TransaksiService();
        transS.SetProfile(username, role);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(transS);
    }//GEN-LAST:event_btnServiceActionPerformed

    private void btnServiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiceMouseEntered
        btnService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Service-Transaction-Hover.png")));
    }//GEN-LAST:event_btnServiceMouseEntered

    private void btnServiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiceMouseExited
        btnService.setIcon(null);
    }//GEN-LAST:event_btnServiceMouseExited

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

    private void btnUserDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDataActionPerformed
        btnUserData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-User-Data-Click.png")));
        UserData userData = new UserData();
        userData.SetProfile(username, role);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(userData);
    }//GEN-LAST:event_btnUserDataActionPerformed

    private void btnUserDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserDataMouseEntered
        btnUserData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-User-Data-Hover.png")));
    }//GEN-LAST:event_btnUserDataMouseEntered

    private void btnUserDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserDataMouseExited
        btnUserData.setIcon(null);
    }//GEN-LAST:event_btnUserDataMouseExited

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Report-Click.png")));
        Report report = new Report();
        report.SetProfile(username, role);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(report);
        LoginControler loginControler = new LoginControler(username, null);
        ArrayList<String> IdUser = loginControler.DataProfile();
        LaporanControler laporanControler = new LaporanControler();
        laporanControler.setIdUser(IdUser.get(0));
        laporanControler.InsertLaporan();
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseEntered
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Menu-Report-Hover.png")));
    }//GEN-LAST:event_btnReportMouseEntered

    private void btnReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseExited
        btnReport.setIcon(null);
    }//GEN-LAST:event_btnReportMouseExited

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        btnSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Label-Sign-Out-Click.png")));
        tutupMainFrame();
        bukaWelcomeFrame();
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
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnPenjualan;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnRestock;
    private javax.swing.JButton btnService;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton btnUserData;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
