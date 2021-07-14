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
    import java.sql.*;
    import javax.swing.*;
    import java.awt.*;
    import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
public class NewItem extends javax.swing.JDialog implements warn{
    public NewItem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            initComponents();
            this.getContentPane().setBackground(Color.decode("#fff8dc".toUpperCase()));
            loadCbx();
        } catch (Exception e) {
            warning("An error has occured! <br>"+e.getMessage());
        } finally{
            AutoCompleteDecorator.decorate(supplierComboBx);
        }
    } 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ItmNamebx = new javax.swing.JTextField();
        ItmCategorybx = new javax.swing.JTextField();
        ItmSRPbx = new javax.swing.JTextField();
        ItmUnitPricebx = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItmDescbx = new javax.swing.JTextArea();
        supplierComboBx = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 248, 220));

        jLabel1.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NEW ITEM");

        jLabel2.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Item Name");

        jLabel3.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Category");

        jLabel4.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SRP");

        jLabel5.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Description");

        jLabel6.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Supplier");

        jLabel7.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Unit Price");

        jPanel2.setBackground(new java.awt.Color(255, 248, 220));

        ItmNamebx.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        ItmNamebx.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ItmCategorybx.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        ItmCategorybx.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ItmSRPbx.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        ItmSRPbx.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ItmUnitPricebx.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        ItmUnitPricebx.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ItmDescbx.setColumns(20);
        ItmDescbx.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        ItmDescbx.setLineWrap(true);
        ItmDescbx.setRows(5);
        ItmDescbx.setWrapStyleWord(true);
        ItmDescbx.setMinimumSize(new java.awt.Dimension(273, 94));
        ItmDescbx.setPreferredSize(new java.awt.Dimension(273, 96));
        jScrollPane1.setViewportView(ItmDescbx);

        supplierComboBx.setEditable(true);
        supplierComboBx.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        supplierComboBx.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(supplierComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItmCategorybx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItmNamebx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(ItmSRPbx, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ItmUnitPricebx, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ItmNamebx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ItmCategorybx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ItmSRPbx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ItmUnitPricebx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supplierComboBx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jButton1.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jButton1.setText("Register New Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void warning(String ErrorMessage){
        Object[] yy = {"OK"};
        JOptionPane.showOptionDialog(
                this, 
                "<html><body><p style='width: 300px;'>"+ErrorMessage+" </p></body></html>", 
                this.getTitle(), 
                JOptionPane.OK_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                new ImageIcon(getClass().getResource("/resources/warnico.png")),
                yy,yy[0]);
    }
    public void success(String Message){
        Object[] yy = {"Noice"};
        JOptionPane.showOptionDialog(
                this, 
                "<html><body><p style='font-family:Product Sans Regular;font-size:12px'>"+Message+" </p></body></html>", 
                "Inventory Management System: Success!", 
                JOptionPane.OK_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                new ImageIcon(getClass().getResource("/resources/woggy_wineWink.gif")),
                yy,yy[0]);
    }
    public int caution(String Message){
        Object[] yy = {"Ok"};
        return JOptionPane.showOptionDialog(
                this, 
                "<html><body><p style='width: 250px; font-family:Product Sans Regular;font-size:12px'>"+Message+" </p></body></html>", 
                "Inventory Management System: Caution!", 
                JOptionPane.OK_OPTION, 
                JOptionPane.WARNING_MESSAGE,
                new ImageIcon(getClass().getResource("/resources/woggy_hmm.gif")),
                yy,yy[0]);
    }
    private boolean checkPeso(String x,String Money){
        boolean check=true;
        try {
            Double.parseDouble(x.replaceAll("[^0-9]",""));
            check=true;
        } catch (Exception e) {
            warning("An error has occurred!<br><br>Please enter a proper amount of "+Money);
            check=false;
        }
        return check;
    }
    private void loadCbx(){
        String  
        sqlCombo="select SupName from SUPPLIER";
        try (Connection connection = DriverManager.getConnection(test);
            Statement stmt = connection.createStatement();) {
            ResultSet x = stmt.executeQuery(sqlCombo);
            while(x.next())
                supplierComboBx.addItem(x.getString("SupName"));
            connection.close();
        }
        catch (SQLException e) {
            warning("An error has occured! <br>"+e.getMessage());
        }
        finally{
            supplierComboBx.setSelectedItem("");
        }
    }
    private void Save(){
        if( !ItmNamebx.getText().trim().isBlank()&&
            !ItmCategorybx.getText().trim().isBlank()&&
            !ItmDescbx.getText().trim().isBlank()&&
            !ItmSRPbx.getText().trim().isBlank()&&
            !ItmUnitPricebx.getText().trim().isBlank()&&
            !supplierComboBx.getSelectedItem().toString().trim().isBlank()&&
            checkPeso(ItmSRPbx.getText().replaceAll("[^0-9]", ""), "SRP!")&&
            checkPeso(ItmUnitPricebx.getText().replaceAll("[^0-9]", ""), "Unit Price!")&&
            caution("Are you sure that you want to register:<br>"+ItmNamebx.getText().trim())==0){
            String 
            sqlcommand = "insert into ITEM "+
                        "values ('"+ItmNamebx.getText().trim().toUpperCase()+
                        "','"+ItmCategorybx.getText().trim().toUpperCase()+
                        "','"+ItmDescbx.getText().trim().toUpperCase()+
                        "',"+ItmSRPbx.getText().replaceAll("[^0-9]", "")+
                        ","+ItmUnitPricebx.getText().replaceAll("[^0-9]", "")+
                        ",'"+supplierComboBx.getSelectedItem().toString().trim()
                        +"'); insert into INVENTORY(InvItemName,InvQuantity,InvCondition)values "+
                        "('"+ItmNamebx.getText().trim().toUpperCase()+
                        "',1,'GOOD')",
            sqlcheck=   "select ItmName from ITEM";
            boolean check=false;  
            try (Connection connection = DriverManager.getConnection(test);
                    Statement stmt = connection.createStatement();) {
                    
                    ResultSet x = stmt.executeQuery(sqlcheck);
                    while(x.next()){
                        if(ItmNamebx.getText().equalsIgnoreCase(x.getString("ItmName"))){
                            warning(ItmNamebx.getText()+", already exist!\n"+
                            "Please enter a different Item!!!");
                            ItmNamebx.setText(null);
                            ItmCategorybx.setText(null);
                            ItmDescbx.setText(null);
                            ItmSRPbx.setText(null);
                            ItmUnitPricebx.setText(null);
                            check=true;
                            break;
                        }
                    }
                    if(!check){
                        stmt.executeUpdate(sqlcommand);
                        success("Item: "+ItmNamebx.getText().trim().toUpperCase()+", is saved!");
                        connection.close();
                        this.dispose();
                    }
            }
            catch (SQLException e) {
                e.printStackTrace();
                warning("An error has occured!<br><br>"+e.getMessage());
            }
            finally{
                check=false;
            }
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Save();
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewItem dialog = new NewItem(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setTitle("Inventory Management System: New Item");
                dialog.setVisible(true);
            }
        });
    }
    private String test =   "jdbc:sqlserver://"+
                            "localhost:1433;"+
                            "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                            "integratedSecurity=true";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ItmCategorybx;
    private javax.swing.JTextArea ItmDescbx;
    private javax.swing.JTextField ItmNamebx;
    private javax.swing.JTextField ItmSRPbx;
    private javax.swing.JTextField ItmUnitPricebx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JComboBox<String> supplierComboBx;
    // End of variables declaration//GEN-END:variables
}
