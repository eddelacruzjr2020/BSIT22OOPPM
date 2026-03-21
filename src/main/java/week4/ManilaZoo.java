/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4;

import java.util.ResourceBundle;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class ManilaZoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal cow = new Animal();
        cow.setColor("Brown");
        cow.setNoOfLegs(4);
        System.out.println("Cow color is "+cow.getColor()+" and has "+cow.getNoOfLegs()+" legs");
        
        Animal snake = new Animal();
        snake.setColor("Yellow");
        snake.setNoOfLegs(0);
        System.out.println("Snake color is "+snake.getColor()+" and has "+snake.getNoOfLegs()+" legs");
    }
    
}
