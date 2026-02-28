/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
//        int x = 2;
//        if(x == 1){
//            System.out.println("1");
//        }else if (x == 2){
//            System.out.println(2);
//        }
//        else if (x == 2){
//            System.out.println(2);
//        }
//        else{
//            System.out.println("Nothing to print");
//        }
//
//        if(x == 1){
//            System.out.println("1");
//        }else{
//            System.out.println("Nothing to print");
//        }
//        
//        
//        System.out.println(x == 1 ? "1" : "Nothing to print");
//        
//        String number = "2";
//        int x = 2;
//        switch (number) {
//            case "1":
//                System.out.println("1");
//                break;
//            case "2":
//                System.out.println("2");
//                break;
//            case "3":
//                System.out.println("3");
//                break;
//            case "4":
//                System.out.println("4");
//                break;
//            case "5":
//                System.out.println("5");
//            default:
//                System.out.println("Nothing to print");
//                break;
//        }



//        for (int i = 0; i <=20; i++){
//            NewMain3 main = new NewMain3();
//            main.shoutNumber(i);
//            Thread.sleep(500);
//        }
//
//          int i = 20;
//          while(i >= 0){
//              NewMain3 main = new NewMain3();
//              main.shoutNumber(i);
//              Thread.sleep(500);
//              i--;
//          }
//        
       
//        String name1 = "Bob";
//        String name2 = "John";
//        String name3 = "Ed";
//        String name4 = "Earl";
        
        List<String> names = Arrays.asList("Bob", "John", "Ed", "Earl", "Ed1", "Earl2", "John", "Earl5");
        String name = "John";
        int index;
        
        for(index = 0; index<names.size(); index++ ){
            if(names.get(index).equals(name.toLowerCase())){
                break;
            }
        }
        
        System.out.println(index <names.size()
            ? "Found at index "+index
            : "Not Found");
        
        
    }
    
//        public void shoutNumber(int x){
//            System.out.println("Number is "+x);
//        }
    
}
