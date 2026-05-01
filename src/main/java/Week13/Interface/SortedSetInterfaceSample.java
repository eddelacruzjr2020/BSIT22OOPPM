/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.Interface;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class SortedSetInterfaceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SortedSet set = new TreeSet();
        set.add("Bob");
        set.add("Sean");
        set.add("Jennifer");
        
        System.out.println(set);
        
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Object element = i.next();
            System.out.println(element.toString());
            
        }
        
    }
    
}
