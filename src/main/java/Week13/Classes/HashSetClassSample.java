/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.Classes;

import java.util.HashSet;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class HashSetClassSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet<String> hst = new HashSet<String>();
        
        hst.add("Suzuki");
        hst.add("Kawasaki");
        hst.add("Honda");
        
        System.out.println(hst);
        System.out.println(hst.size());
    }
    
}
