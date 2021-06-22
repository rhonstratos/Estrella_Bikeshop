package com.rhonstratos.java;

    import javax.swing.*;
    //import javax.swing.border.*;
    //import java.awt.*;

public class Frame2 extends JFrame {

    private void warn(String y){
        final JDialog xx = new JDialog();
        xx.setAlwaysOnTop(true);    
        JOptionPane.showMessageDialog(
            null, 
            y, 
            "Alert", 
            JOptionPane.YES_NO_OPTION);
        xx.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
        xx.setAlwaysOnTop(true);
        xx.setVisible(true);
    }


    private void Load(){
        //init

        //components settings

        //Finalization
        setSize(1280,720);
        setLayout(null);
        setResizable(false);
        setTitle("App Title");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(false);
    }
    Frame2(){
        try {
            Load();
        } catch (Exception e) {
            warn(e.toString());
        }
    }
}
