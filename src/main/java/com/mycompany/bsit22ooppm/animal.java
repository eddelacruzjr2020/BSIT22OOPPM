/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bsit22ooppm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class animal{
    
     //fields
    public String animalName;
    private int noOfLegs;
    private int balance;
    
    
//    public animal(String animalName, int noOfLegs){
//        this.animalName=animalName;
//        this.noOfLegs=noOfLegs;
//    }
    

    //methods
    public void setAnimalName(String animalName){
        this.animalName=animalName;
    }
    
    public void setAnimalName(String animalName, int noOfLegs){
    this.animalName=animalName;
    this.noOfLegs=noOfLegs;
    }
    
    public void setAnimalName(int noOfLegs){
    this.noOfLegs=noOfLegs;
    }
    
    public void setAnimalName(int noOfLegs, String animalName){
    this.animalName=animalName;
    this.noOfLegs=noOfLegs;
    }
    
    public String getAnimalName(){
        return animalName;    
    }
        
    public void setNoOfLegs(int noOfLegs){
        this.noOfLegs=noOfLegs;
    }
    
    public int getNoOfLegs(){
        return noOfLegs;
    }

    void animalName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    
}
