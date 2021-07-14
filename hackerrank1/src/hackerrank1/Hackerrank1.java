
package hackerrank1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hackerrank1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int b[]=new int[26];
        int count=0;
        ArrayList<Character> a=new ArrayList();
        for (int i = 0; i < l; i++) {
            a.add(in.next().charAt(0));
        }
        Collections.sort(a);
        int g='A';
        int y;
        for (int p = 0; p < l; p++) {
           int t= a.get(p);
           if(a.get(p)=='_')
               count++;
           else
               b[t-g]+=1;
               
           
       }
        int len=b.length;
        for (int i = 0; i < 26; i++) {
           if(b[i]!=0)
           {if(b[i]==1)
                    System.out.println("No");
                    break;}
           else
                    {
                       if(count!=0)  
                           System.out.println("Yes");
                            }
                    
        }
        int c=0;
        for (int i = 0; i < l; i++) {
            if(b[i]!=b[i+1])
                c++;
            if(c!=len)
                System.out.println("No");
                
        }
       
    }
    
}
