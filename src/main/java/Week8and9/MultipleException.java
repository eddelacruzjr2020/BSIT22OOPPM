/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8and9;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MultipleException {
    
    public static void main(String[] args) throws ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException{
        try{
//            int a = 50/0; //ArithmeticException  
//            String s = null;
//            System.out.println(s.length());//NullPointerException  
//            String s="abc";
//            int i = Integer.parseInt(s); //NumberFormatException  
              int a[]=new int[5];
              a[10]=50; //ArrayIndexOutOfBoundsException  
 



            
        }catch(ArithmeticException e){System.out.println("Arithmetic exception: "+ e.getMessage());
        }catch(NullPointerException e){System.out.println("Null Pointer exception: "+ e.getMessage());
        }catch(NumberFormatException e){System.out.println("Number Format exception: "+ e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){System.out.println("Array Out of Bound exception: "+ e.getMessage());
        }
    }
    
}
