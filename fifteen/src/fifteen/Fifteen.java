
package fifteen;
import java.util.Scanner;
public class Fifteen {

    public static void main(String[] args) {
        
        int l=0,count=0,c=0,k=0;
       int a[][]=new int[5][5];
        
            Scanner in =new Scanner(System.in);
            for (int i = 0; i < 5; i++)
            {
                for(int j=0;j<5;j++)
            {
                a[i][j]=in.nextInt();
                 } }
           
           for(k=0;k<5;k++)
           {
             if(a[k][l]<a[k][l+1] && a[k][l]<a[k+1][l])
                 count=count+1;
             else
                 c=c+1;
                 
           }
             for(int m=1;m<5;m++)
           {
             if(a[k][m]<a[k][m+1] && a[k][m]<a[k+1][m])
                 count=count+1;
             else
                 c=c+1;}
              for(k=0;k<5;k++)
           {int m=5;
             if(a[k][m]<a[k][m+1] && a[k][m]<a[k+1][m])
                 count=count+1;
             else
                 c=c+1;}
               for(int m=0;m<5;m++)
           { k=5;
             if(a[k][m]<a[k][m+1] && a[k][m]<a[k+1][m])
                 count=count+1;
             else
                 c=c+1;}
    if(c>0)
            System.out.println("yes");
    else
            System.out.println("no");
    }
    
    
    }

    
    

