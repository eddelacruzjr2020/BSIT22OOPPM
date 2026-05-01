/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.Classes;

import java.util.HashMap;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class HashMapSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<String, String> make = new HashMap<String, String>();
        
        make.put("Honda", "CBR");
        make.put("Kawasaki", "Ninja");
        make.put("Yamaha", "R1");
        make.put("Honda", "CBR");
        make.put("", "");
        
        
        System.out.println(make);
        
        System.out.println(make.get("Kawasaki"));
    }
    
}
