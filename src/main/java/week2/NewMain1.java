/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        nameOfClass nc = new nameOfClass();
//        nc.add(0, 0);
        
        float[] grades = {1.50f, 1.25f, 1.0f, 2.50f};
        char[] middleInitial = {'A', 'B', 'C'};
        
//        System.out.println(grades[1]);
        middleInitial[2] = 'D';
        System.out.println(middleInitial);
        System.out.println(middleInitial.length);
    }
    
}
