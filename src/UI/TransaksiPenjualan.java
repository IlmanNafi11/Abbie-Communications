package UI;

import Logic.LoginControler;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class TransaksiPenjualan extends javax.swing.JInternalFrame {

    private String username;
    private String role;
    
    public TransaksiPenjualan() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }
    
    public void SetProfile(String nama, String role){
        lblNamaUser.setText(nama);
        lblPosisiUser.setText(role);
        this.username = nama;
        this.role = role;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPrint = new javax.swing.JButton();
        btnCount = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAddMember = new javax.swing.JButton();
        txtIdProduct = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtNoHpMember = new javax.swing.JTextField();
        txtMemberName = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        JScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        txtPay = new javax.swing.JTextField();
        txtKodeDiskon = new javax.swing.JTextField();
        txtRefund = new javax.swing.JTextField();
        lblPosisiUser = new javax.swing.JLabel();
        IconProfil = new javax.swing.JLabel();
        lblNamaUser = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Print-Primary-Default.png"))); // NOI18N
        btnPrint.setBorder(null);
        btnPrint.setContentAreaFilled(false);
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrintMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrintMousePressed(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 882, 92, -1));

        btnCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Count-Primary-Default.png"))); // NOI18N
        btnCount.setBorder(null);
        btnCount.setContentAreaFilled(false);
        btnCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCountMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCountMousePressed(evt);
            }
        });
        btnCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });
        getContentPane().add(btnCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 882, 92, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Delete-Primary-Default.png"))); // NOI18N
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
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 882, 92, -1));

        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Add-Member-Primary-Default.png"))); // NOI18N
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
        getContentPane().add(btnAddMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 882, -1, -1));

        txtIdProduct.setForeground(new java.awt.Color(153, 153, 153));
        txtIdProduct.setText("Product ID");
        txtIdProduct.setBorder(null);
        txtIdProduct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdProductFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdProductFocusLost(evt);
            }
        });
        getContentPane().add(txtIdProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 357, 450, 50));

        txtProductName.setForeground(new java.awt.Color(153, 153, 153));
        txtProductName.setText("Product Name");
        txtProductName.setBorder(null);
        txtProductName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductNameFocusLost(evt);
            }
        });
        getContentPane().add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 433, 450, 50));

        txtQuantity.setForeground(new java.awt.Color(153, 153, 153));
        txtQuantity.setText("Quantity");
        txtQuantity.setBorder(null);
        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantityFocusLost(evt);
            }
        });
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 281, 430, 50));

        txtNoHpMember.setForeground(new java.awt.Color(153, 153, 153));
        txtNoHpMember.setText("Member Telephone Number");
        txtNoHpMember.setBorder(null);
        txtNoHpMember.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNoHpMemberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNoHpMemberFocusLost(evt);
            }
        });
        getContentPane().add(txtNoHpMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 357, 430, 50));

        txtMemberName.setForeground(new java.awt.Color(153, 153, 153));
        txtMemberName.setText("Member Name");
        txtMemberName.setBorder(null);
        txtMemberName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMemberNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMemberNameFocusLost(evt);
            }
        });
        getContentPane().add(txtMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 433, 430, 50));

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aksesoris", "Pulsa", "Suku Cadang", "Elektronik" }));
        getContentPane().add(cmbKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 472, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        }

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 940, 180));

        txtTotal.setForeground(new java.awt.Color(153, 153, 153));
        txtTotal.setText("Total");
        txtTotal.setBorder(null);
        txtTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalFocusLost(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 713, 198, 50));

        txtPay.setForeground(new java.awt.Color(153, 153, 153));
        txtPay.setText("Pay");
        txtPay.setBorder(null);
        txtPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPayFocusLost(evt);
            }
        });
        getContentPane().add(txtPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 799, 202, 50));

        txtKodeDiskon.setForeground(new java.awt.Color(153, 153, 153));
        txtKodeDiskon.setText("Discount Code");
        txtKodeDiskon.setBorder(null);
        txtKodeDiskon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtKodeDiskonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtKodeDiskonFocusLost(evt);
            }
        });
        getContentPane().add(txtKodeDiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 799, 165, 50));

        txtRefund.setForeground(new java.awt.Color(153, 153, 153));
        txtRefund.setText("Refund");
        txtRefund.setBorder(null);
        txtRefund.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRefundFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRefundFocusLost(evt);
            }
        });
        getContentPane().add(txtRefund, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 799, 198, 50));

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

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sales Transactions.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed
        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Add-Member-Primary-Click.png")));
        AddMember addMember = new AddMember(this, true);
        addMember.setVisible(true);
    }//GEN-LAST:event_btnAddMemberActionPerformed

    private void btnAddMemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMemberMouseEntered
        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Add-Member-Primary-Hover.png")));
    }//GEN-LAST:event_btnAddMemberMouseEntered

    private void btnAddMemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMemberMouseExited
        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Add-Member-Primary-Default.png")));
    }//GEN-LAST:event_btnAddMemberMouseExited

    private void btnAddMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMemberMousePressed
        btnAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Add-Member-Primary-Click.png")));
    }//GEN-LAST:event_btnAddMemberMousePressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Delete-Primary-Click.png")));
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Delete-Primary-Hover.png")));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Delete-Primary-Default.png")));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMousePressed
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Delete-Primary-Click.png")));
    }//GEN-LAST:event_btnDeleteMousePressed

    private void btnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountActionPerformed
        btnCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Count-Primary-click.png")));
    }//GEN-LAST:event_btnCountActionPerformed

    private void btnCountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCountMouseEntered
        btnCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Count-Primary-Hover.png")));
    }//GEN-LAST:event_btnCountMouseEntered

    private void btnCountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCountMouseExited
        btnCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Count-Primary-Default.png")));
    }//GEN-LAST:event_btnCountMouseExited

    private void btnCountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCountMousePressed
        btnCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Count-Primary-click.png")));
    }//GEN-LAST:event_btnCountMousePressed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Print-Primary-click.png")));
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseEntered
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Print-Primary-Hover.png")));
    }//GEN-LAST:event_btnPrintMouseEntered

    private void btnPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseExited
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Print-Primary-Default.png")));
    }//GEN-LAST:event_btnPrintMouseExited

    private void btnPrintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMousePressed
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Print-Primary-click.png")));
    }//GEN-LAST:event_btnPrintMousePressed

    private void txtIdProductFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProductFocusGained
        if (txtIdProduct.getText().equals("Product ID")) {
            txtIdProduct.setText("");
            txtIdProduct.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtIdProductFocusGained

    private void txtIdProductFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdProductFocusLost
        if (txtIdProduct.getText().trim().equals("")|| txtIdProduct.getText().length() == 0) {
            txtIdProduct.setText("Product ID");
            txtIdProduct.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtIdProductFocusLost

    private void txtProductNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductNameFocusGained
        if (txtProductName.getText().equals("Product Name")) {
            txtProductName.setText("");
            txtProductName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtProductNameFocusGained

    private void txtProductNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductNameFocusLost
        if (txtProductName.getText().trim().equals("")|| txtProductName.getText().length() == 0) {
            txtProductName.setText("Product Name");
            txtProductName.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtProductNameFocusLost

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusGained
        if (txtQuantity.getText().equals("Quantity")) {
            txtQuantity.setText("");
            txtQuantity.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtQuantityFocusGained

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        if (txtQuantity.getText().trim().equals("")|| txtQuantity.getText().length() == 0) {
            txtQuantity.setText("Quantity");
            txtQuantity.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtQuantityFocusLost

    private void txtNoHpMemberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpMemberFocusGained
        if (txtNoHpMember.getText().equals("Member Telephone Number")) {
            txtNoHpMember.setText("");
            txtNoHpMember.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNoHpMemberFocusGained

    private void txtNoHpMemberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpMemberFocusLost
        if (txtNoHpMember.getText().trim().equals("")|| txtNoHpMember.getText().length() == 0) {
            txtNoHpMember.setText("Member Telephone Number");
            txtNoHpMember.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNoHpMemberFocusLost

    private void txtMemberNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMemberNameFocusGained
        if (txtMemberName.getText().equals("Member Name")) {
            txtMemberName.setText("");
            txtMemberName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtMemberNameFocusGained

    private void txtMemberNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMemberNameFocusLost
        if (txtMemberName.getText().trim().equals("")|| txtMemberName.getText().length() == 0) {
            txtMemberName.setText("Member Name");
            txtMemberName.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtMemberNameFocusLost

    private void txtTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalFocusGained
        if (txtTotal.getText().equals("Total")) {
            txtTotal.setText("");
            txtTotal.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtTotalFocusGained

    private void txtTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalFocusLost
        if (txtTotal.getText().trim().equals("")|| txtTotal.getText().length() == 0) {
            txtTotal.setText("Total");
            txtTotal.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtTotalFocusLost

    private void txtPayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPayFocusGained
        if (txtPay.getText().equals("Pay")) {
            txtPay.setText("");
            txtPay.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPayFocusGained

    private void txtPayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPayFocusLost
        if (txtPay.getText().trim().equals("")|| txtPay.getText().length() == 0) {
            txtPay.setText("Pay");
            txtPay.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtPayFocusLost

    private void txtKodeDiskonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKodeDiskonFocusGained
        if (txtKodeDiskon.getText().equals("Discount Code")) {
            txtKodeDiskon.setText("");
            txtKodeDiskon.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtKodeDiskonFocusGained

    private void txtKodeDiskonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKodeDiskonFocusLost
       if (txtKodeDiskon.getText().trim().equals("")|| txtKodeDiskon.getText().length() == 0) {
            txtKodeDiskon.setText("Discount Code");
            txtKodeDiskon.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtKodeDiskonFocusLost

    private void txtRefundFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRefundFocusGained
        if (txtRefund.getText().equals("Refund")) {
            txtRefund.setText("");
            txtRefund.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtRefundFocusGained

    private void txtRefundFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRefundFocusLost
        if (txtRefund.getText().trim().equals("")|| txtRefund.getText().length() == 0) {
            txtRefund.setText("Refund");
            txtRefund.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtRefundFocusLost

    private void lblPosisiUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMouseClicked
        lblPosisiUser.setForeground(new Color(28,119,255));
        Profile profile = new Profile(this, true);
        LoginControler controler = new LoginControler(username, null);
        ArrayList<String> data = controler.DataProfile();
        profile.SetField(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), username, role);
        profile.setVisible(true);
    }//GEN-LAST:event_lblPosisiUserMouseClicked

    private void lblPosisiUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMouseEntered
        lblPosisiUser.setForeground(new Color(95,196,244));
    }//GEN-LAST:event_lblPosisiUserMouseEntered

    private void lblPosisiUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMouseExited
        lblPosisiUser.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_lblPosisiUserMouseExited

    private void lblPosisiUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMousePressed
        lblPosisiUser.setForeground(new Color(28,119,255));
    }//GEN-LAST:event_lblPosisiUserMousePressed

    private void lblNamaUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMouseClicked
        lblNamaUser.setForeground(new Color(28,119,255));
        Profile profile = new Profile(this, true);
        LoginControler controler = new LoginControler(username, null);
        ArrayList<String> data = controler.DataProfile();
        profile.SetField(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), username, role);
        profile.setVisible(true);
    }//GEN-LAST:event_lblNamaUserMouseClicked

    private void lblNamaUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMouseEntered
        lblNamaUser.setForeground(new Color(95,196,244));
    }//GEN-LAST:event_lblNamaUserMouseEntered

    private void lblNamaUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMouseExited
        lblNamaUser.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_lblNamaUserMouseExited

    private void lblNamaUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMousePressed
        lblNamaUser.setForeground(new Color(28,119,255));
    }//GEN-LAST:event_lblNamaUserMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconProfil;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnCount;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel lblNamaUser;
    private javax.swing.JLabel lblPosisiUser;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtIdProduct;
    private javax.swing.JTextField txtKodeDiskon;
    private javax.swing.JTextField txtMemberName;
    private javax.swing.JTextField txtNoHpMember;
    private javax.swing.JTextField txtPay;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRefund;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
