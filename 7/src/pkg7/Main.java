
package pkg7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int l=in.nextInt();
       int a[]=new int[l];
       int c=0,d=0,sum=0;
        for (int i = 0; i < l; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i < l; i++) {
            if(a[i]==7)
                c=i;
           
        }
         for (int i = 0; i < l; i++) {
            if(a[i]==6)
            {d=i;
                break;}
           
        }
         if(d!=0)
         { for (int i = 0; i < d; i++) {
            sum=sum+a[i];
        }}
         if(c!=0)
         {  for (int i = c+1; i < l; i++) {
            sum=sum+a[i];
        }}
         
        System.out.println(sum);
    }
    
}
