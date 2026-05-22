/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class NarrowingSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double d = 100.04; // 8bytes
        
        long l = (long)d; // 8bytes
        
        int i = (int)l; // 4 bytes
        
        double d1 = (double)i; // 8bytes
        
        
        
        
        
        System.out.println(d);
        System.out.println(l);
        System.out.println(i);
        System.out.println(d1);
    } 
    
}
