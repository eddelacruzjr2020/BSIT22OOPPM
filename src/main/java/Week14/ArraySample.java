/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14;

import java.util.Arrays;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class ArraySample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] ar = {33, 44, 11, 22};
        String[] names = {"Bea", "Apple", "Doggy", "Zebra", "Cathy"};
        
        print(ar);
        System.out.println("\n--------------");
        Arrays.sort(ar);
        print(ar);
        
        printString(names);
        System.out.println("\n--------------");
        Arrays.sort(names);
        printString(names);
        
     
    }
    
    static void print(int[] ar){
        for(int x:ar){
            System.out.println(x+" ");
        }
    }
    
    static void printString(String[] ar){
    for(String x:ar){
        System.out.println(x+" ");
    }
    }
    
}
