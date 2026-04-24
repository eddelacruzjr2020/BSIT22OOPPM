/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week11;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class PersonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person1 = new Person("Ed", 100);
        Person person2 = new Person("Dela Cruz", 100);
        
        int gradeResults = person1.compareTo(person2);
        
        if(gradeResults > 0){
            System.out.println(person1.getName()+ " is smarter than "+person2.getName());
        }else if(gradeResults < 0){
            System.out.println(person2.getName()+ " is smarter than "+person1.getName());
        }else{
            System.out.println(person1.getName()+ " and "+person2.getName()+ " are both smart");
        }
    }
    
}
