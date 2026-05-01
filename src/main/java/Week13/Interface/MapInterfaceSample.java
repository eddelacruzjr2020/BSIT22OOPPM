/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


/**
 *
 * @author Edmundo Dela Cruz
 */
public class MapInterfaceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(26, "Zebra");
        
        System.out.println(map.get(26));
        
        System.out.println(map);
        
        for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();){
            Entry<Integer, String> m = iterator.next();
            System.out.println(m.getKey() + " " + m.getValue());
        }
        
        Map<String, String> fullName = new HashMap<String, String>();
        fullName.put("Ed", "Apple");
        fullName.put("DC", "Banana");
        fullName.put("Test", "Zebra");
        
        System.out.println(fullName);
        
        System.out.println(fullName.get("DC"));
        
        
    }
    
}
