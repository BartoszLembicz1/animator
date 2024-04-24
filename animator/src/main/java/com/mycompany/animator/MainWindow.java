package com.mycompany.animator;
import java.awt.*; 
import javax.swing.*;

public class MainWindow {
    
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem exitMenuItem;
    
    public MainWindow(){
        initialize();
    }
    
    public void initialize(){
        frame = new JFrame();
        frame.setTitle("Animator");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(2560, 1440);
        frame.setLocationRelativeTo(null);
        
        
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10 , 10));
        
        bottomPanel.setBackground(Color.gray);
        bottomPanel.setPreferredSize(new Dimension(400, 400));
        
        for(int i = 0; i <= 5; i++){
            JButton button = new JButton("Frame " + Integer.toString(i));
            bottomPanel.add(button);
        }
        
        frame.add(bottomPanel, BorderLayout.SOUTH);
        
        //Menu Item
        Font f = new Font("sans-serif", Font.PLAIN, 18);
        UIManager.put("Menu.font", f);
        UIManager.put("MenuItem.font", f);
        UIManager.put("Menu.font", f);
        UIManager.put("CheckBoxMenuItem.font", f);
        UIManager.put("RadioButtonMenuItem.font", f);
        
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newMenuItem = new JMenuItem("New...");
        saveMenuItem = new JMenuItem("save");
        exitMenuItem = new JMenuItem("exit");
        
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        
        this.frame.setVisible(true);
    }
    
}
