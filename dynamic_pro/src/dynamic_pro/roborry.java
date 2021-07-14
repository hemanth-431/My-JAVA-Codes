/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_pro;

import java.util.Scanner;

public class roborry {
    
   public static void main(String[] args) {
       
   Scanner in=new Scanner(System.in);
   
   int l=in.nextInt();
       int[] A=new int[l];
       for (int i = 0; i < l; i++) {
           A[i]=in.nextInt();
       }
       roborry r=new roborry();
      int max=r.rob(A, l);
       System.out.println(max);
   
   }
   int rob(int A[],int n){
       int sel=rob(A,n-2)+A[n];
       int notsel=rob(A,n-1);
       
       return Math.max(sel,notsel);
       
   }
    
}
