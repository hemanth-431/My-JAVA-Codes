
package pkg2d_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList z=new ArrayList();
        int c[][]=new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                c[i][j]=in.nextInt();
            }
        }
        int sum=0;
        for (int a = 0; a < 4; a++) {
           int k=a+1,l=1;
           
            for (int b=0; b < 4; b++) {
                
                for (int i = a; i < (int)a+3; i=i+2) {
                   
                    for (int j = b; j < b+3; j++) {
                        //System.out.print(c[i][j]+"*");
                     sum=sum+c[i][j];
                     
                    }
                    
                  
                }
               // System.out.print(c[k][l]+"@");
                  sum=sum+c[k][l];
                  if(l<4)
                      l++;
                 z.add(sum);
               // System.out.println(sum);
                sum=0;
            }
            
        }
        Collections.sort(z);
        int o=z.size();
        //System.out.println(o);
        System.out.println(z.get(o-1));
    }
    
}
