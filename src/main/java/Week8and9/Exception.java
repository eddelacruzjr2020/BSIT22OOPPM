/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8and9;

import java.lang.Throwable;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Exception {
    
    public static void main(String[] args) throws NumberFormatException{
        
            try{
                String x="abc";
                int i = Integer.parseInt(x);
            }catch(NumberFormatException e){
                System.out.println(e);
            }
      
    }
    
}
