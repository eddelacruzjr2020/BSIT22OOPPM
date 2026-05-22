/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week1516;

import java.io.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class CharacterStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        FileReader readStream = null;
        FileWriter writeStream = null;
        
        try{
            
            readStream = new FileReader("C:\\Users\\Edmundo Dela Cruz\\Desktop\\School Related\\SY2526 2nd Semester\\Sat -730AM - 1230PM - OOP - BSIT 2-1\\New Text Document.txt");
            writeStream = new FileWriter("C:\\Users\\Edmundo Dela Cruz\\Desktop\\School Related\\SY2526 2nd Semester\\target.txt");
            
            int c;
            while((c = readStream.read()) != -1){
                writeStream.write(c);
            }
        }finally{
            if(readStream != null){
            readStream.close();
        }
            if(writeStream != null){
            writeStream.close();
        }
        }
    }
    
}
