/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8and9;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Polygon {
    
    public void display(){
        System.out.println("Inside Polygon Class");
    }
    
}

class AnonymousDemo{
    public void createClass(){
        Polygon p1 = new Polygon(){
            @Override
            public void display(){
            System.out.println("Inside an Anonymous Class");
            
            }
        };
        p1.display();
       
        
    }
}
