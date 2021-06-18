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
        //components settings
        setSize(400,300);
        setTitle("Java Project");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new Frame1().setVisible(true);
    }
}
