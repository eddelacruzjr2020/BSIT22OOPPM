/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Person implements InterFace{
    private String name;
    private int age;
    
    Person(String name, int age){
        this.name=name;
        this.age=age;
        
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public void dancing() {
        System.out.println("Dancing");
    }

    @Override
    public void singing() {
        System.out.println("Singing");
    }
    
}
