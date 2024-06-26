package UI;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.JInternalFrame;

public class MainFrame extends javax.swing.JFrame {

    private String username;
    private String role;
    private String idUser;
    
    public MainFrame(String username, String role) {
        initComponents();
        this.username = username;
        this.role = role;
        DisplayFirst();
        DisplayMenu();
        SetIcon();
    }
    
    private void SetIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo Abbie Communications.png")));
    }
    
    public void DisplayFirst(){
        Dashboard ds = new Dashboard();
        ds.SetProfile(username, role);
        DesktopPaneBody.add(ds);
        ds.setVisible(true);
    }
    
    public void DisplayMenu() {
        if (role.equalsIgnoreCase("owner")) {
            MenuOwner menu = new MenuOwner();
            menu.SetUser(username, role);
            DesktopPaneMenu.add(menu);
            menu.setVisible(true);
        } else if (role.equalsIgnoreCase("admin")) {
            MenuAdmin menu = new MenuAdmin();
            menu.SetUser(username, role);
            DesktopPaneMenu.add(menu);
            menu.setVisible(true);
        } else if (role.equalsIgnoreCase("teknisi")) {
            MenuTeknisi menu = new MenuTeknisi();
            menu.SetUser(username, role);
            DesktopPaneMenu.add(menu);
            menu.setVisible(true);
        }
    }
    
    public void gantiKonten(JInternalFrame kontenBaru) {
        DesktopPaneBody.removeAll();
        DesktopPaneBody.add(kontenBaru);
        kontenBaru.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPaneMenu = new javax.swing.JDesktopPane();
        DesktopPaneBody = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abbie Communications Apps");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(DesktopPaneMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 345, 1024));

        javax.swing.GroupLayout DesktopPaneBodyLayout = new javax.swing.GroupLayout(DesktopPaneBody);
        DesktopPaneBody.setLayout(DesktopPaneBodyLayout);
        DesktopPaneBodyLayout.setHorizontalGroup(
            DesktopPaneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
        );
        DesktopPaneBodyLayout.setVerticalGroup(
            DesktopPaneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );

        getContentPane().add(DesktopPaneBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String username = null;
        String role = null;
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame(username, role).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane DesktopPaneBody;
    private javax.swing.JDesktopPane DesktopPaneMenu;
    // End of variables declaration//GEN-END:variables
}
