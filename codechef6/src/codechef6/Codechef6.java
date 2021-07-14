
package codechef6;

import java.util.ArrayList;
import java.util.Scanner;


public class Codechef6 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for (int j = 0; j < t; j++) {
            
        int le=in.nextInt();
      ArrayList a=new ArrayList();
      ArrayList x=new ArrayList();
       ArrayList b=new ArrayList();
      int c=0,count=0,h=0,min=0,l=0,q=0;
     long sum=0L,z=0l;
     for (int i = 0; i < le; i++) 
     {
         a.add(in.nextInt());
     }
        for (int i = 0; i < le; i++) {
           
           sum=sum+(int)a.get(i);
          
        }
            
            
        for (int i = 0; i < le; i++) {
            c=(int) (sum-(int)a.get(i));
            
            b.add(c);
        }
        
            
        double f=(double)sum/le;
            System.out.println(f);
        for (int i = 0; i < le; i++) {
          
            z=(int) b.get(i);
            
             double r=(double)z/(le-1);
            
            if(r==f)
            { 
                count=count+1;
                
                h=(int) a.get(i);
                x.add(h);}
            
        }
            
       if(count==1)
        { for (int i = 0; i < le; i++) {
                if((int)a.get(i)==(int)x.get(0))
                    q=i;
            }
        System.out.println((int)q+1);
        }
        else
       { if(count>1)
            { min=(int)x.get(0);
           for (int i = 0; i < count; i++) {
           if(min>(int)x.get(i))
               min=(int)x.get(i);
           
               
           }
           for (int i = 0; i < le; i++) {
                if((int)a.get(i)==(int)min)
                {  q=i;
                break;
                }
                  
            }
           System.out.println((int)q+1);
       }
        else
           System.out.println("Impossible");
      
      
           }
       
        
            
               
        }
        
    }
    
    
}
