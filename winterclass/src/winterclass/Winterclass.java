
package winterclass;

import java.util.ArrayList;
import static java.util.Optional.empty;
import java.util.Scanner;

public class Winterclass {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        int i=0;long h;
       
       String s[]=new String[100000];
       s[0]=in.nextLine();
       while(true)
       {  h=Long.parseLong(s[i]);
           if(h<1000000 && h>-1000000)
       {  i++;
           s[i]=in.nextLine();}
          
       else
       {
               break;
               }
       }
        System.out.println(s.length);
    }
    
}
