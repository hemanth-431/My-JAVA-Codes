
package practiceco;

import java.util.Scanner;

public class Practiceco {

 
    public static void main(String[] args) {


       Scanner in=new Scanner(System.in);
       String s=in.nextLine();
       int hash=0;
       int a[]=new int[26];
       int b[]=new int[26];
        for (int i = 0; i < 26; i++) {
            b[i]=i;
        }
       for (int i = 0; i < (int)s.length(); i++) {
            a[(int)s.charAt(i)-'a']++;
            
        }
        for (int i = 0; i < 26; i++) {
            if(a[i]!=0)
            {
                hash=hash+a[i]*b[i];
            }
        }
        
        
        
        

    }
    
}
