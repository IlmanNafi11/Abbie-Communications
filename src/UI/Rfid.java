package UI;

import Logic.LoginControler;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.event.KeyEvent;

public class Rfid extends javax.swing.JDialog {
    private JInternalFrame parentInternalFrame;
    private JFrame parentFrame;
    public Rfid(JFrame parentFrame, JInternalFrame parent, boolean modal) {
        super((JFrame) parent.getTopLevelAncestor(), modal);
        initComponents();
        this.parentInternalFrame = parent;
        this.parentFrame = parentFrame;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        txtRfid = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login With RFID");
        setResizable(false);
        getContentPane().setLayout(null);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Back-Primary-Default.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setContentAreaFilled(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackMousePressed(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(102, 556, 364, 52);

        txtRfid.setForeground(new java.awt.Color(255, 255, 255));
        txtRfid.setBorder(null);
        txtRfid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRfidKeyReleased(evt);
            }
        });
        getContentPane().add(txtRfid);
        txtRfid.setBounds(110, 450, 350, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login-RFID.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 567, 641);

        setSize(new java.awt.Dimension(583, 673));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Back-Primary-Click.png")));
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Back-Primary-Hover.png")));
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Back-Primary-Default.png")));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Back-Primary-Click.png")));
    }//GEN-LAST:event_btnBackMousePressed

    private void txtRfidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfidKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String idAkun = txtRfid.getText();
            login kelasLogin = new login(parentFrame);
            LoginControler login = new LoginControler(null, null, idAkun);
            String role = login.AuthLoginRfid();
            if (role != null) {
                String username = login.GetUsername(role, idAkun);
                MainFrame mainFrame = new MainFrame(username, role);
                mainFrame.setVisible(true);
                this.dispose();
                parentFrame.dispose();
            }
        }
    }//GEN-LAST:event_txtRfidKeyReleased

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
            java.util.logging.Logger.getLogger(Rfid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rfid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rfid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rfid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Rfid dialog = new Rfid(null,new javax.swing.JInternalFrame(), true);
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
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField txtRfid;
    // End of variables declaration//GEN-END:variables
}
