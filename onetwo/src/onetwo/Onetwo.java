
package onetwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class Onetwo {
ArrayList<Integer> a=new ArrayList<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      String s[]={"abcd","bcdef","abcd","bcdef"};
     //ArrayList b=Arrays.List(s);
     ArrayList<String> a=new ArrayList<>();
     
     Collections.addAll(a, s);
    // HashSet<String> h=new HashSet<>();
    /*    for (int i = 0; i < 4; i++) {
            h.add(s[i]);
        }

            */
        Collections.sort(a);
        System.out.println(a);
        
   
    }
    
}

