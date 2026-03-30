/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Calculator {
    
    private int firstInt, secondInt, sumInt;
    private double firstDou, secondDou, sumDou;
    private String firstStr, secondStr, concatenate;
    
    public void add(int firstInt, int secondInt){
        sumInt = firstInt + secondInt;
        System.out.println("The sum of 2 integer is "+sumInt);
    }
    
    public void add(double firstDou, double secondDou){
        sumDou = firstDou + secondDou;
        System.out.println("The sum of 2 double is "+sumDou);
    }
    
    public void add(String firstStr, String secondStr){
        concatenate = firstStr + secondStr;
        System.out.println("The concatenate of 2 String is "+concatenate);
    }
}
