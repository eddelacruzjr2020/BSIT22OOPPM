/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Rectangle extends JFrame implements ActionListener{
    
    private JLabel lblHeader, lblLenght, lblWidth, lblRectangleFormula, lblRectanglePerimeter;
    private JButton btnHome, btnSquare, btnTriangle, btnCircle, btnCalculate;
    private JTextField txtLegnth, txtWidth;
    private int perimeter;
    
    Rectangle(){
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHeader = new JLabel("Rectangle Perimeter", SwingConstants.CENTER);
        lblHeader.setBounds(0, 50, 600, 30);
        add(lblHeader);
        
        btnHome = new JButton("Home");
        btnHome.setBounds(40, 100, 100, 30);
        add(btnHome);
        
        btnSquare = new JButton("Square");
        btnSquare.setBounds(180, 100, 100, 30);
        add(btnSquare);
        
        btnTriangle = new JButton("Triangle");
        btnTriangle.setBounds(320, 100, 100, 30);
        add(btnTriangle);
        
        btnCircle = new JButton("Circle");
        btnCircle.setBounds(460, 100, 100, 30);
        add(btnCircle);
        
        txtLegnth = new JTextField("0");
        txtLegnth.setBounds(75, 200, 100, 30);
        add(txtLegnth);
        
        txtWidth = new JTextField("0");
        txtWidth.setBounds(250, 200, 100, 30);
        add(txtWidth);
        
        lblRectangleFormula = new JLabel("P = 2*(l+w)");
        lblRectangleFormula.setBounds(425, 200, 100, 30);
        add(lblRectangleFormula);
         
        lblLenght = new JLabel("Length");
        lblLenght.setBounds(75, 235, 100, 30);
        add(lblLenght);
        
        lblWidth = new JLabel("Width");
        lblWidth.setBounds(250, 235, 100, 30);
        add(lblWidth);
        
        btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(250, 285, 100, 30);
        add(btnCalculate);
        
        lblRectanglePerimeter = new JLabel("Perimeter is "+perimeter, SwingConstants.CENTER);
        lblRectanglePerimeter.setBounds(200, 315, 200, 30);
        add(lblRectanglePerimeter);
        
        btnHome.addActionListener(this);
        btnSquare.addActionListener(this);
        btnTriangle.addActionListener(this);
        btnCircle.addActionListener(this);
        btnCalculate.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnHome){
            dispose();
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }else if(e.getSource() == btnSquare){
            dispose();
            Square sp = new Square();
            sp.setVisible(true);
        }else if(e.getSource() == btnTriangle){
            dispose();
            Triangle tp = new Triangle();
            tp.setVisible(true);
        }else if(e.getSource() == btnCircle){
            dispose();
            Circle cp = new Circle();
            cp.setVisible(true);
        }else if(e.getSource() == btnCalculate){
            String strLength = txtLegnth.getText().trim();
            String strWidth = txtWidth.getText().trim();
            
            perimeter = 2 * (Integer.parseInt(strLength) + Integer.parseInt(strWidth));
            lblRectanglePerimeter.setText("Perimeter is "+String.valueOf(perimeter));
            
        }
    }
    
    
}
