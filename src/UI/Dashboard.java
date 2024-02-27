package UI;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Dashboard extends javax.swing.JInternalFrame {

    public Dashboard() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1095, 1024));
        getContentPane().setLayout(null);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dasboard.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1095, 1024);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    // End of variables declaration//GEN-END:variables
}
