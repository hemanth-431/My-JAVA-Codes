
package javaapplication205;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class JavaApplication205 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StringBuilder s=new StringBuilder();
        HashMap<Integer,Integer> h=new HashMap<>();
        h.put(50,895);
        h.put(56,005);
        h.put(45,756);
    ArrayList arr=new ArrayList();
   Set<Integer> so=h.keySet();
        
        for(Object key :so)
        arr.add(key);
        
        Collections.sort(arr);
       
        for(Object key1:arr)
        {
            System.out.println(key1+" "+h.get(key1));
        }
    }
   // Set<String> keys=map.keySet();   
      
   //     for(Object key :keys)
   //     System.out.println(key+" "+map.get(key));
}
