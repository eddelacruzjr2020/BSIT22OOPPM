/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bsit22ooppm;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class animalMainClass{
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animal a = new animal();
        String test = a.animalName;
        
        //behaviour
//        a.setAnimalName("Dog");
//        a.setNoOfLegs(4);
//        System.out.println(a.getAnimalName());
//        System.out.println(a.getNoOfLegs());
        //attribute
//        a.noOfLegs();
//        a.animalName();


        superClass sc = new superClass();
        sc.setAnimalName("Snake");
        sc.setNoOfLegs(0);
        
        SuperDuperClass sdc = new SuperDuperClass();
//        sdc.doBuild();
//        sdc.setAnimalName("Cat", 10);
//        sdc.setAnimalName(10, "Dog");
        sdc.setNoOfLegs(10);
        System.out.println(sdc.getNoOfLegs());

        
    }
    
}
