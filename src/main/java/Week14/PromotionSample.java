/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class PromotionSample {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte b  = 42;
    char c = 'a';
    short s = 1042;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;
    
    
    double result = (f * b) + (i / c) - (d * s);
    
        System.out.println(result);
        
        char ch = 'A';
        int value = (int) ch;

        System.out.println(value); // 65
    }
    
}
