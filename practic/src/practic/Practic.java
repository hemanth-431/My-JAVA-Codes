
package practic;

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Practic {

   
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
        for (int p = 0; p < t; p++) {
            
        
        int n=in.nextInt();
        int m=in.nextInt(),left,right;
        int k=in.nextInt();
        int dp[][]=new int[n+1][m+1];
        for ( int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                dp[i][j]=in.nextInt();
            }
        }
        int no[][][]=new int[n+1][m+1][2];
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                if(j==1 || i==1)
                    left=0;
                else
                    left=Math.max(no[i-1][j-1][0],no[i-1][j-1][1]);
                    
               
                if(j==m || i==1 )
                    right=0;
                else
                   right=Math.max(no[i-1][j+1][0],no[i-1][j+1][1]);
                     
            if(left>right)
                 no[i][j][0]=dp[i][j]+left;
            else
                 no[i][j][0]=dp[i][j]+right;
         if(i==k+1)
         {
             no[i][j][1]=dp[i][j];
         }
         else
             if(i>k+1)
             {
                 int id=i-k-1;
                  if(j==1)
                    left=0;
                else
                    Math.max(no[id][j-1][0],no[id][j-1][1]);
                     
               
                if(j==m)
                    right=0;
                else
                   right=Math.max(no[id][j+1][0],no[id][j+1][1]);
                    
                
                if(left>right)
                    no[i][j][1]=dp[i][j]+left;
                else
                     no[i][j][1]=dp[i][j]+right;
                    
             }
         
            
          // normal values with out deleteing rows is saved in no[][][0]
            // values after deleting roes is saved in no[][][1]
            
                
            }
               
            }
        int max=0;
            for (int j = 1; j < m; j++) {
                if(no[n][j][0]>no[n][j][1])
                    max=no[n][j][0];
             
               
                
            }
             System.out.println(max);
            
                }
            }
        }
      
        
    
    

