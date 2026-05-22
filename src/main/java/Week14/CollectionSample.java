/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class CollectionSample {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList al = new ArrayList<>();
        al.add(11);
        al.add(32);
        al.add(28);        
        al.add(10);
        
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);
  

    }
    
}
