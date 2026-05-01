/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.Interface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class ListInterfaceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Durian");
        
        fruits.remove(3);

        
        System.out.println(fruits);
        
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        
        
    }
    
}
