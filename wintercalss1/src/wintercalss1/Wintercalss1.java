
package wintercalss1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Wintercalss1 {

    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       int n=in.nextInt();
   int    sum=0,s1=0,avg;
   int index;
    ArrayList a=new ArrayList();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
        Collections.sort(a);
        for (int i = 0; i < n; i++) {
            sum=sum+(int)a.get(i);
        }
        if(n%2!=0)
        { avg=n/2;}
        else
        { avg=(n/2)+1;} 
       // System.out.println(a.get(avg));
        for (int i = 0; i < n; i++) {
             if((int)a.get(i)>(int)a.get(avg))
                 s1=s1+(int)a.get(i)-(int)a.get(avg);
             else
                 s1=s1+(int)a.get(avg)-(int)a.get(i);
            
        }
        System.out.println(s1);
       
    }
    
}
