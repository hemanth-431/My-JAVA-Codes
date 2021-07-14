package codechef123;

import java.io.IOException;
import java.util.*;

public class Codechef123 {

    public static void main(String[] args) throws IOException{
     Scanner in=new Scanner(System.in);
     int test=in.nextInt();
        for (int i = 0; i < test; i++) {
            
        
     int finish=in.nextInt();
     int db=in.nextInt();
     int ta=in.nextInt();
     int bs=in.nextInt();
     int distance=finish+db;
   double  t=finish/bs;
            System.out.println(t);
   double t1=Math.sqrt((2*distance)/ta);
            System.out.println(t1);
   if(t1>t)
            System.out.println("bolt");
   else
            System.out.println("tiger");
    }
    }
    
}
