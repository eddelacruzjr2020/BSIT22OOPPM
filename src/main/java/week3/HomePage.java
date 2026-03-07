/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class HomePage extends JFrame implements ActionListener{
    
    private JLabel lblHomePage;
    private JButton btnWelcome, btnLogin;
    
    HomePage(){
        setSize(400, 400);
        setName("Home Page");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHomePage = new JLabel("Home Page");
        lblHomePage.setBounds(150, 100, 100, 30);
        add(lblHomePage);
        
        btnWelcome = new JButton("Welcome");
        btnWelcome.setBounds(80, 200, 80, 30);
        add(btnWelcome);
        
        btnLogin = new JButton("Login");
        btnLogin.setBounds(240, 200, 80, 30);
        add(btnLogin);
        
        //Add to Action Listener
        btnWelcome.addActionListener(this);
        btnLogin.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource() == btnWelcome){
            WelcomePage wp = new WelcomePage();
            wp.setVisible(true);
        }else if(e.getSource() == btnLogin){
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
        }
        
    }
    
}
