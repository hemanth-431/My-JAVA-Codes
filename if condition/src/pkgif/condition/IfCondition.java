
package pkgif.condition;

import java.util.Scanner;
public class IfCondition {

   
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     String s=in.nextLine();
     for(int i=0;i<5;i++)
     {
         if(s.charAt(i)=='A')
         {
             if(s.charAt(i-1)=='P' || s.charAt(i-2)=='P' || s.charAt(i+1)=='P' || s.charAt(i+2)=='P')
             {
                 System.out.println((double)15/2);
             }
         }
     }
    }
    
}
