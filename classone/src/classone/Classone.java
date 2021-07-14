/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classone;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Classone {
    //
     public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
       
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
//
   	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
String[] s={"abcd","edjfjmf","jjffv"};
HashMap<String, Integer> h = new HashMap<String, Integer>();
int a[]=new int[s.length];
            for (int i = 0; i < s.length; i++) {
                a[i]=0;
            }
          
String s1;
//String b[]=new String["a","e","i","o","u"];
            for (int i = 0; i <s.length; i++) {
               
                s1=s[i];
                for (int j = 0; j < s1.length(); j++) {
                    if(s1.charAt(j)== 'a' || s1.charAt(j)== 'e' || s1.charAt(j)== 'i' || s1.charAt(j)== 'o' || s1.charAt(j)== 'u')
                    {
                        a[i]++;
                    }
                }
              //   System.out.println(s[i]);
                h.put((String)s[i],(int)a[i]);
            }
            Map<String, Integer> hm1 = sortByValue(h); 
        for (Map.Entry<String, Integer> en : hm1.entrySet()) { 
              System.out.println(en.getKey());
       //     System.out.println("Key = " + en.getKey() +  
       //                   ", Value = " + en.getValue()); 
        } 
    }
    
}
