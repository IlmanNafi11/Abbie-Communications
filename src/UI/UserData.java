package UI;

import Logic.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class UserData extends javax.swing.JInternalFrame implements UpdateTable {

    public UserData() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        ViewTable();
    }

    @Override
    public void perbarui() {
        ViewTable();
    }

    public void ViewTable() {
        UserDataControler controler = new UserDataControler(null, null, null, null, null, null, null);
        ConfigTable Tabel = controler.GetAllData();
        table.setModel(Tabel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        JScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblPosisiUser = new javax.swing.JLabel();
        IconProfil = new javax.swing.JLabel();
        lblNamaUser = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.setBackground(new java.awt.Color(249, 250, 251));
        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Search User here...");
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
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 37, 50, 40));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Default.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.setContentAreaFilled(false);
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMousePressed(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(853, 171, 88, 40));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Default.png"))); // NOI18N
        btnDelete.setBorder(null);
        btnDelete.setContentAreaFilled(false);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteMousePressed(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 171, 81, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "NIK", "Name", "Phone Number", "Address", "Position", "Account ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JScrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 231, 977, 728));

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
        getContentPane().add(lblPosisiUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, -1, -1));

        IconProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon Profile.png"))); // NOI18N
        getContentPane().add(IconProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

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
        getContentPane().add(lblNamaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User Data.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        if (txtSearch.getText().equals("Search User here...")) {
            txtSearch.setText("");
            txtSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if (txtSearch.getText().trim().equals("") || txtSearch.getText().length() == 0) {
            txtSearch.setText("Search User here...");
            txtSearch.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSearchFocusLost

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Icon-Search-Hover.png")));
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Icon-Search.png")));
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMousePressed
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Icon-Search-Click.png")));
    }//GEN-LAST:event_btnSearchMousePressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Icon-Search-Click.png")));
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Hover.png")));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Default.png")));
    }//GEN-LAST:event_btnEditMouseExited

    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Click.png")));
    }//GEN-LAST:event_btnEditMousePressed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Edit-Click.png")));
        ChangeUserData changeUserData = new ChangeUserData(this, true);
        UserDataControler controler = new UserDataControler(null, null, null, null, null, null, null);
        boolean validasiSelectedRow = controler.ValidateRow(table);
        if (validasiSelectedRow) {
            changeUserData.setUserData(new UpdateTable() {
                @Override
                public void perbarui() {
                    ViewTable();
                }
            });
            ArrayList<String> data = controler.IsiStringField(table);
            changeUserData.setField(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), data.get(5), data.get(1), data.get(3));
            changeUserData.setVisible(true);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Hover.png")));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Default.png")));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMousePressed
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Click.png")));
    }//GEN-LAST:event_btnDeleteMousePressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-Delete-Click.png")));
        UserDataControler controler = new UserDataControler(null, null, null, null, null, null, null);
        boolean succes = controler.DeleteUserData(table);
        if (succes) {
            ViewTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lblPosisiUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMouseClicked
        lblPosisiUser.setForeground(new Color(28, 119, 255));
        Profile profile = new Profile(this, true);
        profile.setVisible(true);
    }//GEN-LAST:event_lblPosisiUserMouseClicked

    private void lblPosisiUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMouseEntered
        lblPosisiUser.setForeground(new Color(95, 196, 244));
    }//GEN-LAST:event_lblPosisiUserMouseEntered

    private void lblPosisiUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMouseExited
        lblPosisiUser.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblPosisiUserMouseExited

    private void lblPosisiUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMousePressed
        lblPosisiUser.setForeground(new Color(28, 119, 255));
    }//GEN-LAST:event_lblPosisiUserMousePressed

    private void lblNamaUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMouseClicked
        lblNamaUser.setForeground(new Color(28, 119, 255));
        Profile profile = new Profile(this, true);
        profile.setVisible(true);
    }//GEN-LAST:event_lblNamaUserMouseClicked

    private void lblNamaUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMouseEntered
        lblNamaUser.setForeground(new Color(95, 196, 244));
    }//GEN-LAST:event_lblNamaUserMouseEntered

    private void lblNamaUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMouseExited
        lblNamaUser.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblNamaUserMouseExited

    private void lblNamaUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMousePressed
        lblNamaUser.setForeground(new Color(28, 119, 255));
    }//GEN-LAST:event_lblNamaUserMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconProfil;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblNamaUser;
    private javax.swing.JLabel lblPosisiUser;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
