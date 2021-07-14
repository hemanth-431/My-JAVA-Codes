
package dicstnary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Dicstnary {

    
    public static void main(String[] args) {
        Map<String,String> map=new TreeMap<>();// TreeMap is a class gives the sorted order.
        map.put("nnfnv","vifnv");
        map.put("name", "80431");
        map.put("apple","fruet");
        map.put("nose","body organ");
        map.put("neck", "good");
        map.put("aeroplane","flying machine");
        Set<String> keys=map.keySet();   
    
        for(Object key :keys)
        System.out.println(key+" "+map.get(key));
        
    }
    
}
// Insted of Tree HashMap it can be sored by converting in to List as shown below
/*
package dicstnary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import static java.util.Locale.Category.values;
import java.util.Map;
import java.util.Set;

public class Dicstnary {

    
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("net","vifnv");
        map.put("name", "80431");
        map.put("apple","fruet");
        map.put("nose","body organ");
        map.put("neck", "good");
        map.put("aeroplane","flying machine");
        Set<String> keys=map.keySet();   
       List list = new ArrayList(keys);
        Collections.sort(list);
        for(Object key :list)
        System.out.println(key+" "+map.get(key));
        
    }
    
}
*/