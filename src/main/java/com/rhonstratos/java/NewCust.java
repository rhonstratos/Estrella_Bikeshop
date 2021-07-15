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
    import java.awt.*;
    import javax.imageio.ImageIO;
    import javax.swing.*;
public class NewCust extends javax.swing.JDialog implements warn {
    public NewCust(java.awt.Frame parent, boolean modal) {
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
        }finally{
            
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CFName = new javax.swing.JTextField();
        CLName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CConNum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CAddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inventory Management System: New Customer");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 248, 220));
        setModal(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 248, 220));

        jLabel1.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NEW CUSTOMER");

        jLabel2.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("First Name");

        CFName.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        CFName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        CLName.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        CLName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Last Name");

        jLabel5.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contact Number");

        CConNum.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        CConNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        CAddress.setColumns(20);
        CAddress.setFont(new Font("Product Sans Regular",Font.PLAIN, 16));
        CAddress.setLineWrap(true);
        CAddress.setRows(5);
        CAddress.setWrapStyleWord(true);
        jScrollPane1.setViewportView(CAddress);

        jLabel6.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address");

        jButton1.setFont(new Font("Product Sans Bold Italic",Font.PLAIN, 16));
        jButton1.setText("Register Customer");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CFName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CLName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(CConNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
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
                    .addComponent(CFName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CConNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Save();
    }                                           
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
    
    private boolean checkInt(String x,String Money){
        boolean check=true;
        try {
            Double.parseDouble(x.replaceAll("[^0-9]",""));
            check=true;
        } catch (Exception e) {
            warning("An error has occurred!<br><br>Please enter a proper "+Money);
            check=false;
        }
        return check;
    }
    private void Save(){
        String  fname=CFName.getText().toUpperCase().trim(),
                lname=CLName.getText().toUpperCase().trim(),
                address=CAddress.getText().toUpperCase().trim(),
                contactnum=CConNum.getText().replaceAll("[^0-9]", "");
        String 
        sqlcommand = "insert into CUSTOMER(CFName,CLName,Address,ContactNo) "+
                    "values ('"+fname+"','"+lname+ "','"+address+"','"+contactnum+"')",
        sqlcheck=   "select CFName , CLName from CUSTOMER order by CFName asc";
        boolean check=false;   
        if( !fname.isBlank()&&!lname.isBlank()&&
            checkInt(contactnum,"Contact Nulber [11 digits] and try again!")&&
            contactnum.length()==11 &&
            caution("Are you sure that you want to register:<br>"+fname+" "+lname+"?")==0){
            try (Connection connection = DriverManager.getConnection(test);
                Statement stmt = connection.createStatement();) {
                
                ResultSet x = stmt.executeQuery(sqlcheck);
                System.out.println("pass1");
                while(x.next()){
                    if( fname.equalsIgnoreCase(x.getString("CFName"))&&
                        lname.equalsIgnoreCase(x.getString("CLName"))){
                        warning(fname+" "+lname+", already exist!\n"+
                                "Please enter a different Customer!!!");
                        check=true;
                        CFName.setText(null);
                        CLName.setText(null);
                        CAddress.setText(null);
                        CConNum.setText(null);
                        break;
                    }
                }
                if(!check){
                    stmt.executeUpdate(sqlcommand);
                    success("New customer: "+fname+" "+lname+", saved!");
                    connection.close();
                    this.dispose();
                }
            }
            catch (SQLException e) {
                e.printStackTrace();
                warning("An error has occured! <br>"+e.getMessage());
            }
            finally{
                check=false;
                this.dispose();
            }
        }
        else if (CConNum.getText().replaceAll("[^0-9]", "").length()!=11){
            warning("An error has occurred!<br><br>Please enter a proper "+
                "Contact Nulber [11 digits] and try again!");
            CConNum.setText("");
        }
    }
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            NewCust dialog = new NewCust(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    dialog.dispose();
                }
            });
            dialog.setTitle("Inventory Management System: New Customer");
            dialog.setVisible(true);
        });
    }
    private String test =   "jdbc:sqlserver://"+
                            "localhost:1433;"+
                            "databaseName=INVENTORY_MANAGEMENT_SYS;"+
                            "integratedSecurity=true";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CAddress;
    private javax.swing.JTextField CConNum;
    private javax.swing.JTextField CFName;
    private javax.swing.JTextField CLName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
