
import java.util.Scanner;



public class Codarc {

   
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String s=in.nextLine();
       int a[26];
       for (int i = 0; i < (int)s.length(); i++) {
            a[s.charAt(0)-'a']++;
            
        }
        for (int i = 0; i < 26; i++) {
            if(a[i]!=0)
            {
                System.out.println(a[i]);
            }
        }
       
    }
    
}
