
package pkg3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
     	public static void main (String[] args) throws java.lang.Exception
	{
	    
	     ArrayList<Integer> a=new ArrayList<>();
	Scanner in=new Scanner(System.in);
	int l=in.nextInt();
    
      
        for (int i = 0; i < l; i++) {
                int t1=in.nextInt();
            int sum=0;
            a.clear();
            int diff=0;
            for (int j = 0; j < t1; j++) {
              a.add(in.nextInt());
                            }
            for (int j = 0; j <t1-1; j++) {
            
                if((int)a.get(j+1)>(int)a.get(j))
                { 
                    diff=(int)a.get(j+1)-(int)a.get(j)-1;}
                else
                {
                     diff=(int)a.get(j)-(int)a.get(j+1)-1;
                }
                sum=sum+diff;
               
            }
            System.out.println(sum);
        }
	
	}
    
}
