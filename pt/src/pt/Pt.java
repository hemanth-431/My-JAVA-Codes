
package pt;

import java.util.Scanner;

public class Pt {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s="akiigni";
 int a[]=new int[26];
  int b[]=new int[26];
  int sum=0;
        String t="gtvdh";
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)-'a']++;
        }
        
            for (int j = 0; j < t.length(); j++) {
                 b[t.charAt(j)-'a']++;
            }
           
        for (int i = 0; i < 26; i++) {
            if(b[i]!=0)
            if(b[i]-a[i] > 0) 
                sum=sum+b[i]-a[i];
        }
           System.out.println(sum); 
       
        
       
    }
    
}
