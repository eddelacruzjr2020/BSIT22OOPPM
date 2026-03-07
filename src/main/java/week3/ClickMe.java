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
public class ClickMe extends JFrame implements ActionListener{
    
    private JLabel lblClickMe;
    private JButton btnClickMe, btnReset;
    private int count;
    
    
    ClickMe(){
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblClickMe = new JLabel("Counter count is: "+count);
        lblClickMe.setBounds(100, 60, 150, 30);
        add(lblClickMe);
        
        btnClickMe = new JButton("Click Me!!!");
        btnClickMe.setBounds(100, 120, 100, 30);
        add(btnClickMe);
        
        btnReset = new JButton("Reset");
        btnReset.setBounds(100, 180, 100, 30);
        add(btnReset);
        
        //Adding to Action Listener
        btnClickMe.addActionListener(this);
        btnReset.addActionListener(this);

    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnClickMe){
            count++;
            lblClickMe.setText("Counter count is: "+count);
        }else if(e.getSource() == btnReset){
            count = 0;
            lblClickMe.setText("Counter count is: "+count);
        }
        
    }
    
}
