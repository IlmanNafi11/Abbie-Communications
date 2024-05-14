package UI;

import Logic.*;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class TransaksiPenjualan extends javax.swing.JInternalFrame {

    private String username;
    private String role;

    private int jumlahDiskon;
    private ConfigTable model;

    public TransaksiPenjualan() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        bg.setFocusable(true);
        ViewTableTransaksi();
    }

    public void SetProfile(String nama, String role) {
        lblNamaUser.setText(nama);
        lblPosisiUser.setText(role);
        this.username = nama;
        this.role = role;
    }

    public void SetJumlahDiskon(int jumlahDiskon) {
        this.jumlahDiskon = jumlahDiskon;
    }

    public void ViewTableTransaksi() {
        TransaksiPenjualanControler controler = new TransaksiPenjualanControler(null, null, 0, null);
        model = controler.modelTabel();
        table.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPrint = new javax.swing.JButton();
        btnCount = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAddMember = new javax.swing.JButton();
        txtProductName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtNoHpMember = new javax.swing.JTextField();
        txtMemberName = new javax.swing.JTextField();
        JScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        txtPay = new javax.swing.JTextField();
        txtRefund = new javax.swing.JTextField();
        txtProductId = new javax.swing.JTextField();
        lblPosisiUser = new javax.swing.JLabel();
        IconProfil = new javax.swing.JLabel();
        lblNamaUser = new javax.swing.JLabel();
        cmbKodeDiskon = new javax.swing.JComboBox<>();
        bg = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Print-Primary-Default.png"))); // NOI18N
        btnPrint.setBorder(null);
        btnPrint.setContentAreaFilled(false);
        btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnCount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnAddMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        txtProductName.setEditable(false);
        txtProductName.setBackground(new java.awt.Color(255, 255, 255));
        txtProductName.setForeground(new java.awt.Color(153, 153, 153));
        txtProductName.setText("Product Name");
        txtProductName.setBorder(null);
        getContentPane().add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 357, 450, 50));

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
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
        });
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 433, 450, 50));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Icon-Search.png"))); // NOI18N
        btnSearch.setBorder(null);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 281, 60, 50));

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
        getContentPane().add(txtNoHpMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 281, 430, 50));

        txtMemberName.setEditable(false);
        txtMemberName.setBackground(new java.awt.Color(255, 255, 255));
        txtMemberName.setForeground(new java.awt.Color(153, 153, 153));
        txtMemberName.setText("Member Name");
        txtMemberName.setBorder(null);
        getContentPane().add(txtMemberName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 357, 430, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Quantity", "Price", "sub-Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.setShowVerticalLines(true);
        table.getTableHeader().setReorderingAllowed(false);
        JScrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 940, 180));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setForeground(new java.awt.Color(153, 153, 153));
        txtTotal.setText("Total");
        txtTotal.setBorder(null);
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
        getContentPane().add(txtPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 799, 202, 50));

        txtRefund.setEditable(false);
        txtRefund.setBackground(new java.awt.Color(255, 255, 255));
        txtRefund.setForeground(new java.awt.Color(153, 153, 153));
        txtRefund.setText("Refund");
        txtRefund.setBorder(null);
        getContentPane().add(txtRefund, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 799, 198, 50));

        txtProductId.setForeground(new java.awt.Color(153, 153, 153));
        txtProductId.setText("Product ID");
        txtProductId.setBorder(null);
        txtProductId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProductIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductIdFocusLost(evt);
            }
        });
        txtProductId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductIdKeyReleased(evt);
            }
        });
        getContentPane().add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 281, 450, 50));

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

        cmbKodeDiskon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Discount Code" }));
        cmbKodeDiskon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbKodeDiskonItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbKodeDiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 800, 180, 50));

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
        TransaksiPenjualanControler controler = new TransaksiPenjualanControler(null,  null, 0, null);
        controler.DeleteDataTransakssi(table, txtTotal);
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
        TransaksiPenjualanControler controler = new TransaksiPenjualanControler(null,  null, 0, null);
        controler.HitungKembalian(txtTotal, txtPay, txtRefund);
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
        String namaMember = txtMemberName.getText();
        String noHpMember = txtNoHpMember.getText();
        String kodeDiskon = (String) cmbKodeDiskon.getSelectedItem();
        int total = Integer.parseInt(txtTotal.getText());
        TransaksiPenjualanControler controler = new TransaksiPenjualanControler(username, noHpMember, total, kodeDiskon);
        boolean succes = controler.InsertTransaksiPenjualan(table, jumlahDiskon, namaMember, txtPay, txtRefund);
        if (succes) {
            controler.ClearDataTransaksi(table, txtMemberName, txtNoHpMember, txtTotal, txtPay, txtRefund, cmbKodeDiskon);
        }

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

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusGained
        if (txtQuantity.getText().equals("Quantity")) {
            txtQuantity.setText("");
            txtQuantity.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtQuantityFocusGained

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        if (txtQuantity.getText().trim().equals("") || txtQuantity.getText().length() == 0) {
            txtQuantity.setText("Quantity");
            txtQuantity.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtQuantityFocusLost

    private void txtNoHpMemberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpMemberFocusGained
        if (txtNoHpMember.getText().equals("Member Telephone Number")) {
            txtNoHpMember.setText("");
            txtNoHpMember.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNoHpMemberFocusGained

    private void txtNoHpMemberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpMemberFocusLost
        if (txtNoHpMember.getText().trim().equals("") || txtNoHpMember.getText().length() == 0) {
            txtNoHpMember.setText("Member Telephone Number");
            txtNoHpMember.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNoHpMemberFocusLost

    private void txtPayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPayFocusGained
        if (txtPay.getText().equals("Pay")) {
            txtPay.setText("");
            txtPay.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPayFocusGained

    private void txtPayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPayFocusLost
        if (txtPay.getText().trim().equals("") || txtPay.getText().length() == 0) {
            txtPay.setText("Pay");
            txtPay.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtPayFocusLost

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

    private void lblPosisiUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMouseExited
        lblPosisiUser.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblPosisiUserMouseExited

    private void lblPosisiUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPosisiUserMousePressed
        lblPosisiUser.setForeground(new Color(28, 119, 255));
    }//GEN-LAST:event_lblPosisiUserMousePressed

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

    private void lblNamaUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNamaUserMousePressed
        lblNamaUser.setForeground(new Color(28, 119, 255));
    }//GEN-LAST:event_lblNamaUserMousePressed

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
        TransaksiPenjualanControler controler = new TransaksiPenjualanControler( null, null, 0, null);
        controler.SetTxtNamaMember(txtNoHpMember, txtMemberName, cmbKodeDiskon);
        controler.GetDiskon(txtMemberName, txtTotal, cmbKodeDiskon);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtProductIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductIdFocusGained
        if (txtProductId.getText().equals("Product ID")) {
            txtProductId.setText("");
            txtProductId.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtProductIdFocusGained

    private void txtProductIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductIdFocusLost
        if (txtProductId.getText().trim().equals("") || txtProductId.getText().length() == 0) {
            txtProductId.setText("Product ID");
            txtProductId.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtProductIdFocusLost

    private void txtProductIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductIdKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            TransaksiPenjualanControler controler = new TransaksiPenjualanControler(null, null, 0, null);
            controler.SetFieldTransaksi(txtProductId, txtProductName, txtQuantity);
        }
    }//GEN-LAST:event_txtProductIdKeyReleased

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            TransaksiPenjualanControler controler = new TransaksiPenjualanControler(null, null, 0, null);
            controler.AddToTable(txtProductId, txtProductName, txtQuantity, bg, txtMemberName, txtTotal, cmbKodeDiskon, table);
//            model.addRow(data);
//            controler.UpdateTotal(table, txtTotal);
//            controler.GetDiskon(txtMemberName, txtTotal, cmbKodeDiskon);
        }
    }//GEN-LAST:event_txtQuantityKeyReleased

    private void cmbKodeDiskonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbKodeDiskonItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String kodeDiskon = (String) cmbKodeDiskon.getSelectedItem();
            if (!kodeDiskon.equalsIgnoreCase("Discount Code")) {
                TransaksiPenjualanControler controler = new TransaksiPenjualanControler(null,  null, 0, kodeDiskon);
                int diskon = controler.GetDiscountAmount(cmbKodeDiskon);
                SetJumlahDiskon(diskon);
                controler.HitungTotal(txtTotal, diskon);
            }
        }
    }//GEN-LAST:event_cmbKodeDiskonItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconProfil;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnCount;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbKodeDiskon;
    private javax.swing.JLabel lblNamaUser;
    private javax.swing.JLabel lblPosisiUser;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtMemberName;
    private javax.swing.JTextField txtNoHpMember;
    private javax.swing.JTextField txtPay;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRefund;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
