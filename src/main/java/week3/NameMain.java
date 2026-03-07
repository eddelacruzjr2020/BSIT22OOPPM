/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class NameMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Name n = new Name();
        n.myMethod("Ed", 20);
        n.myMethod("Dela Cruz", 21);
        n.myMethod("Test", 22);
          int sum = n.add(100, 100);
          String strSum = String.valueOf(n.add(100, 100));
          int intSum = Integer.parseInt(strSum);
          
          n.checkAge(18, "Male");
          
          System.out.println(n.age);
          
        
    }
    
}
