package fifth;
import java.util.Scanner;
public class Fifth
{
    public static void main(String[] args)
    {
     Scanner in =new Scanner(System.in);
     int n=in.nextInt();
     boolean b=rev(n);
     if(b)
            System.out.println("YES");
     else
            System.out.println("NO");
    }
    public  static boolean rev(int n)
    { 
        int sum=0;
        for (int i = 1; i <n; i++) {
            if(n%i==0)
                sum=sum+i;
        if(sum==n)
            return(true);
        
        return(false);
            
        }
        return false;
        
       
        
    }}
