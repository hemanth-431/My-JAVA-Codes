
package coinproblem;

import java.util.Scanner;


public class Coinproblem {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int s=in.nextInt();
        int l=in.nextInt();
        int[] c=new int[l];
        for (int i = 0; i < l; i++) {
            c[i]=in.nextInt();
        }
        int[][] a=new int[l][s+1];
        for (int i = 0; i < l; i++) {
            a[i][0]=1;
        }
        for (int i = 0; i < l; i++) {
            for (int j = 1; j <=s; j++) {
                if(c[i]>j){
                    if(i==0)
                    {a[i][j]=0;}else{
                    a[i][j]=a[i-1][j];}
                }else
                {
                    if(i==0)
                    {a[i][j]=a[i][j-c[i]];}else{
                    a[i][j]=a[i-1][j]+a[i][j-c[i]];}
                }
            }
        }
         System.out.println("(a[l-1][s-1]");
     /*   for (int i = 0; i < l; i++) {
            for (int j = 0; j <=s; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
             */
    }
    
}
