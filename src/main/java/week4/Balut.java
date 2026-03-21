/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Balut extends JFrame{
    
    protected static final ArrayList<String> screenSizes = new ArrayList<>(){{
        add("Small Screen");
        add("Medium Screen");
        add("Normal Screen");
    }};
    
    Balut(){
        this("Normal Screen"); //Default
    }
    
    Balut(String screenType){
        
        setName("Balut App");
        
        if(screenType.equals("Small Screen")){
            setSize(400, 600);
        }else if(screenType.equals("Medium Screen")){
            setSize(600, 700);
        }else{
            setSize(800, 800);
        }
        
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
