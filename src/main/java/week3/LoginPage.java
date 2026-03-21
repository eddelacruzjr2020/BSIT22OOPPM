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
public class LoginPage extends JFrame implements ActionListener{
    
    private JLabel lblLoginPage;
    private JButton btnWelcome, btnHome;
    
    LoginPage(){
        setSize(400, 400);
        setName("Login Page");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblLoginPage = new JLabel("Login Page");
        lblLoginPage.setBounds(150, 100, 100, 30);
        add(lblLoginPage);
        
        btnWelcome = new JButton("Welcome");
        btnWelcome.setBounds(80, 200, 80, 30);
        add(btnWelcome);
        
        btnHome = new JButton("Home");
        btnHome.setBounds(240, 200, 80, 30);
        add(btnHome);
        
        //Add to Action Listener
        btnWelcome.addActionListener(this);
        btnHome.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource() == btnWelcome){
            WelcomePage wp = new WelcomePage();
            wp.setVisible(true);
        }else if(e.getSource() == btnHome){
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }
        
    }
    
}
