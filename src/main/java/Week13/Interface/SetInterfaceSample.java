/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13.Interface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class SetInterfaceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count[] = {21, 23, 43, 53, 22, 65, 21, 24};
        
        Set<Integer> set = new HashSet<Integer>();
        
        try{
            for(int i = 0; i<= 7; i++){
               set.add(count[i]);
            }
            
            System.out.println(set);
            
            TreeSet<Integer>  sortedSet = new TreeSet<Integer>(set);
            
            System.out.println("The sorted list is");
            System.out.println(sortedSet);
            System.out.println("First Element of the set is: "+ sortedSet.first());
            System.out.println("Last Element of the set is: "+ sortedSet.last());
            
        }catch (Exception e){
            
        }
        
    }
    
}
