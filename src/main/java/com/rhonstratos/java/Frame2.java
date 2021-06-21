package com.rhonstratos.java;

    import javax.swing.*;
    import javax.swing.border.*;
    import java.awt.*;

public class Frame2 extends JFrame {

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
        Load();
    }
}
