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
public class Calculator extends JFrame implements ActionListener{
    private JLabel lblCalculator, lblSum;
    private JTextField txtFirstNum, txtSecondNum;
    private JButton btnCalculate;
    
    
    Calculator(){
        
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblCalculator = new JLabel("Calculator");
        lblCalculator.setBounds(50, 50, 150, 30);
        add(lblCalculator);
        
        txtFirstNum = new JTextField("0");
        txtFirstNum.setBounds(50, 100, 80, 30);
        add(txtFirstNum);
        
        txtSecondNum = new JTextField("0");
        txtSecondNum.setBounds(180, 100, 80, 30);
        add(txtSecondNum);
        
        lblSum = new JLabel("0");
        lblSum.setBounds(290, 100, 80, 30);
        add(lblSum);
        
        btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(100, 250, 150, 30);
        add(btnCalculate);
        
        btnCalculate.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {

            String first = txtFirstNum.getText().trim();
            String second = txtSecondNum.getText().trim();

            if (first.matches("\\d+") && second.matches("\\d+")) {
                int sum = Integer.parseInt(first) + Integer.parseInt(second);
                lblSum.setText(String.valueOf(sum));
            }else{
                JOptionPane.showMessageDialog(this, "Only integers are allowed.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            
        }
    }
    
}
