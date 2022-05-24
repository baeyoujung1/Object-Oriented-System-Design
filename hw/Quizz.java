package hw;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Quizz {
   public static void main(String args[]) {
      while(true) {
         String path = System.getProperty("user.dir");
         System.out.print("Command: ");
         Scanner scannerObject = new Scanner(System.in);
         String command = scannerObject.next();
         
         if (command.equals("pwd")) {
            System.out.println(path);
         }
         else if (command.equals("list")) {
            String[] str =  new File(path).list();
            for(String lis : str) {  
                String file2 = path + "\\" + lis;
                File file = new File(file2);          
                String info = ""; 
                String folder = file.isDirectory() ? "d" : "-";
                String execute = file.canExecute() ? "x" : "-";
                String read = file.canRead() ? "r" : "-";
                String write = file.canWrite() ? "w" : "-";
                    
                long size = file.length();            
                info = folder + execute + read + write;       
                System.out.print(info);
                System.out.printf("%12d", size);
                System.out.print("        ");
                System.out.print(lis);
                System.out.println();
            }
         }
         else {
            try {
               File file = new File(command);
               FileReader file3 = new FileReader(file);
               int count = 0;
               while((count = file3.read()) != -1) {
                  System.out.print((char)count);
               }
               System.out.println();
               file3.close();
            }
            catch(FileNotFoundException e) {
               System.out.println("No such a file: " + command);
            }
            catch(IOException e) {
               e.getStackTrace();
            }
         }
      }
   }
}
