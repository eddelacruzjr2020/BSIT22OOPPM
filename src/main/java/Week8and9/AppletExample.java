/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8and9;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class AppletExample extends Applet{
    
    @Override
    public void init(){
        setBackground(Color.BLACK);
        setForeground(Color.PINK);   
    }
    
    public void paint(Graphics g){
        g.drawString("welcome to the world of Applet", 40, 40);
       
    }
    
}
