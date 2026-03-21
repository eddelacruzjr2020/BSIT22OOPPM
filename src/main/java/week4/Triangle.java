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
public class Triangle extends JFrame implements ActionListener{
    
    private JLabel lblHeader, lblSide1, lblSide2, lblSide3, lblTriangleFormula, lblTrianglePerimeter;
    private JButton btnRectangle, btnHome, btnSquare, btnCircle, btnCalculate;
    private JTextField txtSide1, txtSide2, txtSide3;
    private int perimeter;
    
    Triangle(){
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHeader = new JLabel("Triangle Perimeter", SwingConstants.CENTER);
        lblHeader.setBounds(0, 50, 600, 30);
        add(lblHeader);
        
        btnRectangle = new JButton("Rectangle");
        btnRectangle.setBounds(40, 100, 100, 30);
        add(btnRectangle);
        
        btnHome = new JButton("Home");
        btnHome.setBounds(180, 100, 100, 30);
        add(btnHome);
        
        btnSquare = new JButton("Square");
        btnSquare.setBounds(320, 100, 100, 30);
        add(btnSquare);
        
        btnCircle = new JButton("Circle");
        btnCircle.setBounds(460, 100, 100, 30);
        add(btnCircle);
        
        txtSide1 = new JTextField("0");
        txtSide1.setBounds(75, 200, 100, 30);
        add(txtSide1);
        
        txtSide2 = new JTextField("0");
        txtSide2.setBounds(250, 200, 100, 30);
        add(txtSide2);
        
        txtSide3 = new JTextField("0");
        txtSide3.setBounds(425, 200, 100, 30);
        add(txtSide3);
       
        lblTriangleFormula = new JLabel("P =s1=s2+s3");
        lblTriangleFormula.setBounds(425, 285, 100, 30);
        add(lblTriangleFormula);
         
        lblSide1 = new JLabel("Side 1");
        lblSide1.setBounds(75, 235, 100, 30);
        add(lblSide1);
        
        lblSide2 = new JLabel("Side 2");
        lblSide2.setBounds(250, 235, 100, 30);
        add(lblSide2);
        
        lblSide3 = new JLabel("Side 3");
        lblSide3.setBounds(425, 200, 100, 30);
        add(lblSide3);
        
        btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(250, 285, 100, 30);
        add(btnCalculate);
        
        lblTrianglePerimeter = new JLabel("Perimeter is "+perimeter, SwingConstants.CENTER);
        lblTrianglePerimeter.setBounds(0, 315, 600, 30);
        add(lblTrianglePerimeter);
        
        btnRectangle.addActionListener(this);
        btnHome.addActionListener(this);
        btnSquare.addActionListener(this);
        btnCircle.addActionListener(this);
        btnCalculate.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnHome){
            dispose();
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }else if(e.getSource() == btnRectangle){
            dispose();
            Rectangle rp = new Rectangle();
            rp.setVisible(true);
        }else if(e.getSource() == btnSquare){
            dispose();
            Square sp = new Square();
            sp.setVisible(true);
        }else if(e.getSource() == btnCircle){
            dispose();
            Circle cp = new Circle();
            cp.setVisible(true);
        }else if(e.getSource() == btnCalculate){
            String strSide1 = txtSide1.getText().trim();
            String strSide2 = txtSide2.getText().trim();
            String strSide3 = txtSide3.getText().trim();
            
            perimeter = Integer.parseInt(strSide1) + Integer.parseInt(strSide2) + Integer.parseInt(strSide3);
            lblTrianglePerimeter.setText("Perimeter is "+String.valueOf(perimeter));
            
        }
    }
    
    
}
