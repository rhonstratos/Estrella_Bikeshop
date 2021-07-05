/*
 * The MIT License
 *
 * Copyright 2021 kizun.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.rhonstratos.java;
    import javax.swing.*;
    import javax.swing.Timer;
    import javax.swing.table.*;
    import java.awt.event.*;
    import java.sql.*;
    import java.util.*;
    import java.time.format.*;  
    import java.time.*;  
public class Frame2 extends javax.swing.JFrame implements warn{
    public void warning(String y){
        Object[] yy = {"OK"};
        javax.swing.JOptionPane.showOptionDialog(
            this, 
            y, 
            this.getTitle(), 
            javax.swing.JOptionPane.OK_OPTION, 
            javax.swing.JOptionPane.WARNING_MESSAGE,null,yy,yy[0]);
    }
    public Frame2() {
        try {
            initComponents();
            RefreshTable();
            DateTimeFormatter date = DateTimeFormatter.ofPattern("MMMM dd, yyyy (M/dd/yyyy)"); 
            DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");  
            final Timer t = new Timer(1000, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    Frame2Clock.setText("Date: "+date.format(LocalDateTime.now())+
                                        " Time: "+time.format(LocalDateTime.now()));
                }
            });
            t.start();
        } catch (Exception e) {
            e.printStackTrace();
            warning("An error has occured!");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainFrame = new javax.swing.JTabbedPane();
        CashierPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        CustomerPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CustFNamebx = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        CustMNamebx = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CustLNamebx = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CustConNumbx = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustAddressbx = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        custDelete = new javax.swing.JButton();
        custUpdate = new javax.swing.JButton();
        CustSearch = new javax.swing.JButton();
        custRefresh = new javax.swing.JButton();
        InventoryPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        InvItmName = new javax.swing.JComboBox<>();
        InvQuan = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        InvDesc = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        InvUpdate = new javax.swing.JButton();
        InvSeasrch = new javax.swing.JButton();
        InvRefresh = new javax.swing.JButton();
        InvItmID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        InvTable = new javax.swing.JTable();
        ItemPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ItmName = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        ItmDesc = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        ItmUpdate = new javax.swing.JButton();
        ItmSearch = new javax.swing.JButton();
        ItmRefresh = new javax.swing.JButton();
        ItmSRP = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ItmDelete = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        ItmSupplier = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        ItmCategory = new javax.swing.JTextField();
        ItmUPrice = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        ItmTable = new javax.swing.JTable();
        SupplierPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        InvItmName2 = new javax.swing.JComboBox<>();
        InvQuan2 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        InvDesc2 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        SupplierUpdate = new javax.swing.JButton();
        SupplierSearch = new javax.swing.JButton();
        SupplierRefresh = new javax.swing.JButton();
        InvItmID2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        SupplierDelete = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        SupplierTable = new javax.swing.JTable();
        Frame2Clock = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inventory Management System: Main Menu");
        setBackground(new java.awt.Color(153, 153, 153));
        setName("frame2"); // NOI18N
        setSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        MainFrame.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1235, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CashierPanelLayout = new javax.swing.GroupLayout(CashierPanel);
        CashierPanel.setLayout(CashierPanelLayout);
        CashierPanelLayout.setHorizontalGroup(
            CashierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashierPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CashierPanelLayout.setVerticalGroup(
            CashierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashierPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainFrame.addTab("Cashier", CashierPanel);

        CustTable.setAutoCreateRowSorter(true);
        CustTable.setToolTipText("");
        CustTable.setRowHeight(35);
        CustTable.setRowSelectionAllowed(false);
        CustTable.setShowGrid(true);
        CustTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MANAGE CUSTOMERS");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search First Name");

        CustFNamebx.setEditable(true);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Search Middle Name");

        CustMNamebx.setEditable(true);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search Last Name");

        CustLNamebx.setEditable(true);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contact Number");

        CustConNumbx.setEditable(false);

        CustAddressbx.setEditable(false);
        CustAddressbx.setColumns(20);
        CustAddressbx.setRows(5);
        jScrollPane1.setViewportView(CustAddressbx);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address");

        custDelete.setText("Delete");
        custDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custDeleteActionPerformed(evt);
            }
        });

        custUpdate.setText("Update");
        custUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custUpdateActionPerformed(evt);
            }
        });

        CustSearch.setText("Search");
        CustSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustSearchActionPerformed(evt);
            }
        });

        custRefresh.setText("Refresh");
        custRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CustFNamebx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustMNamebx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustLNamebx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustConNumbx, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(custDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CustSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustFNamebx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustMNamebx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustLNamebx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustConNumbx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(custRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CustomerPanelLayout = new javax.swing.GroupLayout(CustomerPanel);
        CustomerPanel.setLayout(CustomerPanelLayout);
        CustomerPanelLayout.setHorizontalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CustomerPanelLayout.setVerticalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainFrame.addTab("Customer", CustomerPanel);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MANAGE INVENTORY");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Search Item Name");

        InvItmName.setEditable(true);

        InvQuan.setEditable(false);
        InvQuan.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        InvDesc.setEditable(false);
        InvDesc.setColumns(20);
        InvDesc.setLineWrap(true);
        InvDesc.setRows(5);
        jScrollPane3.setViewportView(InvDesc);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Quantiy and");
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        InvUpdate.setText("Update");
        InvUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvUpdateActionPerformed(evt);
            }
        });

        InvSeasrch.setText("Search");
        InvSeasrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvSeasrchActionPerformed(evt);
            }
        });

        InvRefresh.setText("Refresh");
        InvRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvRefreshActionPerformed(evt);
            }
        });

        InvItmID.setEditable(false);
        InvItmID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Description");
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InvItmID, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(InvUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InvSeasrch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InvRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InvItmName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvItmName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvItmID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 69, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvQuan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InvRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InvSeasrch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        InvTable.setToolTipText("");
        InvTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(InvTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        javax.swing.GroupLayout InventoryPanelLayout = new javax.swing.GroupLayout(InventoryPanel);
        InventoryPanel.setLayout(InventoryPanelLayout);
        InventoryPanelLayout.setHorizontalGroup(
            InventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        InventoryPanelLayout.setVerticalGroup(
            InventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainFrame.addTab("Inventory", InventoryPanel);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setPreferredSize(new java.awt.Dimension(539, 634));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MANAGE ITEMS");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Search Item Name");

        ItmName.setEditable(true);

        ItmDesc.setEditable(false);
        ItmDesc.setColumns(20);
        ItmDesc.setLineWrap(true);
        ItmDesc.setRows(5);
        jScrollPane5.setViewportView(ItmDesc);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SRP & Unit Price");
        jLabel15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ItmUpdate.setText("Update");
        ItmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmUpdateActionPerformed(evt);
            }
        });

        ItmSearch.setText("Search");
        ItmSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmSearchActionPerformed(evt);
            }
        });

        ItmRefresh.setText("Refresh");
        ItmRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmRefreshActionPerformed(evt);
            }
        });

        ItmSRP.setEditable(false);
        ItmSRP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Description");
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        ItmDelete.setText("Delete");
        ItmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmDeleteActionPerformed(evt);
            }
        });

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Search Supplier");

        ItmSupplier.setEditable(true);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Category");

        ItmUPrice.setEditable(false);
        ItmUPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItmSupplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)
                            .addComponent(ItmName, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(ItmDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ItmUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ItmSearch)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ItmRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(ItmSRP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ItmUPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ItmCategory))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(54, 54, 54))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(ItmName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ItmSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ItmCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItmSRP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItmUPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ItmRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ItmSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ItmUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ItmDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        ItmTable.setToolTipText("");
        ItmTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItmTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(ItmTable);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout ItemPanelLayout = new javax.swing.GroupLayout(ItemPanel);
        ItemPanel.setLayout(ItemPanelLayout);
        ItemPanelLayout.setHorizontalGroup(
            ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ItemPanelLayout.setVerticalGroup(
            ItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainFrame.addTab("Items", ItemPanel);

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MANAGE SUPPLIERS");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Search Item Name");

        InvItmName2.setEditable(true);

        InvQuan2.setEditable(false);
        InvQuan2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        InvDesc2.setEditable(false);
        InvDesc2.setColumns(20);
        InvDesc2.setLineWrap(true);
        InvDesc2.setRows(5);
        jScrollPane6.setViewportView(InvDesc2);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Quantiy and");
        jLabel18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        SupplierUpdate.setText("Update");
        SupplierUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierUpdateActionPerformed(evt);
            }
        });

        SupplierSearch.setText("Search");
        SupplierSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierSearchActionPerformed(evt);
            }
        });

        SupplierRefresh.setText("Refresh");
        SupplierRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierRefreshActionPerformed(evt);
            }
        });

        InvItmID2.setEditable(false);
        InvItmID2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Description");
        jLabel19.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        SupplierDelete.setText("Delete");
        SupplierDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InvItmID2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvQuan2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvItmName2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SupplierDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SupplierUpdate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SupplierSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SupplierRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvItmName2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvItmID2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 69, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvQuan2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SupplierRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SupplierSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SupplierUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SupplierDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        SupplierTable.setToolTipText("");
        SupplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierTableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(SupplierTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout SupplierPanelLayout = new javax.swing.GroupLayout(SupplierPanel);
        SupplierPanel.setLayout(SupplierPanelLayout);
        SupplierPanelLayout.setHorizontalGroup(
            SupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SupplierPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SupplierPanelLayout.setVerticalGroup(
            SupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SupplierPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainFrame.addTab("Suppliers", SupplierPanel);

        Frame2Clock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frame2Clock.setText("Time: 00/00/00 00:00:00");

        jMenu1.setText("Menu");

        jMenuItem3.setText("Logout");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Register");

        jMenuItem1.setText("New Customer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("New Employee");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem4.setText("New Item");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("New Supplier");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainFrame)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Frame2Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Frame2Clock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainFrame)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Logout();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new NewCust(this.getTitle().substring(0,27)+": New Customer");
        NewCust.main(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new NewEmp(getTitle().substring(0,27)+": New Employee");
        NewEmp.main(null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new NewItem(getTitle().substring(0,27)+": New Item");
        NewItem.main(null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Logout();
    }//GEN-LAST:event_formWindowClosing
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new NewSupplier(getTitle().substring(0,27)+": New Supplier");
        NewSupplier.main(null);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void CustTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustTableMouseClicked
        try {
            int row = CustTable.getSelectedRow();
                CustFNamebx.setSelectedItem(CustTable.getModel().getValueAt(row, 0).toString()); 
                CustMNamebx.setSelectedItem(CustTable.getModel().getValueAt(row, 1).toString()); 
                CustLNamebx.setSelectedItem(CustTable.getModel().getValueAt(row, 2).toString()); 
                CustConNumbx.setText(CustTable.getModel().getValueAt(row, 4).toString()); 
                CustAddressbx.setText(CustTable.getModel().getValueAt(row, 3).toString()); 
            
        } catch (Exception e) {
            e.printStackTrace();
            warning("An error has occured!");
        }
    }//GEN-LAST:event_CustTableMouseClicked
    private void custRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custRefreshActionPerformed
        RefreshTable();
    }//GEN-LAST:event_custRefreshActionPerformed
    private void custUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custUpdateActionPerformed
        if( CustFNamebx.getSelectedItem().toString().trim().isBlank() ||
            CustLNamebx.getSelectedItem().toString().trim().isBlank() ||
            CustConNumbx.getText().trim().isBlank() ||
            CustAddressbx.getText().trim().isBlank())
            warning("Please fill all of the FIELDS first then try again!");
        else updateCust();
            
    }//GEN-LAST:event_custUpdateActionPerformed
    private void custDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                           
        deleteCust();
    }                                                                                    
    private void CustSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustSearchActionPerformed
        LoadTableCust(  CustFNamebx.getSelectedItem().toString().trim(),
                    CustMNamebx.getSelectedItem().toString().trim(),
                    CustLNamebx.getSelectedItem().toString().trim());
    }//GEN-LAST:event_CustSearchActionPerformed

    private void InvRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvRefreshActionPerformed
        InvItmID.setText("");
        InvItmName.removeAllItems();
        InvItmName.setSelectedItem("");
        InvQuan.setText("");
        InvDesc.setText("");
        LoadTableInv("", "", "");
        
    }//GEN-LAST:event_InvRefreshActionPerformed
    private void InvSeasrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvSeasrchActionPerformed
        LoadTableInv(InvItmName.getSelectedItem().toString().trim(),
        InvQuan.getText().trim(),
        InvDesc.getText().trim());
    }//GEN-LAST:event_InvSeasrchActionPerformed
    private void InvUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvUpdateActionPerformed
        updateInven();
    }//GEN-LAST:event_InvUpdateActionPerformed
    private void InvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvTableMouseClicked
        try {
            int row = InvTable.getSelectedRow();
                InvItmID.setText(InvTable.getModel().getValueAt(row, 0).toString()); 
                InvItmName.setSelectedItem(InvTable.getModel().getValueAt(row, 1).toString()); 
                InvQuan.setText(InvTable.getModel().getValueAt(row, 2).toString()); 
                InvDesc.setText(InvTable.getModel().getValueAt(row, 3).toString()); 
            
        } catch (Exception e) {
            e.printStackTrace();
            warning("An error has occured!");
        }
    }//GEN-LAST:event_InvTableMouseClicked
    
    private void SupplierUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierUpdateActionPerformed
    private void SupplierSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierSearchActionPerformed
    private void SupplierRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierRefreshActionPerformed
    private void SupplierDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierDeleteActionPerformed
    private void SupplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierTableMouseClicked

    private void ItmTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItmTableMouseClicked
        try {
            int row = ItmTable.getSelectedRow();
                ItmName.setSelectedItem(ItmTable.getModel().getValueAt(row, 0).toString());
                ItmCategory.setText(ItmTable.getModel().getValueAt(row, 1).toString());
                ItmDesc.setText(ItmTable.getModel().getValueAt(row, 2).toString());
                ItmSRP.setText(ItmTable.getModel().getValueAt(row, 3).toString());
                ItmUPrice.setText(ItmTable.getModel().getValueAt(row, 4).toString());
                ItmSupplier.setSelectedItem(ItmTable.getModel().getValueAt(row, 5).toString());
        } catch (Exception e) {
            e.printStackTrace();
            warning("An error has occured!");
        }
    }//GEN-LAST:event_ItmTableMouseClicked
    private void ItmDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItmDeleteActionPerformed
    private void ItmRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmRefreshActionPerformed
        ItmName.removeAllItems();
        ItmName.setSelectedItem("");
        ItmCategory.setText("");
        ItmDesc.setText("");
        ItmSRP.setText("");
        ItmUPrice.setText("");
        ItmSupplier.removeAllItems();
        ItmSupplier.setSelectedItem("");
        LoadTableItm("", "", "", "", "", "");
    }//GEN-LAST:event_ItmRefreshActionPerformed
    private void ItmUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItmUpdateActionPerformed
    private void ItmSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmSearchActionPerformed
        LoadTableItm(
            ItmName.getSelectedItem().toString().trim(),
            ItmCategory.getText().trim(),
            ItmDesc.getText().trim(), 
            ItmSRP.getText().trim(), 
            ItmUPrice.getText().trim(), 
            ItmSupplier.getSelectedItem().toString().trim());
    }//GEN-LAST:event_ItmSearchActionPerformed

    private boolean checkInt(String x,String title){
        try {
            Double.parseDouble(x.replaceAll("[^0-9]",""));
            return true;
        } catch (Exception e) {
            warning("Please Enter a valid "+title);
            return false;
        }
    }
    private void Logout(){
        try{
            Object[] y = {"Yes","No","Cancel"};
            int x = JOptionPane.showOptionDialog(
                this, 
                "Are you sure that you want to Logout?\n"+
                "Any UNSAVED progress will be unrecorded...", 
                this.getTitle(), 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.WARNING_MESSAGE,null,y,y[2]);
            if (x == JOptionPane.YES_OPTION){
                new Frame1().setVisible(true);
                this.dispose();
            }
        }catch(Exception e){
            e.printStackTrace();
            warning("An error has occured!");
        }
    }
    private void updateCust(){
        String f=CustFNamebx.getSelectedItem().toString(),
        m=CustMNamebx.getSelectedItem().toString(),
        l=CustLNamebx.getSelectedItem().toString(),
        a=CustAddressbx.getText(),
        c=CustConNumbx.getText();
        JTextField fname = new JTextField(f);
        JTextField mname = new JTextField(m);
        JTextField lname = new JTextField(l);
        JTextField contact = new JTextField(c);
        JTextArea address = new JTextArea(a,5,0);
        address.setLineWrap(true);
        Object[] message={
            "First Name:", fname,
            "Middle Name(Optional):", mname,
            "Last Name:", lname,
            "Contact #:", contact,
            "Address:", address
        };

        int result = JOptionPane.showConfirmDialog(null, message,
            "Update Customer", JOptionPane.OK_CANCEL_OPTION);
        if(contact.getText().length()!=11){
            Object[] yy = {"OK"};
            int x=javax.swing.JOptionPane.showOptionDialog(
                null, 
                "Please enter a valid Contact Number [11 digit] and try again!", 
                "Inventory Management System: Update Customer", 
                javax.swing.JOptionPane.OK_OPTION, 
                javax.swing.JOptionPane.WARNING_MESSAGE,null,yy,yy[0]);
            if(x==JOptionPane.OK_OPTION)updateCust();
        }
        else if (result == JOptionPane.OK_OPTION) {
            String  test ="jdbc:sqlserver://"+
                    "localhost:1433;"+
                    "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                    "user=root;"+
                    "password=eykha6068",
            sqlUpdate="update CUSTOMER set "+
                    "CFName='"+fname.getText()+"',"+
                    "CMName='"+mname.getText()+"',"+
                    "CLName='"+lname.getText()+"',"+
                    "Address='"+address.getText()+"',"+
                    "ContactNo='"+contact.getText()+"' "+
                    "where "+
                    "CFName='"+f+"' and "+
                    "CMName='"+m+"' and "+
                    "CLName='"+l+"' and "+
                    "Address='"+a+"' and "+
                    "ContactNo='"+c+"'";

            try (Connection connection = DriverManager.getConnection(test);
                Statement stmt = connection.createStatement();) {
                stmt.executeUpdate(sqlUpdate);
                connection.close();
            }catch (Exception e) {
                e.printStackTrace();
                warning("An error has occured!");
            }
            finally{
                RefreshTable();
            }
        }
    }
    private void updateInven(){
        String 
        ItmName=InvItmName.getSelectedItem().toString().trim(),
        ItmQuan=InvQuan.getText(),
        ItemDesc=InvDesc.getText();
        JTextField itmquan = new JTextField(ItmQuan);
        JTextArea itmdesc = new JTextArea(ItemDesc,5,0);
        itmdesc.setLineWrap(true);
        Object[] message={
            "Quantity:", itmquan,
            "Description:", itmdesc
        };

        int result = JOptionPane.showConfirmDialog(null, message,
            "Update Inventory", JOptionPane.OK_CANCEL_OPTION);
        if(!checkInt(itmquan.getText(), "Quantity!")){
            RefreshTable();
        }
        else if (result == JOptionPane.OK_OPTION) {
            String  test ="jdbc:sqlserver://"+
                    "localhost:1433;"+
                    "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                    "user=root;"+
                    "password=eykha6068",

            sqlUpdate="update INVENTORY set "+
                    "InvQuantity='"+itmquan.getText()+"',"+
                    "InvCondition='"+itmdesc.getText()+"' "+
                    "where "+
                    "InvItemName='"+ItmName+"' and "+
                    "InvQuantity='"+ItmQuan+"' and "+
                    "InvCondition='"+ItemDesc+"'";

            try (Connection connection = DriverManager.getConnection(test);
                Statement stmt = connection.createStatement();) {
                stmt.executeUpdate(sqlUpdate);
                connection.close();
            }catch (Exception e) {
                e.printStackTrace();
                warning("An error has occured!");
            }
            finally{
                RefreshTable();
            }
        }
    }
    private void deleteCust(){
        String  test ="jdbc:sqlserver://"+
                    "localhost:1433;"+
                    "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                    "user=root;"+
                    "password=eykha6068",
                    fname=CustFNamebx.getSelectedItem().toString(),
                    mname=CustMNamebx.getSelectedItem().toString(),
                    lname=CustLNamebx.getSelectedItem().toString(),
                    contact=CustAddressbx.getText(),
                    address=CustConNumbx.getText(),
            sqlDelete="delete from CUSTOMER "+
                     "where "+
                     "CFName='"+fname+"' and "+
                     "CMName='"+mname+"' and "+
                     "CLName='"+lname+"' and "+
                     "Address='"+contact+"' and "+
                     "ContactNo='"+address+"'";

        try (Connection connection = DriverManager.getConnection(test);
            Statement stmt = connection.createStatement();) {
            stmt.executeUpdate(sqlDelete);
            connection.close();
        }catch (Exception e) {
            e.printStackTrace();
            warning("An error has occured!");
        }
        finally{
            RefreshTable();
        }
    }
    private DefaultTableModel buildTableModelCust(ResultSet rs)throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            if(!String.valueOf((Object)vector.get(0)).isBlank()&&
                !vector.contains(String.valueOf((Object)vector.get(0))))
                    CustFNamebx.addItem(String.valueOf((Object)vector.get(0)));
            if(!String.valueOf((Object)vector.get(1)).isBlank()&&
                !vector.contains(String.valueOf((Object)vector.get(1))))
                    CustMNamebx.addItem(String.valueOf((Object)vector.get(1)));
            if(!String.valueOf((Object)vector.get(2)).isBlank()&&
                !vector.contains(String.valueOf((Object)vector.get(2))))
                    CustLNamebx.addItem(String.valueOf((Object)vector.get(2)));
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
    }
    private DefaultTableModel buildTableModelInv(ResultSet rs)throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            if(!String.valueOf((Object)vector.get(1)).isBlank())
            InvItmName.addItem(String.valueOf((Object)vector.get(1)));

            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames){
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
    }
    private DefaultTableModel buildTableModelItm(ResultSet rs)throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            for(int re=0;re<data.getlen)
            if(!String.valueOf(vector.get(0)).isBlank()&&
                vector.get(0) != data.get(re).get(0))
                    ItmName.addItem(String.valueOf(vector.get(0)));

            if(!String.valueOf(vector.get(5)).isBlank()&&
                vector.get(5)!=data.get(re).get(5))
                    ItmSupplier.addItem(String.valueOf(vector.get(5)));
            data.add(vector);re++;
        }

        return new DefaultTableModel(data, columnNames){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false ,false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
    }
    
    private void RefreshTable(){
        try {
            LoadTableCust("", "", "");
            LoadTableInv("", "", "");
            LoadTableItm("", "", "", "", "", "");
        } catch (Exception e) {
            e.printStackTrace();
            warning("An error has occured!");
        }
        finally{
            CustFNamebx.setSelectedItem("");
            CustMNamebx.setSelectedItem("");
            CustLNamebx.setSelectedItem("");
            CustConNumbx.setText("");
            CustAddressbx.setText("");

            InvItmName.setSelectedItem("");
            InvItmID.setText("");
            InvDesc.setText("");
            InvQuan.setText("");

            ItmName.setSelectedItem("");
            ItmSupplier.setSelectedItem("");
            ItmCategory.setText("");
            ItmSRP.setText("");
            ItmUPrice.setText("");
            ItmDesc.setText("");
        }
    }
    private void LoadTableCust(String cfname, String cmname, String clname){
        String  test ="jdbc:sqlserver://"+
                    "localhost:1433;"+
                    "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                    "user=root;"+
                    "password=eykha6068",
                SQLCommand="select CFName as 'First Name',"+
                "CMName as 'Middle Name',"+
                "CLName as 'Last Name', Address, ContactNo as 'Contact #' from CUSTOMER ";
        if(!cfname.isBlank()||!cmname.isBlank()||!clname.isBlank()){
            SQLCommand=SQLCommand+" where ";
            if(!cfname.isBlank()) SQLCommand = SQLCommand+" CFName like '%"+cfname+"%' ";
        
            if(!cmname.isBlank()&&!cfname.isBlank()) SQLCommand = SQLCommand+" and CMName like '%"+cmname+"%' ";
            else if(!cmname.isBlank()) SQLCommand = SQLCommand+" CMName like '%"+cmname+"%' ";

            if(!clname.isBlank()&&!cmname.isBlank()||!cfname.isBlank()) SQLCommand = SQLCommand+" and CLName like '%"+clname+"%' ";
            else if(!clname.isBlank()) SQLCommand = SQLCommand+" CLName like '%"+clname+"% '";
        }
        try (Connection connection = DriverManager.getConnection(test);
                Statement stmt = connection.createStatement();) {
                ResultSet x = stmt.executeQuery(SQLCommand);
                CustTable.setModel(buildTableModelCust(x));
                
                connection.close();
        }catch (Exception e) {
            e.printStackTrace();
            warning("An error has occured!");
        }
    }
    private void LoadTableInv(String InvItemName, String InvQuantity, String InvDescription){
        String  test ="jdbc:sqlserver://"+
                    "localhost:1433;"+
                    "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                    "user=root;"+
                    "password=eykha6068",
                SQLCommand="select InvID as 'ID',"+
                "InvItemName as 'Item Name',"+
                "InvQuantity as 'Item Quantity', InvCondition as 'Item Description' from INVENTORY ";       
        try (Connection connection = DriverManager.getConnection(test);
            Statement stmt = connection.createStatement();) {

            if(!InvItemName.isBlank()||!InvQuantity.isBlank()||!InvDescription.isBlank()){
                SQLCommand= SQLCommand+" where ";
                if(!InvItemName.isBlank()) SQLCommand = SQLCommand+"InvItemName like '%"+InvItemName+"%' ";
                
                if(!InvItemName.isBlank()&&!InvQuantity.isBlank()) SQLCommand = SQLCommand+" and InvQuantity like '%"+InvQuantity+"%' ";
                else if(!InvQuantity.isBlank()) SQLCommand = SQLCommand+" InvQuantity like '%"+InvQuantity+"%' ";
    
                if(!InvDescription.isBlank()&&!InvQuantity.isBlank()||!InvItemName.isBlank()) SQLCommand = SQLCommand+" and InvCondition like '%"+InvDescription+"%' ";
                else if(!InvDescription.isBlank()) SQLCommand = SQLCommand+" InvCondition like '%"+InvDescription+"% '";
            }
            ResultSet x = stmt.executeQuery(SQLCommand);
            InvTable.setModel(buildTableModelInv(x));
            
            connection.close();
        }catch (Exception e) {
            e.printStackTrace();
            warning("An error has occured!");
        }
    }
    private void LoadTableItm(String ItmName, String ItmCategory, String ItmDesc,String ItmSRP, String ItmUPrice, String ItmSupplier){
        String  test ="jdbc:sqlserver://"+
                    "localhost:1433;"+
                    "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                    "user=root;"+
                    "password=eykha6068",
                SQLCommand="select "+
                "ItmName as 'Item Name',"+
                "ItmCategory as 'Item Category', ItmDescription as 'Item Description',ItmSRP as 'Suggested Retail Price',ItmUnitPrice as 'Unit Price',ItmSupplier as 'Supplier' from ITEM ";       
        try (Connection connection = DriverManager.getConnection(test);
            Statement stmt = connection.createStatement();) {

            if(!ItmName.isBlank()||!ItmCategory.isBlank()||!ItmDesc.isBlank()||
                !ItmSRP.isBlank()||!ItmUPrice.isBlank()||!ItmSupplier.isBlank()){
                SQLCommand= SQLCommand+" where ";

                if(!ItmName.isBlank()) SQLCommand = SQLCommand+" ItmName like '%"+ItmName+"%' ";
                
                if(!ItmName.isBlank()&&!ItmSupplier.isBlank()) SQLCommand = SQLCommand+" and ItmSupplier like '%"+ItmSupplier+"%' ";
                else if(!ItmSupplier.isBlank()) SQLCommand = SQLCommand+" ItmSupplier like '%"+ItmSupplier+"%' ";
    
                if(!ItmCategory.isBlank()&&!ItmName.isBlank()||!ItmSupplier.isBlank()) SQLCommand = SQLCommand+" and ItmCategory like '%"+ItmCategory+"%' ";
                else if(!ItmCategory.isBlank()) SQLCommand = SQLCommand+" InvCondition like '%"+ItmCategory+"% '";

                if(!ItmDesc.isBlank()&&!ItmName.isBlank()||!ItmSupplier.isBlank()||!ItmCategory.isBlank())SQLCommand = SQLCommand+" and ItmDescription like '%"+ItmDesc+"%' ";
                else if(!ItmDesc.isBlank())SQLCommand = SQLCommand+" ItmDescription like '%"+ItmDesc+"%' ";

                if(!ItmSRP.isBlank()&&!ItmName.isBlank()||!ItmSupplier.isBlank()||!ItmCategory.isBlank()||!ItmDesc.isBlank())SQLCommand = SQLCommand+" and ItmSRP like %"+ItmSRP+"% ";
                else if(!ItmSRP.isBlank())SQLCommand = SQLCommand+" ItmSRP like '%"+ItmSRP+"%' ";

                if(!ItmUPrice.isBlank()&&!ItmName.isBlank()||!ItmSupplier.isBlank()||!ItmCategory.isBlank()||!ItmDesc.isBlank()||!ItmSRP.isBlank())SQLCommand = SQLCommand+" and ItmUnitPrice like %"+ItmUPrice+"% ";
                else if(!ItmUPrice.isBlank())SQLCommand = SQLCommand+" ItmUnitPrice like %"+ItmUPrice+"% ";

            }
            ResultSet x = stmt.executeQuery(SQLCommand);
            ItmTable.setModel(buildTableModelItm(x));
            connection.close();
        }catch (Exception e) {
            e.printStackTrace();
            warning("An error has occured!");
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Frame2().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CashierPanel;
    private javax.swing.JTextArea CustAddressbx;
    private javax.swing.JTextField CustConNumbx;
    private javax.swing.JComboBox<String> CustFNamebx;
    private javax.swing.JComboBox<String> CustLNamebx;
    private javax.swing.JComboBox<String> CustMNamebx;
    private javax.swing.JButton CustSearch;
    public javax.swing.JTable CustTable;
    private javax.swing.JPanel CustomerPanel;
    private javax.swing.JLabel Frame2Clock;
    private javax.swing.JTextArea InvDesc;
    private javax.swing.JTextArea InvDesc2;
    private javax.swing.JTextField InvItmID;
    private javax.swing.JTextField InvItmID2;
    private javax.swing.JComboBox<String> InvItmName;
    private javax.swing.JComboBox<String> InvItmName2;
    private javax.swing.JTextField InvQuan;
    private javax.swing.JTextField InvQuan2;
    private javax.swing.JButton InvRefresh;
    private javax.swing.JButton InvSeasrch;
    private javax.swing.JTable InvTable;
    private javax.swing.JButton InvUpdate;
    private javax.swing.JPanel InventoryPanel;
    private javax.swing.JPanel ItemPanel;
    private javax.swing.JTextField ItmCategory;
    private javax.swing.JButton ItmDelete;
    private javax.swing.JTextArea ItmDesc;
    private javax.swing.JComboBox<String> ItmName;
    private javax.swing.JButton ItmRefresh;
    private javax.swing.JTextField ItmSRP;
    private javax.swing.JButton ItmSearch;
    private javax.swing.JComboBox<String> ItmSupplier;
    private javax.swing.JTable ItmTable;
    private javax.swing.JTextField ItmUPrice;
    private javax.swing.JButton ItmUpdate;
    private javax.swing.JTabbedPane MainFrame;
    private javax.swing.JButton SupplierDelete;
    private javax.swing.JPanel SupplierPanel;
    private javax.swing.JButton SupplierRefresh;
    private javax.swing.JButton SupplierSearch;
    private javax.swing.JTable SupplierTable;
    private javax.swing.JButton SupplierUpdate;
    private javax.swing.JButton custDelete;
    private javax.swing.JButton custRefresh;
    private javax.swing.JButton custUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    // End of variables declaration//GEN-END:variables
}
