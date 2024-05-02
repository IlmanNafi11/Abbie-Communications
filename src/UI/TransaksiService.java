package UI;

import Logic.LoginControler;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import Logic.*;

public class TransaksiService extends javax.swing.JInternalFrame {

    private ConfigTable model;
    private String username;
    private String role;

    public TransaksiService() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        SetModel();
        bg.setFocusable(true);
    }

    public void SetProfile(String nama, String role) {
        lblNamaUser.setText(nama);
        lblPosisiUser.setText(role);
        this.username = nama;
        this.role = role;
    }

    private void SetModel() {
        TransaksiServiceControler controler = new TransaksiServiceControler(null, null, null, 0, 0, 0, null, null, null);
        model = controler.modelTable();
        table.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInformasi = new javax.swing.JTextField();
        txtBiaya = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtNoHpCustomer = new javax.swing.JTextField();
        txtCustomerAddress = new javax.swing.JTextField();
        JScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        txtPay = new javax.swing.JTextField();
        txtRefund = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnCount = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        lblPosisiUser = new javax.swing.JLabel();
        IconProfil = new javax.swing.JLabel();
        lblNamaUser = new javax.swing.JLabel();
        btnAddPart = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtInformasi.setForeground(new java.awt.Color(153, 153, 153));
        txtInformasi.setText("Information");
        txtInformasi.setBorder(null);
        txtInformasi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtInformasiFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInformasiFocusLost(evt);
            }
        });
        getContentPane().add(txtInformasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 281, 460, 50));

        txtBiaya.setForeground(new java.awt.Color(153, 153, 153));
        txtBiaya.setText("Cost");
        txtBiaya.setBorder(null);
        txtBiaya.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBiayaFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBiayaFocusLost(evt);
            }
        });
        txtBiaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBiayaKeyReleased(evt);
            }
        });
        getContentPane().add(txtBiaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 357, 460, 50));

        txtCustomerName.setForeground(new java.awt.Color(153, 153, 153));
        txtCustomerName.setText("Customer Name");
        txtCustomerName.setBorder(null);
        txtCustomerName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCustomerNameFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCustomerNameFocusLost(evt);
            }
        });
        getContentPane().add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 281, 430, 50));

        txtNoHpCustomer.setForeground(new java.awt.Color(153, 153, 153));
        txtNoHpCustomer.setText("Customer Telephone Number");
        txtNoHpCustomer.setBorder(null);
        txtNoHpCustomer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNoHpCustomerFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNoHpCustomerFocusLost(evt);
            }
        });
        getContentPane().add(txtNoHpCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 357, 430, 50));

        txtCustomerAddress.setForeground(new java.awt.Color(153, 153, 153));
        txtCustomerAddress.setText("Customer Address");
        txtCustomerAddress.setBorder(null);
        txtCustomerAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCustomerAddressFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCustomerAddressFocusLost(evt);
            }
        });
        getContentPane().add(txtCustomerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 433, 430, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String[]{
                        "Product Name/Information", "Quantity", "Price"
                }
        ));
        JScrollPane.setViewportView(table);

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 517, 940, 250));

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
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 801, 202, 50));

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
        getContentPane().add(txtPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 801, 202, 50));

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
        getContentPane().add(txtRefund, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 801, 198, 50));

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
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 884, 93, -1));

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
        getContentPane().add(btnCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 884, 93, -1));

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
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 884, 93, -1));

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

        btnAddPart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-AddPart-Default.png"))); // NOI18N
        btnAddPart.setBorder(null);
        btnAddPart.setContentAreaFilled(false);
        btnAddPart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddPartMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddPartMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddPartMousePressed(evt);
            }
        });
        btnAddPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPartActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddPart, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 429, 162, 52));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Services Transactions.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Delete-Primary-click.png")));
        TransaksiServiceControler transaksiServiceControler = new TransaksiServiceControler(null, null, null, 0, 0, 0, null, null, null);
        transaksiServiceControler.DeleteDataTransakssi(table, txtTotal);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Delete-Primary-Hover.png")));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Delete-Primary-Default.png")));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMousePressed
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Delete-Primary-click.png")));
    }//GEN-LAST:event_btnDeleteMousePressed

    private void btnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountActionPerformed
        btnCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Button-Count-Primary-click.png")));
        int total = Integer.parseInt(txtTotal.getText());
        TransaksiServiceControler transaksiServiceControler = new TransaksiServiceControler(null, null, null, 0, 0, total, null, null, null);
        transaksiServiceControler.HitungKembalian(txtTotal, txtPay, txtRefund);
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
        String namaCustomer = txtCustomerName.getText();
        String noHpCustomer = txtNoHpCustomer.getText();
        String alamat = txtCustomerAddress.getText();
        int total = Integer.parseInt(txtTotal.getText());
        int pay = Integer.parseInt(txtPay.getText());
        int kembalian = Integer.parseInt(txtRefund.getText());
        TransaksiServiceControler transaksiServiceControler = new TransaksiServiceControler(null, null, null, 0, 0, total, namaCustomer, noHpCustomer, alamat);
        transaksiServiceControler.ValidatePayment(txtPay);
        transaksiServiceControler.InsertTransaksi(table, username, total, pay, kembalian);
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

    private void txtInformasiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInformasiFocusGained
        if (txtInformasi.getText().equals("Information")) {
            txtInformasi.setText("");
            txtInformasi.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtInformasiFocusGained

    private void txtInformasiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInformasiFocusLost
        if (txtInformasi.getText().trim().equals("") || txtInformasi.getText().length() == 0) {
            txtInformasi.setText("Information");
            txtInformasi.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtInformasiFocusLost

    private void txtBiayaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBiayaFocusGained
        if (txtBiaya.getText().equals("Cost")) {
            txtBiaya.setText("");
            txtBiaya.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtBiayaFocusGained

    private void txtBiayaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBiayaFocusLost
        if (txtBiaya.getText().trim().equals("") || txtBiaya.getText().length() == 0) {
            txtBiaya.setText("Cost");
            txtBiaya.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtBiayaFocusLost

    private void txtCustomerNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustomerNameFocusGained
        if (txtCustomerName.getText().equals("Customer Name")) {
            txtCustomerName.setText("");
            txtCustomerName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtCustomerNameFocusGained

    private void txtCustomerNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustomerNameFocusLost
        if (txtCustomerName.getText().trim().equals("") || txtCustomerName.getText().length() == 0) {
            txtCustomerName.setText("Customer Name");
            txtCustomerName.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtCustomerNameFocusLost

    private void txtNoHpCustomerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpCustomerFocusGained
        if (txtNoHpCustomer.getText().equals("Customer Telephone Number")) {
            txtNoHpCustomer.setText("");
            txtNoHpCustomer.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtNoHpCustomerFocusGained

    private void txtNoHpCustomerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoHpCustomerFocusLost
        if (txtNoHpCustomer.getText().trim().equals("") || txtNoHpCustomer.getText().length() == 0) {
            txtNoHpCustomer.setText("Customer Telephone Number");
            txtNoHpCustomer.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNoHpCustomerFocusLost

    private void txtCustomerAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustomerAddressFocusGained
        if (txtCustomerAddress.getText().equals("Customer Address")) {
            txtCustomerAddress.setText("");
            txtCustomerAddress.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtCustomerAddressFocusGained

    private void txtCustomerAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustomerAddressFocusLost
        if (txtCustomerAddress.getText().trim().equals("") || txtCustomerAddress.getText().length() == 0) {
            txtCustomerAddress.setText("Customer Address");
            txtCustomerAddress.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtCustomerAddressFocusLost

    private void txtTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalFocusGained
        if (txtTotal.getText().equals("Total")) {
            txtTotal.setText("");
            txtTotal.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtTotalFocusGained

    private void txtTotalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalFocusLost
        if (txtTotal.getText().trim().equals("") || txtTotal.getText().length() == 0) {
            txtTotal.setText("Total");
            txtTotal.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtTotalFocusLost

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

    private void txtRefundFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRefundFocusGained
        if (txtRefund.getText().equals("Refund")) {
            txtRefund.setText("");
            txtRefund.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtRefundFocusGained

    private void txtRefundFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRefundFocusLost
        if (txtRefund.getText().trim().equals("") || txtRefund.getText().length() == 0) {
            txtRefund.setText("Refund");
            txtRefund.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtRefundFocusLost

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

    private void btnAddPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPartActionPerformed
        btnAddPart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-AddPart-Click.png")));
        AddPart addPart = new AddPart(this, true, model, table, txtTotal);
        addPart.setVisible(true);
    }//GEN-LAST:event_btnAddPartActionPerformed

    private void btnAddPartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPartMouseEntered
        btnAddPart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-AddPart-Hover.png")));
    }//GEN-LAST:event_btnAddPartMouseEntered

    private void btnAddPartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPartMouseExited
        btnAddPart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-AddPart-Default.png")));
    }//GEN-LAST:event_btnAddPartMouseExited

    private void btnAddPartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPartMousePressed
        btnAddPart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ButtonIcon/Btn-AddPart-Click.png")));
    }//GEN-LAST:event_btnAddPartMousePressed

    private void txtBiayaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBiayaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String Informasi = txtInformasi.getText().trim();
            TransaksiServiceControler transaksiServiceControler = new TransaksiServiceControler(Informasi, null, null, 0, 0, 0, null, null, null);
            transaksiServiceControler.ValidateBiaya(txtBiaya);
            transaksiServiceControler.AddDataServiceToTable(model);
            transaksiServiceControler.UpdateTotal(table, txtTotal);
        }
    }//GEN-LAST:event_txtBiayaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconProfil;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAddPart;
    private javax.swing.JButton btnCount;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel lblNamaUser;
    private javax.swing.JLabel lblPosisiUser;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtInformasi;
    private javax.swing.JTextField txtNoHpCustomer;
    private javax.swing.JTextField txtPay;
    private javax.swing.JTextField txtRefund;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
