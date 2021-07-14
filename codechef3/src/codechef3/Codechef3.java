
package codechef3;

import java.io.IOException;
import java.util.Scanner;
public class Codechef3 {

   
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int l=in.nextInt();
   
            String s=in.nextLine();
             int count=0,c=0;
            for(int j=0;j<l;j++)
            {
                if(s.charAt(j)=='p'){
                    count=count+1;
                }
            }
            if((count/l)<7.5)
            {
                recurl obj=new recurl();
                obj.c=count;
                while((double)obj.c<7.5)
                {
                for(int m=0;m<l;m++){
                if(s.charAt(m)=='A')
         {
             if(s.charAt(m-1)=='P' || s.charAt(m-2)=='P' || s.charAt(m+1)=='P' || s.charAt(m+2)=='P')
                        obj.soop();
                       
                }
            }
            }
        
        if((double)(obj.c/l)>7.5)
                    System.out.println(obj.c);
        else
                    System.out.println("-1");
    }
        }
    }
}
class recurl{
    int c;
    public void soop(){
        c=c+1;
    }
}