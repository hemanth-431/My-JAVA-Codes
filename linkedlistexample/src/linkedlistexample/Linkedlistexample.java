/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistexample;

import java.util.Collections;
import java.util.LinkedList;
import javafx.scene.Node;

public class Linkedlistexample {

    public static void main(String[] args) {
       LinkedList<Integer> a=new LinkedList<Integer>();
    a.add(1);
    a.add(0);
    a.add(1);
    int sum=0;
        for (int i = 0; i < a.size(); i++) {
           sum=sum + (int)a.get(i) * (int)Math.pow(2,i);
        }
    System.out.println(sum);
        System.out.println();
    
      
    }
  

  
}
