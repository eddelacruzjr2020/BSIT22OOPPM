/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4;

import javax.swing.JOptionPane;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class BalutApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String choice = (String) JOptionPane.showInputDialog(null, "Select Screen Size", "Screen Selection",
        JOptionPane.QUESTION_MESSAGE, null, Balut.screenSizes.toArray(), Balut.screenSizes.get(2));
       
        if (choice == null) choice = "Normal Screen";
        
        Balut app = new Balut(choice);
        app.setVisible(true);
    }
    
}
