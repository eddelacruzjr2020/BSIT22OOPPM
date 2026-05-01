/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class SortListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");
        
        
        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);
        
        list.sort(null);
        System.out.println(list);
        
        

        
        
    }
    
}
