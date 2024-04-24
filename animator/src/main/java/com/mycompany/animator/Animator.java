package com.mycompany.animator;

import javax.swing.SwingUtilities;


public class Animator {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                MainWindow main = new MainWindow();
            }
        });
    }
}
