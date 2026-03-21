/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.newpackage1;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class C implements A, B{
    public void displayingC(){
        System.out.println("Displaying C");
    }

    @Override
    public void displayingA() {
        System.out.println("Displaying B");
    }

    @Override
    public void displayingB() {
        System.out.println("Displaying C");
    }   

    @Override
    public void displayingD() {
        System.out.println("Displaying D");
    }
    
}
