/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14;

import java.util.Date;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class DateSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date d1 = new Date();
        Date d2 = new Date(System.currentTimeMillis());
        Date d3 = new Date("2026/05/20 12:07");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        System.out.println(d1.getHours());
    }
    
}
