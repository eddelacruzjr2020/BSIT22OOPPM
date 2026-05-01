/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.Interface;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class DequeInterfaceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deque<Integer> num = new ArrayDeque<>();
        num.offer(10);
        num.offerLast(21);
        num.offerFirst(52);
        //52, 10, 21
        num.add(11);
        //52, 10, 21, 11
        num.offer(100);
        //52, 10, 21, 11, 100
             
        System.out.println(num);
        
        System.out.println(num.peekLast());
        
        num.poll();
        System.out.println(num);

        
    }
    
}
