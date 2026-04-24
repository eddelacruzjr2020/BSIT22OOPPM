/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week12.Counter;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Counter c = new Counter();
        
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i=1; i<=1000000; i++){
                    c.increment();
                }
                

                
            }
        });
        
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i=1; i<=1000000; i++){
                    c.increment();
                }
                
            }
        });
        
        thread1.start();
        thread2.start();
        thread1.run();
        thread2.run();
        
        System.out.println(c.getCount());
    }
    
}
