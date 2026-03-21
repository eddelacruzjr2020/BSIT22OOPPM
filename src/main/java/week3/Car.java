/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Car {
    private String color, model, make;
    private int speed, year;
    protected int hotdog;
   
    
//    public Car(String color, int speed){
//        this.color=color;
//        this.speed = speed;
//    }
//    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setMake(String make){
        this.make = make;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setCarDetails(String model, String make, int year){
        this.model=model;
        this.make=make;
        this.year=year;
    }
    
    public void setMakeAndModel(String model, String make){
        this.model=model;
        this.make=make;
        
    }
    
    public void drive(boolean fourWheels){
        String tires = "wide";
    }
    
    public void paint(String newColor, String oldColor){
        String carNewColor = newColor;
        String carOldColor = oldColor;
    }
    
    
    
    public void changeTires(){
        int numTires = 4;
        int changedTires = 0;
       
        for(int i = 0; i<numTires; i++){
            changedTires +=1; 
        }
        
        System.out.println(numTires);
        System.out.println(changedTires);
//        System.out.println(i);
        
    }
    
    public void setSpeed(int speed){
        this.speed=speed;
    }
    
    
    public void setStudentDetails(String name, int age){
        
    }
    
    
}
