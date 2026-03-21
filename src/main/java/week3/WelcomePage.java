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
public class WelcomePage extends JFrame implements ActionListener{
    
    private JLabel lblWelcomePage;
    private JButton btnLogin, btnHome;
    
    WelcomePage(){
        setSize(400, 400);
        setName("Welcome Page");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblWelcomePage = new JLabel("Welcome Page");
        lblWelcomePage.setBounds(150, 100, 100, 30);
        add(lblWelcomePage);
        
        btnLogin = new JButton("Login");
        btnLogin.setBounds(80, 200, 80, 30);
        add(btnLogin);
        
        btnHome = new JButton("Home");
        btnHome.setBounds(240, 200, 80, 30);
        add(btnHome);
        
        //Add to Action Listener
        btnLogin.addActionListener(this);
        btnHome.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource() == btnLogin){
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
        }else if(e.getSource() == btnHome){
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }
        
    }
    
}
