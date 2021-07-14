
package minswaps1;

import java.util.Scanner;

public class Minswaps1 {
static int ones=0;
    static void cout(int[] a,int n){
        
        int minones=0,min=0,index=0;
        for(int i=0;i<=n-ones;i++){
            minones=0;
            for (int j = i; j <ones+i; j++) {
                if(a[j]==1)minones++;
            }
          if(minones>min)
          {min=minones;index=i;}
           
        }
        int zeros=0;
        for(int i=index;i<ones;i++){
            if(a[i]==0)
                zeros++;
        }
        System.out.println(zeros);
    }
   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
            if(a[i]==1){
                ones++;
            }
        }
        cout(a,n);
    }
    
}
