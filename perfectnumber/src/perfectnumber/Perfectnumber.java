
package perfectnumber;

import java.util.Scanner;

public class Perfectnumber {
static int sum=0;
   static int per(int n){
       
       if(n>0 && 6%n==0)
       {        sum=sum+n;
       return per(n-1);}
       else
           return sum;
       
       
       
   }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       int pr = per(n/3);
        System.out.println(pr);
        
    }
    
    
}
