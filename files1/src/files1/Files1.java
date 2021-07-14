
package files1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Files1 {

    public static void main(String[] args) throws IOException {
     int option;
     int i,num;
     String str="";
     Scanner in=new Scanner(System.in);
   //  boolean flag=true;
  //   while(flag)
  //   {
         
   //      switch(1)
    //     { 
   //          case 1:
                 FileWriter f1=new FileWriter("C:\\Users\\user\\Documents\\hack.txt");
                 
                 for (int j = 0; j < 1; j++) {
                     f1.write(in.nextLine());
                   
                     
                 }
            
  //               break;
                 
             f1.write(in.nextLine());
             
              f1.close();
 //          case 2:
                 int ch;
                 FileReader f2=new FileReader("C:\\Users\\user\\Documents\\hack.txt");
                 
                 while((ch=f2.read())!=-1)
                 {
                     System.out.println((char)ch);
                 }
                 f2.close();
 //                break;
         }
  //   }*/
  //  }
    
}
