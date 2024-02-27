package UI;

public class MainFrame extends javax.swing.JFrame {

    private String role = "owner";

    public MainFrame() {
        initComponents();
        DisplayMenu();
        Dashboard ds = new Dashboard();
        DesktopPaneBody.add(ds);
        ds.setVisible(true);
    }

    public MainFrame(String role) {
        this.role = role;
    }

    public void DisplayMenu() {
        if (role.equalsIgnoreCase("owner")) {
            MenuOwner menu = new MenuOwner();
            DesktopPaneMenu.add(menu);
            menu.setVisible(true);
        } else if (role.equalsIgnoreCase("admin")) {
            
        } else {
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPaneMenu = new javax.swing.JDesktopPane();
        DesktopPaneBody = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPaneBody;
    private javax.swing.JDesktopPane DesktopPaneMenu;
    // End of variables declaration//GEN-END:variables
}
