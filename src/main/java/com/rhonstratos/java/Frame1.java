package com.rhonstratos.java;

import javax.swing.*;
import java.awt.*;

public class Frame1 extends JFrame{

    Frame1(){
        Load();
    }

    JLabel user, pass;
    JTextArea userr, passw;

    void Load(){
        //init
        user = new JLabel();
        pass = new JLabel();

        userr = new JTextArea();
        passw = new JTextArea();

        
        //components settings
        user.setText("rhonstratos");
        pass.setText("adminadmin");

        userr.setText("Enter Username:");
            userr.setBounds(0,0,0,0);
        passw.setText("Enter Password:");
            passw.setBounds(0,0,0,0);

        setSize(400,300);
        setTitle("Java Project");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new Frame1().setVisible(true);
    }
}
