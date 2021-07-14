
package skilling.files;

import java.io.FileNotFoundException;
import java.util.Scanner;





public class Objectinfile {

   
    public static void main(String[] args) {
       
      java.io.File file=new java.io.File("180030431.txt");
      try{
          Scanner in=new Scanner(System.in);
          while(in.hasNext())
          {
              String num=in.nextLine();
              System.out.println(num);
          }
      }
      catch(Exception e){
          System.err.format("File not found");
      }
     
   
    }
    
}
