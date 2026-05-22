/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class WideningSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 100; // 4bytes
        System.out.println(i);
        
        long l = i; //8bytes
        System.out.println(l);
        
        double f = l;  //8bytes
        System.out.println(f);
        
        
        
    }
    
}
