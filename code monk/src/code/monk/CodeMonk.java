
package code.monk;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeMonk {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for (int i = 0; i < t; i++) {
            int n=in.nextInt();
            int less=1,mul;
            int sum=0;
            ArrayList a=new ArrayList();
            ArrayList b=new ArrayList();
            
            for (int j = 0; j < n; j++) {
                 a.add(in.nextInt());
           
            }
             for (int j = 0; j < n; j++) {
                b.add(in.nextInt());
             }
             for (int j = 0; j < n-1; j++) {
                
            
             less=(int)a.get(j);
              mul=(int)(less*(int)b.get(j));
             sum=sum+mul;
             if(less>(int)a.get(j+1))
                 less=(int)a.get(j+1);
             }
            
             mul=less*(int)b.get(n-1);
             sum=sum+mul;
             System.out.println(sum);
        }
    }
    
}
