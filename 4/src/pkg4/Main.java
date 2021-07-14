
package pkg4;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set b=new HashSet();
      
        int a[]=new int[]{1,3,5,2,3,1};
        for (int i = 0; i < a.length; i++) {
            b.add(a[i]);
        }
        System.out.println(b);
    }
    
}
