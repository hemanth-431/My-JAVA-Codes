
package shortest;

import java.util.ArrayList;
import java.util.Scanner;

public class Shortest {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       ArrayList a=new ArrayList();
       int x1,x2,y1,y2,x3,y3,x4,y4,l;
       double min=1000;
       int r1=in.nextInt();
       int r2=in.nextInt();
       int b[]=new int[8];
        for (int i = 0; i < 8; i++) {
            b[i]=in.nextInt();
        }
        for (int i = 0; i < 8; i=i+2) {
            x1=b[i];
            x2=r1;
            x3=x2-x1;
            
            y1=b[i+1];
            y2=r2;
            y3=y2-y1;
            
            a.add(Math.sqrt(Math.pow(x3,2)+ Math.pow(y3,2)));
            
        }
      
        for (int i = 0; i < (int)a.size(); i++) {
            
        if(min>(double)a.get(i))
            min=(double)a.get(i);
           
        }
        System.out.println(min);
       
       
    }
    
}
