    
package proexample;
import proexample.getset.*;
import java.util.Arrays;

public class Proexample {

    public static void main(String[] args) {
        String s="dbjbjbdbv ihbfifhbff";
        System.out.println(s.substring(0, 5));
       String b[]=s.split("");
        char a[]=s.toCharArray();
        System.out.println(Arrays.asList(b));
        System.out.println(Math.addExact(3, 4));
        getset m=new getset(4,5,7);
        System.out.println(m.getA());
       
        
        
    }
    
}
