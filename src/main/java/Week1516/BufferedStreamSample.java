/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week1516;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class BufferedStreamSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String[] names = {"Ed", "Dela", "Cruz", "Test", "dsadsada", "dasdsadsa"};
        
        try{
            BufferedWriter write = new BufferedWriter(new FileWriter("output.txt"));
            write.write("Writing to a file");
            write.write("\nHere are the names");
            for(String name:names){
                write.write("\n"+name);
            }
            
            write.close();
            
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) != null){
            System.out.println(line);
        }
            reader.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}
