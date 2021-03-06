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
    import java.util.ArrayList;
    import javax.imageio.ImageIO;
    import javax.swing.*;
    import java.awt.*;
public class NewSupplier extends javax.swing.JDialog implements warn{
    public NewSupplier(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {          
            initComponents();
            ArrayList<java.awt.Image> ico = new ArrayList<>();
            ico.add(ImageIO.read(new java.net.URL(getClass().getResource("/resources/icons/20x20.png").toString())));
            ico.add(ImageIO.read(new java.net.URL(getClass().getResource("/resources/icons/40x40.png").toString())));
            setIconImages(ico);
            this.getContentPane().setBackground(Color.decode("#fff8dc".toUpperCase()));
        } catch (Exception e) {
            warning("An error has occured! <br>"+e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SupName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SupConNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SupAddress = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 220));

        jLabel1.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NEW SUPPLIER");

        jLabel2.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Supplier Name");

        SupName.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        SupName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contact Number");

        SupConNum.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        SupConNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address");

        SupAddress.setColumns(20);
        SupAddress.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        SupAddress.setLineWrap(true);
        SupAddress.setRows(5);
        SupAddress.setWrapStyleWord(true);
        jScrollPane2.setViewportView(SupAddress);

        jButton2.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jButton1.setText("Register Supplier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SupConNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(SupName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupConNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
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
    private boolean checkConNum(String x){
        boolean check=true;
        try {
            Double.parseDouble(x);
            check=true;
        } catch (Exception e) {
            warning("An error has occurred!<br><br>Please enter a proper Contact Number then try again!");
            check=false;
        }
        return check;
    }
    private void Save(){
        if( !SupName.getText().trim().isBlank()&&
            !SupConNum.getText().trim().isBlank()&&
            !SupAddress.getText().trim().isBlank()&&
            checkConNum(SupConNum.getText())&&
            SupConNum.getText().replaceAll("[^0-9]", "").length()==11&&
            caution("Are you sure that you want to register:<br>"+SupName.getText().trim())==0){
            String  
            sqlcommand = "insert into SUPPLIER "+
                        "values ('"+SupName.getText().toUpperCase().trim()+
                        "','"+SupConNum.getText().replaceAll("[^0-9]", "").trim()+
                        "','"+SupAddress.getText().toUpperCase().trim()+"')",
            sqlcheck=   "select SupName from supplier";
            boolean check=false;   
                        
            try (Connection connection = DriverManager.getConnection(test);
                Statement stmt = connection.createStatement();) {
                ResultSet x = stmt.executeQuery(sqlcheck);
                while(x.next()){
                    if(SupName.getText().equalsIgnoreCase(x.getString("SupName"))){
                        warning(SupName.getText()+", already exist!\n"+
                        "Please enter a different Supplier!!!");
                        check=true;
                        SupName.setText(null);
                        SupConNum.setText(null);
                        SupAddress.setText(null);
                        break;
                    }
                }
                if(!check){
                    stmt.executeUpdate(sqlcommand);
                    success("New Supplier Saved!");
                    connection.close();
                    this.dispose();
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
                if(e.toString().equalsIgnoreCase("com.microsoft.sqlserver.jdbc.SQLServerException: Violation of PRIMARY KEY constraint 'PK__SUPPLIER__C13D2C4BB5FC0573'. Cannot insert duplicate key in object 'dbo.SUPPLIER'. The duplicate key value is (OK).")){
                    String x=SupName.getText()+", already exist!\n"+
                    "Please enter a different Supplier!!!";
                    warning(x);
                }
            }
            finally{
                check=false;
            }
        } 
        else if(SupConNum.getText().replaceAll("[^0-9]", "").length()!=11){
            warning("An error has occurred!<br><br>Please enter a proper Contact Number then try again!");
        }
    }
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
            java.util.logging.Logger.getLogger(NewSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewSupplier dialog = new NewSupplier(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setTitle("Inventory Management System: New Supplier");
                dialog.setVisible(true);
            }
        });
    }
    private String test =   "jdbc:sqlserver://"+
                            "localhost:1433;"+
                            "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                            "integratedSecurity=true";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea SupAddress;
    private javax.swing.JTextField SupConNum;
    private javax.swing.JTextField SupName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
