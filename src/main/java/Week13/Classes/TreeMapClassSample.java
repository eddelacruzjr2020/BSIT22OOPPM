/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.Classes;

import java.util.TreeMap;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class TreeMapClassSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         TreeMap<String, String> map = new TreeMap<String, String>();
         
         map.put("1", "Amber");
         map.put("2", "Jasmin");
         map.put("100", "Lloyd");
         map.put("1", "Amber");
        
         
         System.out.println(map);
    }
    
}
