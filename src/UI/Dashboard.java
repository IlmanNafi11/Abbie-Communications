package UI;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import Logic.*;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Dashboard extends javax.swing.JInternalFrame {

    private String username;
    private String role;

    public Dashboard() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    public void SetProfile(String nama, String role) {
        lblNamaUser.setText(nama);
        lblPosisiUser.setText(role);
        this.username = nama;
        this.role = role;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJoinNow = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        lblHari = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        lblMember = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        lblIncome = new javax.swing.JLabel();
        lblExpenditure = new javax.swing.JLabel();
        lblPosisiUser = new javax.swing.JLabel();
        IconProfil = new javax.swing.JLabel();
        lblNamaUser = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1095, 1024));
        getContentPane().setLayout(null);

        btnJoinNow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Join-Now-Default.png"))); // NOI18N
        btnJoinNow.setBorder(null);
        btnJoinNow.setContentAreaFilled(false);
        btnJoinNow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJoinNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJoinNowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJoinNowMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnJoinNowMousePressed(evt);
            }
        });
        btnJoinNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinNowActionPerformed(evt);
            }
        });
        getContentPane().add(btnJoinNow);
        btnJoinNow.setBounds(832, 338, 167, 50);

        ScrollPane.setOpaque(false);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"23458724563", "samsung ultra", "1000000", "ilman", "2024-03-28"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Transaction ID", "Product Name", "Price", "Handled By", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setShowGrid(false);
        ScrollPane.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
            Table.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(ScrollPane);
        ScrollPane.setBounds(64, 540, 967, 430);

        lblHari.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblHari.setForeground(new java.awt.Color(255, 255, 255));
        lblHari.setText("Februari, 02 2024");
        getContentPane().add(lblHari);
        lblHari.setBounds(84, 298, 190, 20);
        getContentPane().add(DateChooser);
        DateChooser.setBounds(881, 480, 150, 30);

        lblMember.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMember.setText("930");
        getContentPane().add(lblMember);
        lblMember.setBounds(80, 204, 120, 30);

        lblProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProduct.setText("200");
        getContentPane().add(lblProduct);
        lblProduct.setBounds(330, 204, 120, 30);

        lblIncome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIncome.setText("Rp. 1.102.930");
        getContentPane().add(lblIncome);
        lblIncome.setBounds(577, 204, 140, 30);

        lblExpenditure.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblExpenditure.setText("Rp. 1.104.046");
        getContentPane().add(lblExpenditure);
        lblExpenditure.setBounds(823, 204, 140, 30);

        lblPosisiUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPosisiUser.setText("Admin");
        lblPosisiUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPosisiUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPosisiUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPosisiUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPosisiUserMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblPosisiUserMousePressed(evt);
            }
        });
        getContentPane().add(lblPosisiUser);
        lblPosisiUser.setBounds(930, 50, 110, 20);

        IconProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Profile.png"))); // NOI18N
        getContentPane().add(IconProfil);
        IconProfil.setBounds(850, 20, 62, 60);

        lblNamaUser.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblNamaUser.setText("Muhammad Ali");
        lblNamaUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNamaUser.setPreferredSize(new java.awt.Dimension(130, 22));
        lblNamaUser.setRequestFocusEnabled(false);
        lblNamaUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNamaUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNamaUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNamaUserMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNamaUserMousePressed(evt);
            }
        });
        getContentPane().add(lblNamaUser);
        lblNamaUser.setBounds(930, 20, 130, 22);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dasboard.png"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1095, 1024);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNamaUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMouseClicked
        lblNamaUser.setForeground(new Color(28, 119, 255));
        Profile profile = new Profile(this, true);
        LoginControler controler = new LoginControler(username, null, null);
        ArrayList<String> data = controler.DataProfile();
        profile.SetField(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), username, role);
        profile.setVisible(true);
    }//GEN-LAST:event_lblNamaUserMouseClicked

    private void lblNamaUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMouseEntered
        lblNamaUser.setForeground(new Color(95, 196, 244));
    }//GEN-LAST:event_lblNamaUserMouseEntered

    private void lblNamaUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMouseExited
        lblNamaUser.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblNamaUserMouseExited

    private void lblPosisiUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMouseClicked
        lblPosisiUser.setForeground(new Color(28, 119, 255));
        Profile profile = new Profile(this, true);
        LoginControler controler = new LoginControler(username, null, null);
        ArrayList<String> data = controler.DataProfile();
        profile.SetField(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), username, role);
        profile.setVisible(true);
    }//GEN-LAST:event_lblPosisiUserMouseClicked

    private void lblPosisiUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMouseEntered
        lblPosisiUser.setForeground(new Color(95, 196, 244));
    }//GEN-LAST:event_lblPosisiUserMouseEntered

    private void lblNamaUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMousePressed
        lblNamaUser.setForeground(new Color(28, 119, 255));
    }//GEN-LAST:event_lblNamaUserMousePressed

    private void lblPosisiUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMouseExited
        lblPosisiUser.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblPosisiUserMouseExited

    private void lblPosisiUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMousePressed
        lblPosisiUser.setForeground(new Color(28, 119, 255));
    }//GEN-LAST:event_lblPosisiUserMousePressed

    private void btnJoinNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinNowActionPerformed
        btnJoinNow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Join-Now-Click.png")));
        Member member = new Member();
        member.SetProfile(username, role);
        MainFrame main = (MainFrame) SwingUtilities.getWindowAncestor(this);
        main.gantiKonten(member);
        member.OpenAddMember();
    }//GEN-LAST:event_btnJoinNowActionPerformed

    private void btnJoinNowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJoinNowMouseEntered
        btnJoinNow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Join-Now-Hover.png")));
    }//GEN-LAST:event_btnJoinNowMouseEntered

    private void btnJoinNowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJoinNowMouseExited
        btnJoinNow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Join-Now-Default.png")));
    }//GEN-LAST:event_btnJoinNowMouseExited

    private void btnJoinNowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJoinNowMousePressed
        btnJoinNow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Join-Now-Click.png")));
    }//GEN-LAST:event_btnJoinNowMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JLabel IconProfil;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTable Table;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnJoinNow;
    private javax.swing.JLabel lblExpenditure;
    private javax.swing.JLabel lblHari;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblMember;
    private javax.swing.JLabel lblNamaUser;
    private javax.swing.JLabel lblPosisiUser;
    private javax.swing.JLabel lblProduct;
    // End of variables declaration//GEN-END:variables
}
