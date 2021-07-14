
package pkg1;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int l=in.nextInt(),sum=0;;
       int a[]=new int[l];
        for (int i = 0; i < l; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i < l; i++) {
            sum=sum+a[i];
        }
        System.out.println(sum);
        System.out.println((float)sum/l);
    }
    
}
