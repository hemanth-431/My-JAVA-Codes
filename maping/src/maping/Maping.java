
package maping;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class Maping {

    
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("net","vifnv");
        map.put("name", "80431");
        map.put("apple","fruet");
        map.put("nose","body organ");
       
        Set<String> keys=map.keySet();   
      
        for(Object key :keys)
        System.out.println(key+" "+map.get(key));
    }
    
}
