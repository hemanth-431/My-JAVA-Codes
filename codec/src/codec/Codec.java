
package codec;

import java.util.ArrayList;
import java.util.Scanner;

public class Codec {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int l,p=0,k=0;
      int n=in.nextInt();
      ArrayList a=new ArrayList();
        for (int i = 0; i <n; i++) {
             
            a.add(in.nextInt());
          }
        
       if(n%2==0)
       { l=n/2;}
       else
       { l=n/2+1; }
       
        for (int i = 0; i < l; i++) {
            p=(int)a.get(i)+p;
            
        }
        for (int i = l; i < n; i++) {
            k=k+(int)a.get(i);
            
        }
        System.out.println((int)k-p);
    }
    
}
