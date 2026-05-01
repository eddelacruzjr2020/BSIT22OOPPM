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
public class Sample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> list = new ArrayList<String>();
        list.add("Ed");
        list.add("Test");
        System.out.println(list.isEmpty());
        System.out.println(list);
        list.getFirst();
    }
    
}
