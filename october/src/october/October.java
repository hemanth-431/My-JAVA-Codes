
package october;


import java.util.*;
import java.lang.*;
import java.io.*;


public class October {

  
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int test=in.nextInt();
        for (int z = 0; z < test; z++) {
            
        
      int count=0;
      int n=in.nextInt();
     int m=in.nextInt();
     int a[][]=new int[n][m];
    
      int t=in.nextInt();
        int l=t*2;
    int arr[]=new int[l];
 
        for (int i = 0; i < l; i++) {
          arr[i]=in.nextInt();
        }
     
        
        for (int k = 0; k < l; k=k+2) {
          
            for (int i = 0; i < m ; i++) {
                a[arr[k]-1][i]++;
            }}
        
        
            for (int p = 1; p<l; p=p+2) {
           
            for (int i = 0; i < n; i++) {
                a[i][arr[p]-1]++;
            }
        }
      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
      for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j]%2!=0)
                    count++;
            }
       
            
        }
            System.out.println(count);
    }   
}
}
       
    


