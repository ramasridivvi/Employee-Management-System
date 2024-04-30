package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class startpage extends JFrame implements ActionListener {
    
    startpage() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(200, 100, 1150, 700);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO VIEW OPTIONS");
        clickhere.setBounds(200, 400, 300, 50);
        clickhere.setBackground(Color.black);
        clickhere.setForeground(Color.white);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        
        setSize(1170, 650);
        setLocation(200, 50);
        setVisible(true);
        
        while(true) {
            clickhere.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
            
            clickhere.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new loginpage();
    }
    
    public static void main(String args[]) {
        new startpage();
    }
}
