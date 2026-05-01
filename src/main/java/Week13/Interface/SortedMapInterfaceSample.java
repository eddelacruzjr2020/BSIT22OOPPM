/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.Interface;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class SortedMapInterfaceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeMap<String, Double> t = new TreeMap<String, Double>();
        
        t.put("John", new Double(1.25));
        t.put("Lloyd", new Double(2.75));
        t.put("Anna", new Double(1.50));
        
        System.out.println(t);
        
        System.out.println(t.get("Anna"));
        
        Set<?> set = t.entrySet();
        Iterator<?> i = set.iterator();
        
        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        

        
        System.out.println(t.get("Lloyd"));
        
        
    }
    
}
