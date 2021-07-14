
package sum.and.average;

import java.util.Scanner;


public class SumAndAverage {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        int sum=0;
      double ave;
       int c=0;
        
       
     
       while(true)
       {
           System.out.println("Enter a number");
           boolean l=in.hasNextInt();
           if(l)
           {
              
           int n=in.nextInt();
           c=c+1;
           sum=sum+n;
           }
       else
       {
           break;
       }
    
       in.nextLine();
       }
        System.out.println(sum);
       ave=sum/c;
        System.out.println(ave);
    }
}

    

