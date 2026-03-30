/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week6;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class CalculatorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator cal = new Calculator();
        cal.add(10, 20);
        cal.add(20.0, 40.6);
        cal.add("Ed", " Dela Cruz");
        cal.add(20, 40);
    }
    
}
