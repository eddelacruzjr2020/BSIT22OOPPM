/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Name {
    public int age;
    
    public void myMethod(String fName, int age){
        System.out.println("First Name is "+fName+" Age is: "+age);
    }
    
    public int add(int x, int y){
       return x+y;
    }
    
    
    public void checkAge(int age, String Gender){
        if(age<18 && Gender != "Male"){
            System.out.println("You are minor and your not a man. Get out of here!!");
        }else if((age>=18 && Gender == "Male")) {
            System.out.println("Welcome to the Club!!!");
        }else{
            System.out.println("Not Compatible");
        }
    }
    
}
