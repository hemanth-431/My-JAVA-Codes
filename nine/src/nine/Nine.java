
package nine;
import java.util.Scanner;
public class Nine {

    public static void main(String[] args) {
       String a[]=new String[5];
        
            Scanner in =new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                a[i]=in.nextLine();
                
            
        }
            for (String i : a) {
                System.out.println(i);
            
        }
    }
    
}
