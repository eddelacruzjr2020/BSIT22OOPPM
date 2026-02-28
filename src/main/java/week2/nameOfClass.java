/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class nameOfClass extends imaginaryNumber implements interface1{
    private int a, b, c, d;
    
    public void add(int a, int b){
        int c = a + b;
        System.out.println("Sum is "+c);
    }
    
    @Override
    public void subtraction(int a, int b, int c) {
        d = a - b - c;
        System.out.println("Difference of "+d);
    }

    @Override
    public void multiple(int a, int b) {
        c = a * b;
        System.out.println("Product of "+c);
        
    }
    
    final void depositMoney(String account1, int acc1Amount, String account2, int acc2Amount){
        System.out.println("Depositing money from account "+account1 +"with amount "+acc1Amount);
        System.out.println("To Account "+account2+ "amount of "+acc2Amount);
    }
    
    public static void main(String[] args){
        nameOfClass nc = new nameOfClass();
        nc.add(100, 200);
    }
}
