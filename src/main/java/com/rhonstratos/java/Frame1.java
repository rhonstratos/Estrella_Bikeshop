package com.rhonstratos.java;

    import javax.swing.*;
    import javax.swing.border.*;
    import java.awt.*;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;

public class Frame1 extends JFrame{
    private JLabel user, pass,titleApp;
    private JTextArea userr;
    private JPasswordField passw;
    private JButton login;
    private JPanel panel1,panel2;
    private Container s;
    private Border line;

    Frame1(){
        Load();
    }

    private void Login(){
            // Connect to your database.
            ResultSet resultSet = null;
            String test =   "jdbc:sqlserver://"+
                            "localhost:1433;"+
                            "databaseName=JavaProject;"+
                            "user=root;"+
                            "password=eykha6068";
                            
            try (Connection connection = DriverManager.getConnection(test);
                 Statement stmt = connection.createStatement();) {

                    // Create and execute a SELECT SQL statement.
                    String selectSql = "SELECT * from LOGIN";
                    resultSet = stmt.executeQuery(selectSql);
        
                    // Print results from select statement
                    resultSet.next();
                    if(!this.userr.getText().equals(resultSet.getString(1)) &&
                       !this.passw.getPassword().toString().equals(resultSet.getString(2)))
                        JOptionPane.showMessageDialog(
                            null, 
                            "Username or Password is Incorrect!!!\nPlease try again...", 
                            "Java Project", 
                            JOptionPane.YES_NO_OPTION);
                    else{
                        //do something
                        JOptionPane.showMessageDialog(
                            null, 
                            "Done!", 
                            "Java Project", 
                            JOptionPane.OK_OPTION);
                    }
                    connection.close();
            }
            catch (SQLException e) {
                //e.printStackTrace();

                JOptionPane.showMessageDialog(
                null, 
                e, 
                "Java Project", 
                JOptionPane.YES_NO_OPTION);
            }
            finally{
                resultSet=null;
                this.userr.setText("");
                this.passw.setText("");
            }
    }

    void Load(){
        //init
        s = getContentPane();
        line = BorderFactory.createLineBorder(Color.black);

        panel1 = new JPanel();
        panel2 = new JPanel();

        user = new JLabel();
        pass = new JLabel();
        titleApp = new JLabel("",JLabel.CENTER);

        userr = new JTextArea();
        passw = new JPasswordField();

        login = new JButton();

        //components settings

        panel1.setBounds(0, 0, 927, 720);
        panel1.setBorder(line);
        panel1.setBackground(Color.red);

        panel2.setBounds(925, 0, 400, 720);
        panel2.setBorder(line);
        panel2.setLayout(null);

        titleApp.setBounds(0, 30, 340, 45);
        titleApp.setText("App Tittle");

        user.setText("Enter your Username:");
        user.setBounds(11, 233, 125, 20);

        pass.setText("Enter your Password:");
        pass.setBounds(11, 329, 125, 20);

        userr.setBounds(30, 260, 280, 40);
        passw.setBounds(30, 360, 280, 40);

        login.setText("Login");
        login.setBounds(190, 430, 120, 56);
        
        login.addActionListener(e->{    Login();    });

        //FInalization
        
        setSize(1280,720);
        setLayout(null);
        setResizable(false);
        setTitle("Java Project");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        panel2.add(user);
        panel2.add(userr);
        panel2.add(pass);
        panel2.add(passw);
        panel2.add(login);
        panel2.add(titleApp);
        s.add(panel2,BorderLayout.EAST);
        s.add(panel1,BorderLayout.WEST);
    }
    public static void main(String[] args) {
        new Frame1().setVisible(true);
    }
}
