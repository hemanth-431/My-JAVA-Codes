
package sorting;

import static java.lang.reflect.Array.set;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Sorting {

  
    public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   int i=0,c=0,z=10;
   Map m=new TreeMap();
   m.put(789, null);
   m.put(98, null);
   m.put(898, null);
     Set<String> k=m.keySet();
        for (Object key:k) {
            System.out.println(key);
        }
        

   
    }
    
}
