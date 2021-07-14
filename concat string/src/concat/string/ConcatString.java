
package concat.string;
import java.util.Scanner;
public class ConcatString {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a,b;
        a=in.nextLine();
        b=in.nextLine();
       // a=a.concat(b);
        //System.out.println(a);
        System.out.println(a+b);
        int l=a.length();
        System.out.println(l);
        a=a.toUpperCase();
        System.out.println(a);
    }
    
}
