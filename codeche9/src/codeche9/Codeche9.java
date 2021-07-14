
package codeche9;

import java.util.Scanner;

public class Codeche9 {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
        for (int i = 0; i < t; i++) {
            int n=in.nextInt();
            int c=0;
            int sum=0;
            int k=in.nextInt();
            int a[]=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=in.nextInt();
            }
           
            if(a[0]<k)
            {System.out.println("No "+(k-a[0]));}
            else    
            { 
                sum=a[0]-k;
                for (int j = 1; j < n; j++) {
                       
                sum=sum+a[j];
                
                    if(sum < k)
                    { System.out.println("NO "+(k-sum+1));
                          break;}
                    sum=sum-k;
                    c++;
                }
                    if(c==(n-1))
                          System.out.println("Yes ");
            }
                
           
        }
          
    }
    }
    

