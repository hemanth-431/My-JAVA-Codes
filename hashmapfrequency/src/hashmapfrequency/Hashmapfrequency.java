/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapfrequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Hashmapfrequency {

      public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
      
    public static void main(String[] args) {
        String a[]={"Ramesh","Mahesh","Ramesh","Mahesh"};
    
   
       HashSet<String> h = new HashSet<>(Arrays.asList(a));
          List<String> list = new ArrayList<String>(h); 
        Collections.sort(list); 
       HashMap<String,Integer> h1=new HashMap<>();
        for (String i : list) {
            int count=0;
            for (int j = 0; j < a.length; j++) {
              if(i.equals(a[j])){
                  count++;
              }
              
            }
            h1.put(i, count);
        }
             Map<String, Integer> hm1 = sortByValue(h1); 
         for (Map.Entry<String, Integer> en : hm1.entrySet()) { 
            System.out.println(en.getKey() + en.getValue()); 
        } 
      
    }
    
}
