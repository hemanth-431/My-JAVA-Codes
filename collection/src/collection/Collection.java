
package collection;

import java.util.ArrayList;
public class Collection {

   
    public static void main(String[] args) {
  
       ArrayList c =new ArrayList();
       c.add(3);
       c.add(7d);
       c.add("hello");
        for (Object i: c) {
            System.out.println(i);
            
        }
    }
    
}
// Math.round(5533/34.5);
//prints the rounded value.s
// ArrayList--->List , to workk with index value
//Set c=new HashSet, to overcome dublicates
//Set c=new TreeSet , Out put will be in assending or descending orser
// Map<Integer,String>c=new HashMap<>();
// Map<Integer,String>c=new HashTable<>();