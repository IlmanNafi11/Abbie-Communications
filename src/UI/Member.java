package UI;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Member extends javax.swing.JInternalFrame {

    public Member() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAddPromo = new javax.swing.JButton();
        btnEditPromo = new javax.swing.JButton();
        btnHapusPromo = new javax.swing.JButton();
        btnAddMember = new javax.swing.JButton();
        btnEditMember = new javax.swing.JButton();
        btnHapusMember = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        bg = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setBackground(new java.awt.Color(249, 250, 251));
        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Search Member here...");
        txtSearch.setBorder(null);
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 32, 260, 50));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Icon-Search.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSearchMousePressed(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 32, 60, 50));

        btnAddPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Plus-Default.png"))); // NOI18N
        btnAddPromo.setBorder(null);
        btnAddPromo.setContentAreaFilled(false);
        btnAddPromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddPromoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddPromoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddPromoMousePressed(evt);
            }
        });
        btnAddPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPromoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 171, 81, 40));

        btnEditPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Default.png"))); // NOI18N
        btnEditPromo.setBorder(null);
        btnEditPromo.setContentAreaFilled(false);
        btnEditPromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditPromoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditPromoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditPromoMousePressed(evt);
            }
        });
        btnEditPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPromoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 171, 81, 40));

        btnHapusPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Default.png"))); // NOI18N
        btnHapusPromo.setBorder(null);
        btnHapusPromo.setContentAreaFilled(false);
        btnHapusPromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusPromoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusPromoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHapusPromoMousePressed(evt);
            }
        });
        btnHapusPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusPromoActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapusPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(948, 171, 81, 40));

        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Plus-Default.png"))); // NOI18N
        btnAddMember.setBorder(null);
        btnAddMember.setContentAreaFilled(false);
        btnAddMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMemberMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddMemberMousePressed(evt);
            }
        });
        btnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemberActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 392, 81, 40));

        btnEditMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Default.png"))); // NOI18N
        btnEditMember.setBorder(null);
        btnEditMember.setContentAreaFilled(false);
        btnEditMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMemberMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMemberMousePressed(evt);
            }
        });
        btnEditMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMemberActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 392, 81, 40));

        btnHapusMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Default.png"))); // NOI18N
        btnHapusMember.setBorder(null);
        btnHapusMember.setContentAreaFilled(false);
        btnHapusMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHapusMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHapusMemberMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHapusMemberMousePressed(evt);
            }
        });
        btnHapusMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusMemberActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapusMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(948, 392, 81, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 230, 962, 142));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 450, 962, 510));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Members.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Icon-Search-Click.png")));
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Icon-Search-Hover.png")));
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Icon-Search.png")));
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMousePressed
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Icon-Search-Click.png")));
    }//GEN-LAST:event_btnSearchMousePressed

    private void btnAddPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPromoActionPerformed
        btnAddPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Plus-Click.png")));
    }//GEN-LAST:event_btnAddPromoActionPerformed

    private void btnAddPromoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPromoMouseEntered
        btnAddPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Plus-Hover.png")));
    }//GEN-LAST:event_btnAddPromoMouseEntered

    private void btnAddPromoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPromoMouseExited
        btnAddPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Plus-Default.png")));
    }//GEN-LAST:event_btnAddPromoMouseExited

    private void btnAddPromoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPromoMousePressed
        btnAddPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Plus-Click.png")));
    }//GEN-LAST:event_btnAddPromoMousePressed

    private void btnEditPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPromoActionPerformed
        btnEditPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Click.png")));
    }//GEN-LAST:event_btnEditPromoActionPerformed

    private void btnEditPromoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditPromoMouseEntered
        btnEditPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Hover.png")));
    }//GEN-LAST:event_btnEditPromoMouseEntered

    private void btnEditPromoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditPromoMouseExited
        btnEditPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Default.png")));
    }//GEN-LAST:event_btnEditPromoMouseExited

    private void btnEditPromoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditPromoMousePressed
        btnEditPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Click.png")));
    }//GEN-LAST:event_btnEditPromoMousePressed

    private void btnHapusPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusPromoActionPerformed
        btnHapusPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Click.png")));
    }//GEN-LAST:event_btnHapusPromoActionPerformed

    private void btnHapusPromoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusPromoMouseEntered
        btnHapusPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Hover.png")));
    }//GEN-LAST:event_btnHapusPromoMouseEntered

    private void btnHapusPromoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusPromoMouseExited
        btnHapusPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Default.png")));
    }//GEN-LAST:event_btnHapusPromoMouseExited

    private void btnHapusPromoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusPromoMousePressed
        btnHapusPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Click.png")));
    }//GEN-LAST:event_btnHapusPromoMousePressed

    private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed
        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Plus-Click.png")));
    }//GEN-LAST:event_btnAddMemberActionPerformed

    private void btnAddMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMemberMouseEntered
        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Plus-Hover.png")));
    }//GEN-LAST:event_btnAddMemberMouseEntered

    private void btnAddMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMemberMouseExited
        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Plus-Default.png")));
    }//GEN-LAST:event_btnAddMemberMouseExited

    private void btnAddMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMemberMousePressed
        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Add-Plus-Click.png")));
    }//GEN-LAST:event_btnAddMemberMousePressed

    private void btnEditMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMemberActionPerformed
        btnEditMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Click.png")));
    }//GEN-LAST:event_btnEditMemberActionPerformed

    private void btnEditMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMemberMouseEntered
        btnEditMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Hover.png")));
    }//GEN-LAST:event_btnEditMemberMouseEntered

    private void btnEditMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMemberMouseExited
        btnEditMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Default.png")));
    }//GEN-LAST:event_btnEditMemberMouseExited

    private void btnEditMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMemberMousePressed
        btnEditMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Click.png")));
    }//GEN-LAST:event_btnEditMemberMousePressed

    private void btnHapusMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusMemberActionPerformed
        btnHapusMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Click.png")));
    }//GEN-LAST:event_btnHapusMemberActionPerformed

    private void btnHapusMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMemberMouseEntered
        btnHapusMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Hover.png")));
    }//GEN-LAST:event_btnHapusMemberMouseEntered

    private void btnHapusMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMemberMouseExited
        btnHapusMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Default.png")));
    }//GEN-LAST:event_btnHapusMemberMouseExited

    private void btnHapusMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMemberMousePressed
        btnHapusMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Click.png")));
    }//GEN-LAST:event_btnHapusMemberMousePressed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        if (txtSearch.getText().equals("Search Member here...")) {
            txtSearch.setText("");
            txtSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if (txtSearch.getText().trim().equals("")|| txtSearch.getText().length() == 0) {
            txtSearch.setText("Search Member here...");
            txtSearch.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtSearchFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnAddPromo;
    private javax.swing.JButton btnEditMember;
    private javax.swing.JButton btnEditPromo;
    private javax.swing.JButton btnHapusMember;
    private javax.swing.JButton btnHapusPromo;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
