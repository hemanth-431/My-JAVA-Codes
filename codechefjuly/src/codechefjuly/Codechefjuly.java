
package codechefjuly;

import java.io.IOException;
import java.util.Scanner;


public class Codechefjuly {

  
    public static void main(String[] args)throws IOException {
         Scanner in=new Scanner(System.in);
         long n1=in.nextLong();
         long n2=in.nextLong();
       
      
       int t1=in.nextInt();
       int t2=in.nextInt();
       int t=in.nextInt();
       int i = 0;
       long m=(long) n1;
       
         if(t1>t)
             i=t1-t;
         else
             i=t-t1;
         if (t-t1>0)
         
         {
             b.mul(m,i);}
         else
         { a.div(m,i);}
       
             
          
      
    }
    
}
class a
{   int  n ;
     public static void  div(long m,int i){
       
      
        while(--i!=0)
            m=m/2;
        
        System.out.println(m/2);
}}

class b{
  public static void  mul(long m,int i){
       
   
        while(--i!=0)
            m=m*2;
        
        System.out.println(m*2);  
}
}