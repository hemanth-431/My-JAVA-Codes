/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class SeptemberChallange
{
    
  
   
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[]=new int [100];
		for(int i=1;i<100;i++)
                    arr[i]=101;
		
           
		String koko="";
		for(int i=1;i<100;i++)
                    koko+=arr[i];
		Scanner z=new Scanner(System.in);
		StringBuilder res=new StringBuilder();
		int t=z.nextInt();
		while(t-->0)
		{
		    long n;
		    long m;
		    n=z.nextLong();
		    m=z.nextLong();
		    long low=n-1;
		    long high=(n*(n+1))/2;
		    if(high>=m&&m>=low)
		    {
		        if(n>=3)
		        {
		            high=n+1;
	
                if(m<=high)
                {
                    res.append("2\n");
                    continue;
                }
                high=2*n;
                if(high>=m)
                {
                    res.append("3\n");
                    continue;
                }
                m=m-high;
                low=m/n;
                m=m-(low*n);
                long ans=3+((low)*2);
                long mid=n/2;
                if(m>0){
                if(m<=mid)ans++;
                else ans+=2;}
                res.append(ans+"\n");
		        }
		        else if(n==2)
		        {
		          if(m==1)res.append("1\n");
                else res.append("2\n");
		        }
		        else{
		            res.append(m+"\n");
		        }
		    }
		    else{
		        res.append("-1"+"\n");
		    }
		}
		System.out.println(res);
		
		
	}
}
