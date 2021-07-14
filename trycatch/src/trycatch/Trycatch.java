
package trycatch;
import java.util.Scanner;

public class Trycatch {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
         try{
       int i,j,k;
       i=in.nextInt();
      
  
       if(i<10)
           System.out.println(i);
       else
           throw new ArithmeticException();
       }
         catch(ArithmeticException e){
             System.out.println("go on "+e); 
         }
    }
    
}
//10.7