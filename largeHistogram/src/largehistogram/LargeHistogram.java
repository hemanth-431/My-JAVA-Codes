/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largehistogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LargeHistogram {


    public static void main(String[] args) {
        int[] height={2,1,5,6,2,3};
        
       if (height == null || height.length == 0) {
		System.out.println("0");
	}
List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < height.length; i++) {
            list.add(height[i]);
        }
 
       Collections.sort(list);
      int index= list.indexOf(list.get(height.length-1));
      int op=(int)list.get(index-1)*2;
      System.out.println(op);
 
    }
    
}
