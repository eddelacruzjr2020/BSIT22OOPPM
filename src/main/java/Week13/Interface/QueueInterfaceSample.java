/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.Interface;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class QueueInterfaceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Queue<String> q = new LinkedList<>();
        q.add("Apple");
        q.add("Banana");
        q.add("Cherry");
        q.add("Donkey");
        q.add("Elephant Mango");
        
        System.out.println(q);
        
        q.remove();
        q.remove("Elephant Mango");
        System.out.println(q);
        System.out.println(q.size());
       
        
    }
    
}
