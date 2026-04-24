/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.MultiThreading;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MultiTreadExtendError extends Thread{
    
    private int numThread;
    
    MultiTreadExtendError(int numThread){
        this.numThread=numThread;
    }
    
    
    @Override
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println(i+" of numThread "+numThread);
            try {
                Thread.sleep(1000);
                if(numThread == 2 && i ==3){
                    throw new RuntimeException("Exception in thread "+ numThread);
                }
            } catch (InterruptedException ex) {
                System.getLogger(MultiTreadExtendError.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            } 
            catch (RuntimeException ex) {
                System.err.println(ex.getMessage());
                break;
            }
        }
    }
}
