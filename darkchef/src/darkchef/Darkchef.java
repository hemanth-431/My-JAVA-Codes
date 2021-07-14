
package darkchef;

import java.util.ArrayList;
import java.util.Scanner;

public class Darkchef {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for (int i = 0; i < t; i++) {
            int d=in.nextInt();
            int c=in.nextInt();
            int b[]=new int[d];
            ArrayList<Integer> a=new ArrayList<>();
            for (int j = 0; j < d; j++) {
                 a.add(in.nextInt());
               
            }
            for (int j = 0; j < d; j++) {
                b[a.get(j)]++;
            }
            int sum=0;
            for (int j = 0; j < d; j++) {
                if(b[j]!=1 && b[j]!=0 ){
                    sum=sum+b[j];
                }
            }
            
        }
    }
}
