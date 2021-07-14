
package codechef5;

import java.util.ArrayList;
import java.util.Scanner;


public class Codechef5 {

    
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int t=in.nextInt();
         while(t--!=0){
      ArrayList s1=new ArrayList();
       ArrayList s2=new ArrayList();
         ArrayList s3=new ArrayList();
     
      int a=in.nextInt();
      int b=in.nextInt();
      int l=in.nextInt();
      int r=in.nextInt();
      int sum1=0,sum2=0,sum3=0,c=0;
      for(int i=l;i<=r;i++)
      {
          if(i%a==0)
              s1.add(i);
          if(i%b==0)
              s2.add(i);
      }
        for(Object i:s1){
            if((int)i%b==0){
                s3.add(i);
            }
        }
        for(Object i:s1){
            sum1=sum1+(int)i;
        }
         for(Object i:s2){
            sum2=sum2+(int)i;
        }
          for(Object i:s3){
            sum3=sum3+(int)i;
        }
         int tot=sum1+sum2;
         int dif=tot-sum3;
         if(dif%2==0)
         {System.out.println("True Love");
             c=c+1;}
         if(tot%3==0 && c==0)
         { System.out.println("Love");
             c=c+1;}
         if(c==0)
             System.out.println("FakeLove");
         }  
    }

}