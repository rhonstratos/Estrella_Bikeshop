/**
 * MIT License
 *
 * Copyright (c) 2021 rhonstratos
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.rhonstratos.java;
    import javax.imageio.ImageIO;
    import javax.swing.*;
    import javax.swing.Timer;
    import javax.swing.table.*;
    import java.awt.event.*;
    import java.sql.*;
    import java.util.*;
    import java.time.format.*;  
    import java.time.*;
    import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 * Inventory System Management: Main Menu Frame
 * @author rhonstratos
 */
public class Frame2 extends javax.swing.JFrame implements warn{
    /**
     * JOptionPane warning
     * @param ErrorMessage String value
     * @return Error value shown in a JOptionPane
     */
    public void warning(String ErrorMessage){
        Object[] yy = {"OK"};
        ErrorMessage=ErrorMessage.replaceAll("An error has occurred!", "An error has occurred!<br>");
        JOptionPane.showOptionDialog(
                this, 
                "<html><body><p style='width: 300px;'>"+ErrorMessage+" </p></body></html>", 
                this.getTitle(), 
                JOptionPane.OK_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                new ImageIcon(getClass().getResource("/resources/warnico.png")),
                yy,yy[0]);
    }
    
    /**
     * Test run if Microsoft SQL Database Connection is alive
     * 
     * @exception e The TCP/IP connection to the host localhost, port 1433 has failed. 
     * Error: "connect timed out. Verify the connection properties. Make sure that an instance of SQL Server is running 
     * on the host and accepting TCP/IP connections at the port. Make sure that TCP connections to the port are not 
     * blocked by a firewall."."
     */
    private void firstRe(){
        boolean cat=true;
        try {
            Connection c = DriverManager.getConnection(test);
            Statement con = c.createStatement();
            ResultSet r =con.executeQuery("select 1");
            r.next();
            c.close();con.close();
        } catch (Exception e) {
            if(e.getMessage().equalsIgnoreCase("The TCP/IP connection to the host localhost, port 1433 has failed. Error: \"connect timed out. Verify the connection properties. Make sure that an instance of SQL Server is running on the host and accepting TCP/IP connections at the port. Make sure that TCP connections to the port are not blocked by a firewall.\".")){
                warning(e.getMessage()+" <br>Please check if your Microsoft SQL Server then try again!");
            }else{
                warning("An error has occured! <br>"+e.getMessage());
            }
            cat=false;
        }finally{
            if(cat) RefreshTable();
        }
        cat=true;
    }
    /**
     * Initial loading of all components
     */
    public Frame2() {
        try {
            initComponents();
            ArrayList<java.awt.Image> ico = new ArrayList<>();
            ico.add(ImageIO.read(new java.net.URL(getClass().getResource("/resources/icons/20x20.png").toString())));
            ico.add(ImageIO.read(new java.net.URL(getClass().getResource("/resources/icons/40x40.png").toString())));
            setIconImages(ico);
            this.setVisible(true);
            DateTimeFormatter date = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy (MM/dd/yyyy)"); 
            DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm:ss a");  
            new Timer(1000, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    Frame2Clock.setText("Local Date: "+date.format(LocalDateTime.now())+
                                        " Local Time: "+time.format(LocalDateTime.now()));
                }
            }).start();
        } catch (Exception e) {
            warning("An error has occured! <br>"+e.getMessage());
        }
        firstRe();
        
        AutoCompleteDecorator.decorate(CustFNamebx);
        AutoCompleteDecorator.decorate(CustMNamebx);
        AutoCompleteDecorator.decorate(CustLNamebx);
        AutoCompleteDecorator.decorate(InvItmName);
        AutoCompleteDecorator.decorate(ItmName);
        AutoCompleteDecorator.decorate(ItmSupplier);
        AutoCompleteDecorator.decorate(SupplierName);
        AutoCompleteDecorator.decorate(CashierItemName);
        AutoCompleteDecorator.decorate(CashierCustomer);
        AutoCompleteDecorator.decorate(CashierEmployee);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainFrame = new javax.swing.JTabbedPane();
        CashierPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        CashierPane = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        CashierCustomer = new javax.swing.JComboBox<>();
        CashierEmployee = new javax.swing.JComboBox<>();
        CashierItemName = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        CashierStock = new javax.swing.JTextField();
        PunchOrder = new javax.swing.JButton();
        CashierSavePrint = new javax.swing.JButton();
        CashierClearOrders = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        CashierQuantity = new javax.swing.JFormattedTextField();
        CashierPrice = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        CashierItmLoad = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        CashierTable = new javax.swing.JTable();
        CashierTablePane = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        CashierTotal = new javax.swing.JTextField();
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
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        InvTable = new javax.swing.JTable();
        ItemPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ItmTable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ItmName = new javax.swing.JComboBox<>();
        ItmSupplier = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ItmCategory = new javax.swing.JTextField();
        ItmSRP = new javax.swing.JTextField();
        ItmUPrice = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        ItmDesc = new javax.swing.JTextArea();
        ItmRefresh = new javax.swing.JButton();
        ItmSearch = new javax.swing.JButton();
        ItmUpdate = new javax.swing.JButton();
        ItmDelete = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        SupplierPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        SupplierName = new javax.swing.JComboBox<>();
        SupplierConNum = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        SupplierAddress = new javax.swing.JTextArea();
        SupplierUpdate = new javax.swing.JButton();
        SupplierSearch = new javax.swing.JButton();
        SupplierRefresh = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        SupplierDelete = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        SupplierTable = new javax.swing.JTable();
        Frame2Clock = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inventory Management System: Main Menu");
        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        MainFrame.setBackground(new java.awt.Color(153, 153, 153));

        CashierPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("CASHIER & CUSTOMER");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Employee");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Customer");

        CashierCustomer.setEditable(true);

        CashierEmployee.setEditable(true);

        CashierItemName.setEditable(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Item Name");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Quantity");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("PUNCH ORDER");

        CashierStock.setEditable(false);
        CashierStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PunchOrder.setText("Punch Order");
        PunchOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PunchOrderActionPerformed(evt);
            }
        });

        CashierSavePrint.setText("Save & Print");
        CashierSavePrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashierSavePrintActionPerformed(evt);
            }
        });

        CashierClearOrders.setText("Clear Orders");
        CashierClearOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashierClearOrdersActionPerformed(evt);
            }
        });

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Available Stocks");

        CashierQuantity.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        CashierQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        CashierPrice.setEditable(false);
        CashierPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Price");

        CashierItmLoad.setToolTipText("SEARCH ITEM AND LOADS ");
        CashierItmLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashierItmLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CashierPaneLayout = new javax.swing.GroupLayout(CashierPane);
        CashierPane.setLayout(CashierPaneLayout);
        CashierPaneLayout.setHorizontalGroup(
            CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashierPaneLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CashierPaneLayout.createSequentialGroup()
                        .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CashierPaneLayout.createSequentialGroup()
                                .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CashierStock)
                                    .addComponent(CashierQuantity)
                                    .addComponent(CashierPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PunchOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(CashierClearOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CashierSavePrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(CashierPaneLayout.createSequentialGroup()
                                .addComponent(CashierItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CashierItmLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CashierPaneLayout.createSequentialGroup()
                        .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CashierCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CashierEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        CashierPaneLayout.setVerticalGroup(
            CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashierPaneLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CashierEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CashierCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CashierItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CashierItmLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CashierPaneLayout.createSequentialGroup()
                        .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CashierQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CashierStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CashierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CashierPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CashierPaneLayout.createSequentialGroup()
                        .addComponent(PunchOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CashierClearOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CashierSavePrint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CashierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity", "Price", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CashierTable.setRowHeight(35);
        CashierTable.setShowGrid(true);
        jScrollPane9.setViewportView(CashierTable);

        CashierTablePane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Total");

        CashierTotal.setEditable(false);
        CashierTotal.setBackground(new java.awt.Color(0, 0, 0));
        CashierTotal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        CashierTotal.setForeground(new java.awt.Color(0, 255, 0));
        CashierTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout CashierTablePaneLayout = new javax.swing.GroupLayout(CashierTablePane);
        CashierTablePane.setLayout(CashierTablePaneLayout);
        CashierTablePaneLayout.setHorizontalGroup(
            CashierTablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CashierTablePaneLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CashierTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        CashierTablePaneLayout.setVerticalGroup(
            CashierTablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CashierTablePaneLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(CashierTablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CashierTotal)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CashierPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CashierTablePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CashierPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CashierTablePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
        jPanel1.setPreferredSize(new java.awt.Dimension(508, 653));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MANAGE CUSTOMERS");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search First Name");

        CustFNamebx.setEditable(true);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Search Middle Name");

        CustMNamebx.setEditable(true);
        CustMNamebx.setVerifyInputWhenFocusTarget(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search Last Name");

        CustLNamebx.setEditable(true);
        CustLNamebx.setVerifyInputWhenFocusTarget(false);

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
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(custDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CustSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CustLNamebx, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CustMNamebx, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CustFNamebx, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(CustConNumbx, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustFNamebx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustMNamebx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustLNamebx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustConNumbx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
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
        jLabel13.setText("Quantiy");
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

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Description");
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(InvItmName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InvQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(InvUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InvSeasrch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InvRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvItmName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InvQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InvRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InvSeasrch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        InvTable.setToolTipText("");
        InvTable.setRowHeight(35);
        InvTable.setShowGrid(true);
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
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

        ItmTable.setToolTipText("");
        ItmTable.setRowHeight(35);
        ItmTable.setShowGrid(true);
        ItmTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItmTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(ItmTable);

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setPreferredSize(new java.awt.Dimension(508, 653));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MANAGE ITEMS");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Search Item Name");

        ItmName.setEditable(true);

        ItmSupplier.setEditable(true);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Search Supplier");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Category");

        ItmCategory.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ItmSRP.setEditable(false);
        ItmSRP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ItmUPrice.setEditable(false);
        ItmUPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ItmDesc.setEditable(false);
        ItmDesc.setColumns(20);
        ItmDesc.setLineWrap(true);
        ItmDesc.setRows(5);
        jScrollPane5.setViewportView(ItmDesc);

        ItmRefresh.setText("Refresh");
        ItmRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmRefreshActionPerformed(evt);
            }
        });

        ItmSearch.setText("Search");
        ItmSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmSearchActionPerformed(evt);
            }
        });

        ItmUpdate.setText("Update");
        ItmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmUpdateActionPerformed(evt);
            }
        });

        ItmDelete.setText("Delete");
        ItmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmDeleteActionPerformed(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Description");
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SRP & Unit Price");
        jLabel15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(ItmDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ItmUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                    .addComponent(ItmSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ItmRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(ItmSRP, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ItmUPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ItmCategory)
                                .addComponent(ItmSupplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ItmName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane5)))))
                .addGap(50, 50, 50))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(ItmName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ItmSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ItmCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItmSRP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItmUPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItmRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItmSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItmDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItmUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
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
        jLabel17.setText("Search Supplier Name");

        SupplierName.setEditable(true);

        SupplierConNum.setEditable(false);
        SupplierConNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SupplierAddress.setEditable(false);
        SupplierAddress.setColumns(20);
        SupplierAddress.setLineWrap(true);
        SupplierAddress.setRows(5);
        jScrollPane6.setViewportView(SupplierAddress);

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

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Address");
        jLabel19.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        SupplierDelete.setText("Delete");
        SupplierDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierDeleteActionPerformed(evt);
            }
        });

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Contact Number");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(SupplierSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(SupplierDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SupplierUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(SupplierRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SupplierName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SupplierConNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))))
                .addGap(50, 50, 50))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupplierConNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SupplierSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupplierRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupplierDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupplierUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        SupplierTable.setToolTipText("");
        SupplierTable.setRowHeight(35);
        SupplierTable.setShowGrid(true);
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
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
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
        Frame2Clock.setText("Time:");

        jMenu1.setText("Menu");

        jMenuItem3.setText("Logout");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setText("Refresh All");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

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

        jMenu3.setText("Manage");

        jMenuItem7.setText("Employees");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Login");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Frame2Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainFrame)
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
    /**
     * Closing event of this frame
     * @param evt catches closing event
     * @return runs Logout();
     */
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Logout();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    /**
     * Catches menu item: New Customer
     * @param evt catches click event
     * @return Loads New Customer dialog
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new NewCust(this.getTitle().substring(0,27)+": New Customer");
        NewCust.main(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /**
     * Catches menu item: New Employee
     * @param evt catches click event
     * @return Loads New Employee dialog
     */
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new NewEmp(getTitle().substring(0,27)+": New Employee");
        NewEmp.main(null);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    /**
     * Catches menu item: New Item
     * @param evt catches click event
     * @return Loads New Item dialog
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new NewItem(getTitle().substring(0,27)+": New Item");
        NewItem.main(null);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    /**
     * Ovverides default JFrame.DISPOSE and JFrame.EXIT_ON_CLOSE event
     * @param evt catches click event
     * @return Loads Logout();
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Logout();
    }//GEN-LAST:event_formWindowClosing
    /**
     * Catches menu item: New Supplier
     * @param evt catches click event
     * @return Loads New Supplier dialog
     */
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new NewSupplier(getTitle().substring(0,27)+": New Supplier");
        NewSupplier.main(null);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    /**
     * Catches menu item: Refresh All
     * @param evt catches click event
     * @return Loads RefreshTable()
     */
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        RefreshTable();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * Catches click event on Customer Tabbed Pane: CustTable JTable
     * @param evt catches click event
     * @return Clears: CustFNamebx, CustMNamebx, CustLNamebx, CustConNumbx, CustAddressbx
     * @exception e Exception
     */
    private void CustTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustTableMouseClicked
        try {
            int row = CustTable.getSelectedRow();
                CustFNamebx.setSelectedItem(CustTable.getModel().getValueAt(row, 0).toString()); 
                CustMNamebx.setSelectedItem(CustTable.getModel().getValueAt(row, 1).toString()); 
                CustLNamebx.setSelectedItem(CustTable.getModel().getValueAt(row, 2).toString()); 
                CustConNumbx.setText(CustTable.getModel().getValueAt(row, 4).toString()); 
                CustAddressbx.setText(CustTable.getModel().getValueAt(row, 3).toString()); 
            
        } catch (Exception e) {
            warning("An error has occured! <br>"+e.getMessage());
        }
    }//GEN-LAST:event_CustTableMouseClicked   
    private void custRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custRefreshActionPerformed
        CustFNamebx.setSelectedItem("");
        CustMNamebx.setSelectedItem("");
        CustLNamebx.setSelectedItem("");
        CustConNumbx.setText("");
        CustAddressbx.setText("");
        LoadTableCust("", "", "");
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
    
    private void SupplierUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierUpdateActionPerformed
        updateSupplier();
    }//GEN-LAST:event_SupplierUpdateActionPerformed
    private void SupplierSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierSearchActionPerformed
        LoadTableSup(SupplierName.getSelectedItem().toString(),
                    SupplierConNum.getText(),
                    SupplierAddress.getText());
    }//GEN-LAST:event_SupplierSearchActionPerformed
    private void SupplierRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierRefreshActionPerformed
        SupplierName.setSelectedItem("");
        SupplierAddress.setText("");
        SupplierConNum.setText("");
        LoadTableSup("", "", "");
    }//GEN-LAST:event_SupplierRefreshActionPerformed
    private void SupplierDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierDeleteActionPerformed
        deleteSupplier();
    }//GEN-LAST:event_SupplierDeleteActionPerformed
    private void SupplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierTableMouseClicked
        try {
            int row = SupplierTable.getSelectedRow();
                SupplierName.setSelectedItem(SupplierTable.getModel().getValueAt(row, 0).toString()); 
                SupplierConNum.setText(SupplierTable.getModel().getValueAt(row, 1).toString());
                SupplierAddress.setText(SupplierTable.getModel().getValueAt(row, 2).toString()); 
        } catch (Exception e) {
            warning("An error has occured! <br>"+e.getMessage());
        }
    }//GEN-LAST:event_SupplierTableMouseClicked
    
    private void InvTableMouseClicked(java.awt.event.MouseEvent evt) {                                      
        try {
            int row = InvTable.getSelectedRow();
                InvItmName.setSelectedItem(InvTable.getModel().getValueAt(row, 0).toString()); 
                InvQuan.setText(InvTable.getModel().getValueAt(row, 1).toString()); 
                InvDesc.setText(InvTable.getModel().getValueAt(row, 2).toString()); 
            
        } catch (Exception e) {
            warning("An error has occured! <br>"+e.getMessage());
        }
    }                                       
    private void InvRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvRefreshActionPerformed
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
    private void InvUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        updateInven();
    }                                            
    
    private void PunchOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PunchOrderActionPerformed
        //Object[] asd ={"Item 1","Item 2","Item 3","Item 4"};
        punchOrderTable(CashierItemName.getSelectedItem().toString(),
                        CashierQuantity.getText(),
                        CashierPrice.getText());
    }//GEN-LAST:event_PunchOrderActionPerformed
    private void CashierSavePrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashierSavePrintActionPerformed
        saveInvcOrder();
    }//GEN-LAST:event_CashierSavePrintActionPerformed
    private void CashierClearOrdersActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        clearOrder();
    }                                                     
    private void CashierItmLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashierItmLoadActionPerformed
        populateCashier(CashierItemName.getSelectedItem().toString().trim());
    }//GEN-LAST:event_CashierItmLoadActionPerformed
    
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
            warning("An error has occured! <br>"+e.getMessage());
        }
    }//GEN-LAST:event_ItmTableMouseClicked
    private void ItmDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmDeleteActionPerformed
        deleteItem();
    }//GEN-LAST:event_ItmDeleteActionPerformed
    private void ItmUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmUpdateActionPerformed
        updateItem();
    }//GEN-LAST:event_ItmUpdateActionPerformed
    private void ItmSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmSearchActionPerformed
        LoadTableItm(
            ItmName.getSelectedItem().toString().trim(),
            ItmCategory.getText().trim(),
            ItmDesc.getText().trim(),
            ItmSupplier.getSelectedItem().toString().trim());
    }//GEN-LAST:event_ItmSearchActionPerformed
    private void ItmRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmRefreshActionPerformed
        ItmName.removeAllItems();
        ItmName.setSelectedItem("");
        ItmCategory.setText("");
        ItmDesc.setText("");
        ItmSRP.setText("");
        ItmUPrice.setText("");
        ItmSupplier.removeAllItems();
        ItmSupplier.setSelectedItem("");
        LoadTableItm("", "", "", "");
    }//GEN-LAST:event_ItmRefreshActionPerformed  
    
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
            warning("An error has occured! <br>"+e.getMessage());
        }
    }

    private void populateCashier(String ItemName){
        String 
        SQLCommand="select ITEM.ItmName,ITEM.ItmUnitPrice,INVENTORY.InvQuantity from ITEM "+
        " inner join INVENTORY on INVENTORY.InvItemName=ITEM.ItmName "+
        " where ITEM.Itmname like '%"+ItemName+"%'";       
        try (Connection connection = DriverManager.getConnection(test);
            Statement stmt = connection.createStatement();) {
        
        ResultSet x = stmt.executeQuery(SQLCommand);
        while(x.next()){
            if(!ItemName.isBlank()&&
                x.getString(1).equalsIgnoreCase(ItemName)){
                CashierStock.setText(x.getString(3));
                CashierPrice.setText(x.getString(2));
            }
        }
        connection.close();
        }catch (Exception e) {
            warning("An error has occured! <br>"+e.getMessage());
        }
        finally{
            CashierQuantity.setText("");
        }
    }
    private void punchOrderTable(String ItmName, String Quan, String Price){
        ItmName=ItmName.trim();
        Quan=Quan.trim();
        if (ItmName.isBlank()){
            warning("An error has occurred! <br>Please select an item then try again!");
        }
        else if(checkInt(Quan, "Quantity!")){
            if(Double.parseDouble(CashierStock.getText())>=Double.parseDouble(Quan)&&
                Double.parseDouble(Quan)>0){
                ((DefaultTableModel)CashierTable.getModel()).addRow(new Object[]{
                    ItmName,
                    Quan,
                    Price,
                    Double.toString(
                        Double.parseDouble(Quan) * Double.parseDouble(Price)
                        )
                    });
                ((DefaultComboBoxModel<String>)CashierItemName.getModel()).removeElement(ItmName);
                double tot=0;
                try {
                    for (int x=0; x<((DefaultTableModel)CashierTable.getModel()).getRowCount();x++){
                        tot+=Double.parseDouble(((DefaultTableModel)CashierTable.getModel()).getValueAt(x, 3).toString());
                    }
                    CashierTotal.setText("PHP "+Double.toString(tot));
                    invcTotal=tot;
                } catch (Exception e) {
                    warning("An error has occured! <br>"+e.getMessage());
                }
                finally{
                    CashierItemName.setSelectedItem("");
                    CashierPrice.setText("");
                    CashierQuantity.setText("");
                    CashierStock.setText("");
                }
            }
            else if (Double.parseDouble(Quan) <1)
            warning("An error has occurred! <br>Quantity value must be greater than or equal to 1! <br>Please try again!");
            else if (Double.parseDouble(CashierStock.getText())<1)
            warning("An error has occurred! <br>"+ItmName+" is already out of stock!");
            else if (Double.parseDouble(CashierStock.getText()) < Double.parseDouble(Quan))
            warning("An error has occurred! <br>Quantiy must not be greater than the stock value! <br>Please try again!");
        }
    }
    private void clearOrder(){
        ((DefaultTableModel)CashierTable.getModel()).setRowCount(0);
        ((DefaultComboBoxModel<String>)CashierItemName.getModel()).removeAllElements();
        for(int x=0;x<InvTable.getRowCount();x++){
            ((DefaultComboBoxModel<String>)CashierItemName.getModel()).addElement(
                ((DefaultTableModel)InvTable.getModel()).getValueAt(x, 0).toString()
            );
        }
        CashierItemName.setSelectedItem("");
        CashierStock.setText("");
        CashierPrice.setText("");
        CashierCustomer.setSelectedItem("");
        CashierEmployee.setSelectedItem("");
        CashierTotal.setText("");
        CashierQuantity.setText("");
    }
    private void saveInvcOrder(){
        try {
            if(((DefaultTableModel)CashierTable.getModel()).getRowCount()>0){
                Object[] y = {"Yes","No","Cancel"};
                int x = JOptionPane.showOptionDialog(this,
                    "message",
                    "Are you sure that you want to continue?",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("/resources/woggy_deskSlap.gif"))/*icon*/,
                    y, y[2]);
                if(x==0){
                    JFormattedTextField pei = new JFormattedTextField();
                    pei.setFormatterFactory(
                        new javax.swing.text.DefaultFormatterFactory(
                            new javax.swing.text.NumberFormatter(
                                new java.text.DecimalFormat("#0"))));
                    int paynt = JOptionPane.showOptionDialog(this,
                    new Object[]{
                        "Enter Payment: ",pei
                    }, 
                    "Payment", 
                    JOptionPane.OK_CANCEL_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, 
                    new ImageIcon(getClass().getResource("/resources/woggy_moneh.gif")), 
                    new Object[]{"Proceed","Cancel"}, null);
                    double payment=0;
                    try {
                        payment=Double.parseDouble(pei.getText());
                    } catch (Exception e) { warning("An error has occurred! <br>Please enter the proper amount of payment then try again!");}
                    if(payment < invcTotal)
                        warning("An error has occurred! <br>Please enter the proper amount of payment then try again!");
                    else if(paynt==0){
                        String[]custname = CashierCustomer.getSelectedItem().toString().trim().split(" "),
                                emplo=CashierEmployee.getSelectedItem().toString().trim().split(" ");
                        String SQLinitCust=
                                "select CustID from CUSTOMER where CFName='"+custname[0]+"' and "+
                                "CLName='"+custname[1]+"'",
                                SQLinitEmplo=
                                "select EmpID from EMPLOYEE where EmpFName='"+emplo[0]+"' and "+
                                "EmpLName='"+emplo[1]+"'";
                        int custID=0,empID=0; 
                        int invoiceID=0;
    
                        try (Connection connection = DriverManager.getConnection(test);
                            Statement stmt = connection.createStatement();){                   
    
                            ResultSet initCust = stmt.executeQuery(SQLinitCust);
                            while(initCust.next()){
                                custID=initCust.getInt("CustID");
                            }initCust.close();
    
                            ResultSet initEmp = stmt.executeQuery(SQLinitEmplo);
                            while (initEmp.next()){
                                empID=initEmp.getInt("EmpID");
                            }initEmp.close();
                            
                            String SQLInvoice =
                            "insert into INVOICE (CustomerID,EmployeeID,InvcTotal,InvcPay,InvcChange) "+
                            "values( cast("+Double.toString(custID)+" as int),"+
                            "cast("+Double.toString(empID)+" as int),"+
                            invcTotal+","+
                            payment+","+
                            (payment-invcTotal)+")";
                            stmt.executeUpdate(SQLInvoice);
                            
                            ResultSet invc = stmt.executeQuery("select InvcID from INVOICE where "+
                            "InvcOrderDate = cast(datepart(year,getdate()) as varchar)+'-'+cast(datepart(month,getdate()) as varchar)+'-'+cast(datepart(day,getdate()) as varchar)"+
                            " and "+
                            "CustomerID = "+Double.toString(custID)+
                            " and "+
                            "EmployeeID = "+Double.toString(empID)+
                            " and "+
                            "InvcTotal="+Double.toString(invcTotal));
                            while(invc.next()){
                                invoiceID=invc.getInt("InvcID");
                            }invc.close();
                            
                            int orders =0;
                            while(orders<((DefaultTableModel)CashierTable.getModel()).getRowCount()){
                                String SQLOrder =
                                "insert into \"ORDER\" (OrdID,CustID,ItmName,OrdQuantity,OrdPrice,OrdSubtotal) values ("+
                                invoiceID+","+custID+",'"+
                                ((DefaultTableModel)CashierTable.getModel()).getValueAt(orders, 0)+"',"+
                                ((DefaultTableModel)CashierTable.getModel()).getValueAt(orders, 1)+","+
                                ((DefaultTableModel)CashierTable.getModel()).getValueAt(orders, 2)+","+
                                ((DefaultTableModel)CashierTable.getModel()).getValueAt(orders, 3)+")";
                                stmt.executeUpdate(SQLOrder);
                                String SQLInvenUpdate=
                                "update INVENTORY set InvQuantity=(select InvQuantity from INVENTORY where InvItemName='"+
                                ((DefaultTableModel)CashierTable.getModel()).getValueAt(orders, 0)+
                                "')-"+((DefaultTableModel)CashierTable.getModel()).getValueAt(orders, 1)+
                                " where "+
                                "InvItemName='"+((DefaultTableModel)CashierTable.getModel()).getValueAt(orders, 0)+"'";
                                stmt.executeUpdate(SQLInvenUpdate);
                                orders++;
                            }stmt.close();
                            JOptionPane.showOptionDialog(this, 
                                "", 
                                "Payment Successful!", 
                                JOptionPane.OK_OPTION, 
                                JOptionPane.PLAIN_MESSAGE, 
                                new ImageIcon(getClass().getResource("/resources/woggy_wineWink.gif")), new Object[]{"Noice!"}, null);
                            clearOrder();
                        } catch (Exception e) {
                            e.printStackTrace();
                            warning("An error has occurred! <br>"+e.getMessage());
                        } 
                    }else{
                        warning("An error has occurred! <br>Please enter the proper amount of payment then try again!");
                    }
                    payment=0;
                }
            }
            else{
                warning("An error has occurred! <br>The ORDER table is empty!");
            }
        } catch (Exception e) {
            warning("An error has occurred! <br>"+e.getMessage());
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

        int result = JOptionPane.showConfirmDialog(this, message,
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
        else if(Double.parseDouble(contact.getText())<0){
            warning("Invalid Contact Number! \nPlease enter a valid Contact Number and try again!");
            CustFNamebx.setSelectedItem("");
            CustMNamebx.setSelectedItem("");
            CustLNamebx.setSelectedItem("");
            CustConNumbx.setText("");
            CustAddressbx.setText("");
            LoadTableCust("", "", "");
        }
        else if (result == JOptionPane.OK_OPTION) {
            String  
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
                warning("An error has occured! <br>"+e.getMessage());
            }
            finally{
                CustFNamebx.setSelectedItem("");
                CustMNamebx.setSelectedItem("");
                CustLNamebx.setSelectedItem("");
                CustConNumbx.setText("");
                CustAddressbx.setText("");
                LoadTableCust("", "", "");
            }
        }
    }
    private void updateInven(){
        String 
        ItmName=InvItmName.getSelectedItem().toString().trim(),
        ItmQuan=InvQuan.getText(),
        ItemDesc=InvDesc.getText(),
        sqlUpdate="";
        JTextField itmName = new JTextField(ItmName);
            itmName.setHorizontalAlignment(JTextField.CENTER);
            itmName.setEditable(false);
        JTextField itmquan = new JTextField(ItmQuan);
        JTextArea itmdesc = new JTextArea(ItemDesc,5,0);
        itmdesc.setLineWrap(true);
        Object[] message={
            "Quantity:", itmquan,
            "Description:", itmdesc
        };

        int result = JOptionPane.showConfirmDialog(this, message,
            "Update Inventory", JOptionPane.OK_CANCEL_OPTION);
        boolean run=false;
        if(!checkInt(itmquan.getText(), "Quantity!")){
            RefreshTable();
        }
        else if (result == JOptionPane.OK_OPTION&&
                itmquan.getText().trim().equals("0")){
            int delete = JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to delete ["+ItmName+"]?\n"+
            "",
            "Delete Inventory", JOptionPane.OK_CANCEL_OPTION);
            if(delete==JOptionPane.OK_OPTION){
                
                sqlUpdate="delete from INVENTORY where "+
                        "InvItemName='"+ItmName+"' and "+
                        "InvQuantity='"+ItmQuan+"' and "+
                        "InvCondition='"+ItemDesc+"'";
            }
            run=true;
        }
        else if(Integer.parseInt(itmquan.getText())<0){
            warning("Invalid Quantity! \nPlease enter a valid Quantity and try again!");
            InvItmName.removeAllItems();
            InvItmName.setSelectedItem("");
            InvQuan.setText("");
            InvDesc.setText("");
            LoadTableInv("", "", "");
        }
        else if (result == JOptionPane.OK_OPTION) {
              
            sqlUpdate="update INVENTORY set "+
                    "InvQuantity='"+itmquan.getText()+"',"+
                    "InvCondition='"+itmdesc.getText()+"' "+
                    "where "+
                    "InvItemName='"+ItmName+"' and "+
                    "InvQuantity='"+ItmQuan+"' and "+
                    "InvCondition='"+ItemDesc+"'";
            run=true;
        }
        if(run){
            try (Connection connection = DriverManager.getConnection(test);
                Statement stmt = connection.createStatement();) {
                stmt.executeUpdate(sqlUpdate);
                connection.close();
            }catch (Exception e) {
                warning("An error has occured! <br>"+e.getMessage());
            }
            finally{
                run=false;
                InvItmName.removeAllItems();
                InvItmName.setSelectedItem("");
                InvQuan.setText("");
                InvDesc.setText("");
                LoadTableInv("", "", "");
            }
        }
        run=false;
    }
    private void updateItem(){
        String 
        ItmName=this.ItmName.getSelectedItem().toString().trim(),
        ItmCateg=this.ItmCategory.getText().trim(),
        ItmDesc=this.ItmDesc.getText().trim(),
        ItmSRP=this.ItmSRP.getText().trim(),
        ItmUPrice=this.ItmUPrice.getText().trim();
        
        JTextField ITMName =new JTextField(ItmName);
            ITMName.setEditable(false);
            ITMName.setHorizontalAlignment(JTextField.CENTER);
        JTextField ITMCatg = new JTextField(ItmCateg);
            ITMCatg.setHorizontalAlignment(JTextField.CENTER);
        JTextArea ITMDesc = new JTextArea(ItmDesc,5,0);
            ITMDesc.setLineWrap(true);
        JTextField SRP = new JTextField(ItmSRP);
            SRP.setHorizontalAlignment(JTextField.CENTER);
        JTextField UPrice = new JTextField(ItmUPrice);
            UPrice.setHorizontalAlignment(JTextField.CENTER);
            
        Object[] message={
            "Item Name: ",ITMName,
            "SRP:", SRP,
            "Unit Price",UPrice,
            "Item Category: ",ITMCatg,
            "Item Description: ",ITMDesc
        };

        int result = JOptionPane.showConfirmDialog(this, message,
            "Update Item", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION&&!checkInt(SRP.getText(), "SRP!")&&
            !checkInt(UPrice.getText(), "Unit Price!")){
            CustFNamebx.setSelectedItem("");
            CustMNamebx.setSelectedItem("");
            CustLNamebx.setSelectedItem("");
            CustConNumbx.setText("");
            CustAddressbx.setText("");
            LoadTableCust("", "", "");
        }
        else if (result == JOptionPane.OK_OPTION) {
            String  
            sqlUpdate="update ITEM set "+
                    "ItmCategory='"+ITMCatg.getText().trim()+"', "+
                    "ItmDescription='"+ITMDesc.getText().trim()+"', "+
                    "ItmSRP="+SRP.getText().trim()+", "+
                    "ItmUnitPrice="+UPrice.getText().trim()+" "+
                    "where "+
                    "ItmName='"+ItmName+"' ";

            try (Connection connection = DriverManager.getConnection(test);
                Statement stmt = connection.createStatement();) {
                stmt.executeUpdate(sqlUpdate);
                connection.close();
            }catch (Exception e) {
                warning("An error has occured! <br>"+e.getMessage());
            }
            finally{
                CustFNamebx.setSelectedItem("");
                CustMNamebx.setSelectedItem("");
                CustLNamebx.setSelectedItem("");
                CustConNumbx.setText("");
                CustAddressbx.setText("");
                LoadTableCust("", "", "");
            }
        }
    }
    private void updateSupplier(){
        String 
        SupName=this.SupplierName.getSelectedItem().toString().trim(),
        SupConNum=this.SupplierConNum.getText().trim(),
        SuppAddress=this.SupplierAddress.getText().trim();
        
        JTextField supName = new JTextField(SupName);
            supName.setEditable(false);
            supName.setHorizontalAlignment(JTextField.CENTER);
        JTextField supConNum = new JTextField(SupConNum);
        JTextArea supAdd = new JTextArea(SuppAddress,5,0);
            supAdd.setLineWrap(true);
        Object[] message={
            "Supplier Name: ", supName,
            "Contact Number:", supConNum,
            "Address",supAdd
        };

        int result = JOptionPane.showConfirmDialog(this, message,
            "Update Item", JOptionPane.OK_CANCEL_OPTION);

        if(result == JOptionPane.OK_OPTION&&!checkInt(supConNum.getText(), "SRP!")){
            SupplierName.setSelectedItem("");
            SupplierAddress.setText("");
            SupplierConNum.setText("");
            LoadTableSup("", "", "");
        }
        else if (result == JOptionPane.OK_OPTION) {
            String  
            sqlUpdate="update SUPPLIER set "+
                    "SupName='"+supName.getText().trim()+"', "+
                    "SupContactNo='"+supConNum.getText().trim()+"', "+
                    "SupAddress="+supAdd.getText().trim()+" "+
                    "where "+
                    "SupName='"+SupName+"' ";

            try (Connection connection = DriverManager.getConnection(test);
                Statement stmt = connection.createStatement();) {
                stmt.executeUpdate(sqlUpdate);
                connection.close();
            }catch (Exception e) {
                warning("An error has occured! <br>"+e.getMessage());
            }
            finally{
                SupplierName.setSelectedItem("");
                SupplierAddress.setText("");
                SupplierConNum.setText("");
                LoadTableSup("", "", "");
            }
        }
    }

    private void deleteCust(){
        String  
        fname=CustFNamebx.getSelectedItem().toString(),
        mname=CustMNamebx.getSelectedItem().toString(),
        lname=CustLNamebx.getSelectedItem().toString(),
        contact=CustAddressbx.getText(),
        address=CustConNumbx.getText(),
        sqlDelete=  "delete from CUSTOMER "+
                    "where "+
                    "CFName='"+fname+"' and "+
                    "CMName='"+mname+"' and "+
                    "CLName='"+lname+"' and "+
                    "Address='"+contact+"' and "+
                    "ContactNo='"+address+"'";
        int delete = JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to delete CUSTOMER["+fname+" "+lname+"]?\n"+
            "",
            "Delete Customer", JOptionPane.OK_CANCEL_OPTION);
        if(delete==JOptionPane.OK_OPTION){
            try (Connection connection = DriverManager.getConnection(test);
                Statement stmt = connection.createStatement();) {
                stmt.executeUpdate(sqlDelete);
                connection.close();
            }catch (Exception e) {
                warning("An error has occured! <br>"+e.getMessage());
            }
            finally{
                RefreshTable();
            }
        }
        else RefreshTable();
    }
    private void deleteItem(){
        String
        itmname=ItmName.getSelectedItem().toString().trim(),
        sqlDelete="delete from ITEM "+
                    "where "+
                    "ItmName='"+itmname+"'";

        int delete = JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to delete ITEM["+itmname+"]? \n"+
            "",
            "Delete Customer", JOptionPane.OK_CANCEL_OPTION);
        if(delete==JOptionPane.OK_OPTION){
            try (Connection connection = DriverManager.getConnection(test);
                Statement stmt = connection.createStatement();) {
                stmt.executeUpdate(sqlDelete);
                connection.close();
            }catch (Exception e) {
                if(e.toString().equalsIgnoreCase("com.microsoft.sqlserver.jdbc.SQLServerException: The DELETE statement conflicted with the REFERENCE constraint \"FK__INVENTORY__InvIt__5CD6CB2B\". The conflict occurred in database \"INVENTORY_MANAGEMENT_SYS\", table \"dbo.INVENTORY\", column 'InvItemName'."))
                warning("Item cannot be deleted because it is referencing an intance in the INVENTORY table\n"+
                        "Delete the instances in INVENTORY table first!");
                else {
                    warning("An error has occured! <br>"+e.getMessage());
                }
            }
            finally{
                RefreshTable();
            }
        }
        else RefreshTable();
    }
    private void deleteSupplier(){
        String
        SupName=SupplierName.getSelectedItem().toString().trim(),
        sqlDelete="delete from Supplier "+
                    "where "+
                    "SupName='"+SupName+"'";

        int delete = JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to delete Supplier["+SupName+"]? \n"+
            "",
            "Delete Supplier", JOptionPane.OK_CANCEL_OPTION);
        if(delete==JOptionPane.OK_OPTION){
            try (Connection connection = DriverManager.getConnection(test);
                Statement stmt = connection.createStatement();) {
                stmt.executeUpdate(sqlDelete);
                connection.close();
            }catch (Exception e) {
                if(e.toString().equalsIgnoreCase("com.microsoft.sqlserver.jdbc.SQLServerException: The DELETE statement conflicted with the REFERENCE constraint \"FK__ITEM__ItmSupplie__3E52440B\". The conflict occurred in database \"INVENTORY_MANAGEMENT_SYS\", table \"dbo.ITEM\", column 'ItmSupplier'."))
                warning("Supplier cannot be deleted because it is referencing an intance in the ITEM table\n"+
                        "Delete the instances in ITEM table first!");
                else {
                    warning("An error has occured! <br>"+e.getMessage());
                }
            }
            finally{
                RefreshTable();
            }
        }
        else RefreshTable();
    }

    private DefaultTableModel buildTableModelCust(ResultSet rs)throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();
        //CashierCustomer.removeAll();

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
            if(!((String)vector.get(0)).isBlank()&&
                ((DefaultComboBoxModel<String>)CustFNamebx.getModel()).getIndexOf((String)vector.get(0))<0)
                    ((DefaultComboBoxModel<String>)
                    CustFNamebx.getModel()).addElement((String)vector.get(0));
            if(!((String)vector.get(1)).isBlank()&&
                ((DefaultComboBoxModel<String>)CustMNamebx.getModel()).getIndexOf((String)vector.get(1))<0)
                    ((DefaultComboBoxModel<String>)
                    CustMNamebx.getModel()).addElement((String)vector.get(1));
            if(!((String)vector.get(2)).isBlank()&&
                ((DefaultComboBoxModel<String>)CustLNamebx.getModel()).getIndexOf((String)vector.get(2))<0)
                    ((DefaultComboBoxModel<String>)
                    CustLNamebx.getModel()).addElement((String)vector.get(2));

            if(!((String)vector.get(0)).isBlank()&&!((String)vector.get(2)).isBlank()&&
                ((DefaultComboBoxModel<String>)CashierCustomer.getModel()).getIndexOf(
                    (String)vector.get(0)+" "+(String)vector.get(2))<0){
                        ((DefaultComboBoxModel<String>)
                        CashierCustomer.getModel()).addElement((String)vector.get(0)+" "+(String)vector.get(2));
            }
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
            if(!((String)vector.get(0)).isBlank()&&
                ((DefaultComboBoxModel<String>)InvItmName.getModel()).getIndexOf((String)vector.get(0))<0){
                    ((DefaultComboBoxModel<String>)InvItmName.getModel()).addElement((String)vector.get(0));
                    ((DefaultComboBoxModel<String>)CashierItemName.getModel()).addElement((String)vector.get(0));
                }
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
            if(!((String)vector.get(0)).isBlank()&&
                ((DefaultComboBoxModel<String>)ItmName.getModel()).getIndexOf((String)vector.get(0))<0)
                    ((DefaultComboBoxModel<String>)ItmName.getModel()).addElement((String)vector.get(0));

            if(!((String)vector.get(5)).isBlank()&&
                ((DefaultComboBoxModel<String>)ItmSupplier.getModel()).getIndexOf((String)vector.get(5))<0)
                    ((DefaultComboBoxModel<String>)ItmSupplier.getModel()).addElement((String)vector.get(5));
            data.add(vector);

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
    private DefaultTableModel buildTableModelSup(ResultSet rs)throws SQLException {

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
            if(!((String)vector.get(0)).isBlank()&&
                ((DefaultComboBoxModel<String>)SupplierName.getModel()).getIndexOf((String)vector.get(0))<0)
                    ((DefaultComboBoxModel<String>)SupplierName.getModel()).addElement((String)vector.get(0));
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames){
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            LoadTableItm("", "", "", "");
            LoadTableSup("", "", "");
            LoadEmployee();
        } catch (Exception e) {
            warning("An error has occured! <br>"+e.getMessage());
        }
        finally{
            CustFNamebx.setSelectedItem("");
            CustMNamebx.setSelectedItem("");
            CustLNamebx.setSelectedItem("");
            CustConNumbx.setText("");
            CustAddressbx.setText("");

            InvItmName.setSelectedItem("");
            InvDesc.setText("");
            InvQuan.setText("");

            ItmName.setSelectedItem("");
            ItmSupplier.setSelectedItem("");
            ItmCategory.setText("");
            ItmSRP.setText("");
            ItmUPrice.setText("");
            ItmDesc.setText("");

            SupplierName.setSelectedItem("");
            SupplierConNum.setText("");
            SupplierAddress.setText("");

            CashierItemName.setSelectedItem("");
            CashierCustomer.setSelectedItem("");
            CashierEmployee.setSelectedItem("");
            CashierTotal.setText("");
            CashierQuantity.setText("");
            CashierPrice.setText("");
            CashierStock.setText("");
        }
    }
    private void LoadTableCust(String cfname, String cmname, String clname){
        String 
        SQLCommand="select CFName as 'First Name',"+
        "CMName as 'Middle Name',"+
        "CLName as 'Last Name', Address, ContactNo as 'Contact #' from CUSTOMER ";
        cfname=cfname.trim();
        cmname=cmname.trim();
        clname=clname.trim();
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
            warning("An error has occured! <br>"+e.getMessage());
        }
    }
    private void LoadTableInv(String InvItemName, String InvQuantity, String InvDescription){
        String 
        SQLCommand="select "+
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
            warning("An error has occured! <br>"+e.getMessage());
        }
    }
    private void LoadTableItm(String ItmName, String ItmCategory, String ItmDesc, String ItmSupplier){
        String 
        SQLCommand="select "+
        "ItmName as 'Item Name',"+
        "ItmCategory as 'Item Category',"+
        " ItmDescription as 'Item Description',"+
        "ItmSRP as 'Suggested Retail Price',"+
        "ItmUnitPrice as 'Unit Price',"+
        "ItmSupplier as 'Supplier' from ITEM ";       
        try (Connection connection = DriverManager.getConnection(test);
            Statement stmt = connection.createStatement();) {

            if(!ItmName.isBlank()||!ItmCategory.isBlank()||
                !ItmDesc.isBlank()||!ItmSupplier.isBlank()){
                SQLCommand= SQLCommand+" where ";

                if(!ItmName.isBlank()) SQLCommand = SQLCommand+" ItmName like '%"+ItmName+"%' ";
                
                if(!ItmName.isBlank()&&!ItmSupplier.isBlank()) SQLCommand = SQLCommand+" and ItmSupplier like '%"+ItmSupplier+"%' ";
                else if(!ItmSupplier.isBlank()) SQLCommand = SQLCommand+" ItmSupplier like '%"+ItmSupplier+"%' ";
    
                if(!ItmCategory.isBlank()&&!ItmName.isBlank()||!ItmSupplier.isBlank()) SQLCommand = SQLCommand+" and ItmCategory like '%"+ItmCategory+"%' ";
                else if(!ItmCategory.isBlank()) SQLCommand = SQLCommand+" InvCondition like '%"+ItmCategory+"% '";

                if(!ItmDesc.isBlank()&&!ItmName.isBlank()||!ItmSupplier.isBlank()||!ItmCategory.isBlank())SQLCommand = SQLCommand+" and ItmDescription like '%"+ItmDesc+"%' ";
                else if(!ItmDesc.isBlank())SQLCommand = SQLCommand+" ItmDescription like '%"+ItmDesc+"%' ";

            }
            ResultSet x = stmt.executeQuery(SQLCommand);
            ItmTable.setModel(buildTableModelItm(x));
            connection.close();
        }catch (Exception e) {
            warning("An error has occured! <br>"+e.getMessage());
        }
    }
    private void LoadTableSup(String SupName, String ConNum, String Address){
        String 
        SQLCommand="select "+
        "SupName as 'Supplier Name',"+
        "SupContactNo as 'Contact Number', SupAddress as 'Supplier Address' from SUPPLIER ";
        SupName=SupName.trim();  
        ConNum=ConNum.trim();
        Address=Address.trim(); 
        try (Connection connection = DriverManager.getConnection(test);
            Statement stmt = connection.createStatement();) {

            if(!SupName.isBlank()||
                    !Address.isBlank()||
                    !ConNum.isBlank()){

                SQLCommand= SQLCommand+" where ";

                if(!SupName.isBlank()) 
                SQLCommand = SQLCommand+" SupName like '%"+SupName.trim()+"%' ";
                
                if(!Address.isBlank()&&!SupName.isBlank()) 
                SQLCommand = SQLCommand+" and SupAddress like '%"+Address+"%' ";
                else if(!SupplierAddress.getText().trim().isBlank()) 
                SQLCommand = SQLCommand+" SupAddress like '%"+Address+"%' ";
    
                if(!ConNum.isBlank()&&!SupName.isBlank()||!Address.isBlank())
                SQLCommand = SQLCommand+" and SupContactNo like '%"+ConNum+"%' ";
                else if(!ConNum.isBlank())
                SQLCommand = SQLCommand+" SupContactNo like '%"+ConNum+"% '";
            }
            ResultSet x = stmt.executeQuery(SQLCommand);
            SupplierTable.setModel(buildTableModelSup(x));
            connection.close();
        }catch (Exception e) {
            warning("An error has occured! <br>"+e.getMessage());
        }
    }
    private void LoadEmployee(){
        String
        SQLCommand="select EmpFName +' '+EmpLName from EMPLOYEE";
        try (Connection connection = DriverManager.getConnection(test);
            Statement stmt = connection.createStatement();) {
            ResultSet x = stmt.executeQuery(SQLCommand);

            while (x.next()) {
                CashierEmployee.addItem(x.getString(1));
            }
            connection.close();
        }catch (Exception e) {
            warning("An error has occured! <br>"+e.getMessage());
        }
        finally{
            CashierEmployee.setSelectedItem("");
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | 
                javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Frame2();
        });
    }
    
    private double invcTotal=0;
    private String test =   "jdbc:sqlserver://"+
                            "localhost:1433;"+
                            "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                            "integratedSecurity=true";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CashierClearOrders;
    private javax.swing.JComboBox<String> CashierCustomer;
    private javax.swing.JComboBox<String> CashierEmployee;
    private javax.swing.JComboBox<String> CashierItemName;
    private javax.swing.JButton CashierItmLoad;
    private javax.swing.JPanel CashierPane;
    private javax.swing.JPanel CashierPanel;
    private javax.swing.JTextField CashierPrice;
    private javax.swing.JFormattedTextField CashierQuantity;
    private javax.swing.JButton CashierSavePrint;
    private javax.swing.JTextField CashierStock;
    private javax.swing.JTable CashierTable;
    private javax.swing.JPanel CashierTablePane;
    private javax.swing.JTextField CashierTotal;
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
    private javax.swing.JComboBox<String> InvItmName;
    private javax.swing.JTextField InvQuan;
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
    private javax.swing.JButton PunchOrder;
    private javax.swing.JTextArea SupplierAddress;
    private javax.swing.JTextField SupplierConNum;
    private javax.swing.JButton SupplierDelete;
    private javax.swing.JComboBox<String> SupplierName;
    private javax.swing.JPanel SupplierPanel;
    private javax.swing.JButton SupplierRefresh;
    private javax.swing.JButton SupplierSearch;
    private javax.swing.JTable SupplierTable;
    private javax.swing.JButton SupplierUpdate;
    private javax.swing.JButton custDelete;
    private javax.swing.JButton custRefresh;
    private javax.swing.JButton custUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
