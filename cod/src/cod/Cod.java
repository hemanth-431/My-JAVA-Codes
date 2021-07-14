
package cod;
import java.util.Scanner;
public class Cod {


    public static void main(String[] args) {
        String str,rev="";
        int count=0;
             Scanner in =new Scanner(System.in);
              str=in.nextLine();
              int len=str.length();
              for (int i =len-1; i >=0; i--) 
                  {
                      if (str.charAt(i)=='a' || str.charAt(i)=='b') 
                      rev=rev+str.charAt(i);}
         
        System.out.println(rev);
                  
            
       
             
    }
    
}
