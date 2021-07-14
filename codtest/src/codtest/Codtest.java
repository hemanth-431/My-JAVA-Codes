
package codtest;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Codtest {

    public static void main(String[] args) {
        
        ArrayList a=new ArrayList();
        a.add(3);
        a.add(3);
        a.add(3);
        a.add(4);
        a.add(4);
        a.add(5);
        a.add(5);
        a.add(5);
       a.sort(null);
             a.remove(5);
        System.out.println(a);
  
        Map<Integer,Integer> ko=new TreeMap();
        ko.put(98, 909);
        ko.put(374,332);
        Set<Integer> j=ko.keySet();
        j.remove(98);
        for (int key:j)
        System.out.println(key+" "+ko.get(key));
        
        LinkedHashSet li=new LinkedHashSet(a);
     //   System.out.println(li);
        
    }
    
}
