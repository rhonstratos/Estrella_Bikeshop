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
    import javax.swing.table.*;
    import java.sql.*;
    import java.util.*;
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
        initComponents();
        LoadTable();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainFrame = new javax.swing.JTabbedPane();
        CashierPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        CustomerPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CustFNamebx = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustTable = new javax.swing.JTable();
        custRefresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CustMNamebx = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CustLNamebx = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CustConNumbx = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustAddressbx = new javax.swing.JTextArea();
        custUpdate = new javax.swing.JButton();
        custDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        InventoryPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        ItemSuppliersPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
            .addGap(0, 606, Short.MAX_VALUE)
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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search First Name");

        CustFNamebx.setEditable(true);

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

        custRefresh.setText("Refresh");
        custRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custRefreshActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Search Middle Name");

        CustMNamebx.setEditable(true);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search Last Name");

        CustLNamebx.setEditable(true);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contact Number");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address");

        CustAddressbx.setColumns(20);
        CustAddressbx.setRows(5);
        jScrollPane1.setViewportView(CustAddressbx);

        custUpdate.setText("Update");
        custUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custUpdateActionPerformed(evt);
            }
        });

        custDelete.setText("Delete");
        custDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custDeleteActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MANAGE CUSTOMERS");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CustFNamebx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustMNamebx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustLNamebx, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustConNumbx, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(custDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustFNamebx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustMNamebx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustLNamebx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustConNumbx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(custRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(122, 122, 122))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1235, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1235, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ItemSuppliersPanelLayout = new javax.swing.GroupLayout(ItemSuppliersPanel);
        ItemSuppliersPanel.setLayout(ItemSuppliersPanelLayout);
        ItemSuppliersPanelLayout.setHorizontalGroup(
            ItemSuppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemSuppliersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ItemSuppliersPanelLayout.setVerticalGroup(
            ItemSuppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemSuppliersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainFrame.addTab("Items & Suppliers", ItemSuppliersPanel);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Time: ");

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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainFrame)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
        }
    }
    private DefaultTableModel buildTableModel(ResultSet rs)throws SQLException {

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
            if(!String.valueOf((Object)vector.get(0)).isBlank())
            CustFNamebx.addItem(String.valueOf((Object)vector.get(0)));
            if(!String.valueOf((Object)vector.get(1)).isBlank())
            CustMNamebx.addItem(String.valueOf((Object)vector.get(1)));
            if(!String.valueOf((Object)vector.get(2)).isBlank())
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
    private void LoadTable(){
        String  test ="jdbc:sqlserver://"+
                    "localhost:1433;"+
                    "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                    "user=root;"+
                    "password=eykha6068",
            sqlCombo="select CFName as 'First Name',"+
                     "CMName as 'Middle Name',"+
                     "CLName as 'Last Name', Address, ContactNo as 'Contact #'"+" from CUSTOMER";

        try (Connection connection = DriverManager.getConnection(test);
            Statement stmt = connection.createStatement();) {
            ResultSet x = stmt.executeQuery(sqlCombo);
            CustFNamebx.removeAllItems();
            CustMNamebx.removeAllItems();
            CustLNamebx.removeAllItems();
            CustTable.setModel(buildTableModel(x));
            
            connection.close();
        }catch (Exception e) {
            e.printStackTrace();
            warning("An error sa occured!");
        }
        finally{
            CustFNamebx.setSelectedItem("");
            CustMNamebx.setSelectedItem("");
            CustLNamebx.setSelectedItem("");
            CustConNumbx.setText("");
            CustAddressbx.setText("");
        }
    }
    private void LoadTable(String cfname, String cmname, String clname){
        String  test ="jdbc:sqlserver://"+
                    "localhost:1433;"+
                    "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                    "user=root;"+
                    "password=eykha6068",
                SQLCommand="select CFName as 'First Name',"+
                "CMName as 'Middle Name',"+
                "CLName as 'Last Name', Address, ContactNo as 'Contact #'"+" from CUSTOMER where ";
        if(!cfname.isBlank()) SQLCommand = SQLCommand+"CFName like '%"+cfname+"%' ";
        
        if(!cmname.isBlank()&&!cfname.isBlank()) SQLCommand = SQLCommand+" and CMName like '%"+cmname+"%' ";
        else if(!cmname.isBlank()) SQLCommand = SQLCommand+" CMName like '%"+cmname+"%' ";

        if(!clname.isBlank()&&!cmname.isBlank()||!cfname.isBlank()) SQLCommand = SQLCommand+" and CLName like '%"+clname+"%' ";
        else if(!clname.isBlank()) SQLCommand = SQLCommand+" CLName like '%"+clname+"% '";

        try (Connection connection = DriverManager.getConnection(test);
            Statement stmt = connection.createStatement();) {
            ResultSet x = stmt.executeQuery(SQLCommand);
            CustTable.setModel(buildTableModel(x));
            
            connection.close();
        }catch (Exception e) {
            e.printStackTrace();
            warning("An error sa occured!");
        }
    }
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
            warning(e.toString());
        }
    }//GEN-LAST:event_CustTableMouseClicked
    private void custRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custRefreshActionPerformed
        LoadTable();
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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoadTable(  CustFNamebx.getSelectedItem().toString().trim(),
                    CustMNamebx.getSelectedItem().toString().trim(),
                    CustLNamebx.getSelectedItem().toString().trim());
    }//GEN-LAST:event_jButton1ActionPerformed
    public void updateCust(){
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
                LoadTable();
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
            LoadTable();
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
    public javax.swing.JTable CustTable;
    private javax.swing.JPanel CustomerPanel;
    private javax.swing.JPanel InventoryPanel;
    private javax.swing.JPanel ItemSuppliersPanel;
    private javax.swing.JTabbedPane MainFrame;
    private javax.swing.JButton custDelete;
    private javax.swing.JButton custRefresh;
    private javax.swing.JButton custUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
