package com.rhonstratos.java;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        JTextArea xxx = new JTextArea(null,5,0);
        JScrollPane jScrollPane1 = new JScrollPane();
        xxx.setLineWrap(true);
        jScrollPane1.setViewportView(xxx);
        Object[] message={
            "Input value 1:", new JTextField(),
            "Input value 2:", new JTextField(),
            "Input value 3:", new JTextField(),
            "Input value 4:", new JTextField(),
            "Input value 5:", xxx
        };

        int result = JOptionPane.showConfirmDialog(null, message,
            "Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
        }
    }
    
}
