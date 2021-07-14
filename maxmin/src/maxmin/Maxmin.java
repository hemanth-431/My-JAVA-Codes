
package maxmin;

import java.util.Scanner;

public class Maxmin {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int min=0;
       int max=0;
       boolean first=true;
       while(true)
       {
           System.out.println("Enter a number ");
           boolean b=in.hasNextInt();
           if(b)
           {
           int n=in.nextInt();
           if(first)
           {
               first=false;
               max=n;
               min=n;
           }
           if(n>max)
               max=n;
           if(n<min)
               min=n;
       }
           else
           {
               break;
           }
           in.nextLine();
    }
        System.out.println(max);
        System.out.println(min);
    }
    
}
