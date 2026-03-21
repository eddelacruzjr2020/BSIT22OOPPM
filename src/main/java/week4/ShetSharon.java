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
public class ShetSharon extends JFrame implements ActionListener{
    
    private JLabel lblHeader, lblShetSharonCount, lblShetSharon, lblPeenoyCount, lblPeenoy;
    private JComboBox<String> cmbShetSharon, cmbPeenoy;
    private JButton btnAddShetSharon, btnMinusShetSharon, btnAddPeenoy, btnMinusPeenoy, btnCalculate;
    private JTextArea txaResult;
    private static final String[] Sizes = {"Small", "Medium", "Large"};
    private int intShetSharonCount, intPeenoyCount;
    
    
    
    ShetSharon(){
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblHeader = new JLabel("Balut App", SwingConstants.CENTER);
        lblHeader.setBounds(0, 50, 800, 30);
        add(lblHeader);
        
        cmbShetSharon = new JComboBox<>(Sizes);
        cmbShetSharon.setBounds(35, 100, 100, 30);
        add(cmbShetSharon);
        
        btnAddShetSharon = new JButton("+");
        btnAddShetSharon.setBounds(170, 100, 50, 30);
        add(btnAddShetSharon);
        
        btnMinusShetSharon = new JButton("-");
        btnMinusShetSharon.setBounds(255, 100, 50, 30);
        add(btnMinusShetSharon);
        
        lblShetSharonCount = new JLabel("0");
        lblShetSharonCount.setBounds(340, 100, 50, 30);
        add(lblShetSharonCount);
         
        lblShetSharon = new JLabel("ShetSharon");
        lblShetSharon.setBounds(425, 100, 100, 30);
        add(lblShetSharon);
        
        cmbPeenoy = new JComboBox<>(Sizes);
        cmbPeenoy.setBounds(35, 150, 100, 30);
        add(cmbPeenoy);
        
        btnAddPeenoy = new JButton("+");
        btnAddPeenoy.setBounds(170, 150, 50, 30);
        add(btnAddPeenoy);
        
        btnMinusPeenoy = new JButton("-");
        btnMinusPeenoy.setBounds(255, 150, 50, 30);
        add(btnMinusPeenoy);
        
        lblPeenoyCount = new JLabel("0");
        lblPeenoyCount.setBounds(340, 150, 50, 30);
        add(lblPeenoyCount);
         
        lblPeenoy = new JLabel("Peenoy");
        lblPeenoy.setBounds(425, 150, 100, 30);
        add(lblPeenoy);
        
        txaResult = new JTextArea();
        txaResult.setBounds(560, 100, 200, 300);
        txaResult.setEditable(false);
        add(txaResult);
        
        btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(250, 250, 100, 30);
        add(btnCalculate);
        
        btnAddShetSharon.addActionListener(this);
        btnMinusShetSharon.addActionListener(this);
        btnAddPeenoy.addActionListener(this);
        btnMinusPeenoy.addActionListener(this);
        btnCalculate.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAddShetSharon){
            intShetSharonCount++;
            lblShetSharonCount.setText(String.valueOf(intShetSharonCount));
        }else if(e.getSource() == btnMinusShetSharon){
            if(intShetSharonCount > 0){
                intShetSharonCount--;
                lblShetSharonCount.setText(String.valueOf(intShetSharonCount));
            } 
        }else if(e.getSource() == btnAddPeenoy){
            intPeenoyCount++;
            lblPeenoyCount.setText(String.valueOf(intPeenoyCount));
        }else if(e.getSource() == btnMinusPeenoy){
            if(intPeenoyCount > 0){
                intPeenoyCount--;
                lblPeenoyCount.setText(String.valueOf(intPeenoyCount));
            } 
        }else if(e.getSource() == btnCalculate){
            
            double totalCost = 0.0;
            totalCost +=calculateCost(intShetSharonCount, (String) cmbShetSharon.getSelectedItem());
            totalCost +=calculateCost(intPeenoyCount, (String) cmbPeenoy.getSelectedItem());
            
            txaResult.setText("Your Order is/are\n" +
                              ""+cmbShetSharon.getSelectedItem()+" ShetSharon * "+intShetSharonCount+"\n" +
                              ""+cmbPeenoy.getSelectedItem()+" Peenoy * "+intPeenoyCount+" \n" +
                              "Total is: $"+totalCost+"");
            
        }
        
    }
    
    private double calculateCost(int count, String size){
        double price = 0.;
        
        
        switch(size){
            case "Small" -> price = 5.00;
            case "Medium" -> price = 7.50;
            case "Large" -> price = 10.00;
        }
        
        return count * price;
    }
    
}
