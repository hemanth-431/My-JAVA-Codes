
package codechef;
import java.util.Scanner;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		int r,c;
		
		for(int l=0;l<t;l++)
		{
		    r=sc.nextInt();
		    c=sc.nextInt();
		    int a[][]=new int[r][c];
		    for(int i=0;i<r;i++)
		    {
		        for(int j=0;j<c;j++)
		        {
		            a[i][j]=sc.nextInt();
		        }
		    }
		    int k=1;
		    for(int i=0;i<r;i++)
		    {
		        for(int j=0;j<c;j++)
		        {
		        if( ((i+j)==0)||(i==r-1 && j==0)||(i==0 && j==c-1)||(i==r-1 && j== c-1))
		            {
		                if(a[i][j]>1)
		                {
		                    k=0;//false
		                    break;
		                }
		            }
		        if( (i==0)||(i==r-1)||(j==0)||(j==c-1) )
		            {
		                if(a[i][j]>2)
		                {
		                    k=0; //false
		                    break;
		                }
		            }
		        if(a[i][j]>3)
		               {
		                    k=0; //false
		                    break;
		                }
		        }
		        if(k==0)
		        break;
		    }
		    if(k==1)
		    System.out.println("Stable");
		    else
		    System.out.println("Unstable");
		    
		}
		
		}
		
	}
/*
2
3 3
1 2 1
2 3 2
1 2 1
3 4
0 0 0 0
0 0 0 0
0 0 4 0

stable
unstable*/

