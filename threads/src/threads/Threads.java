/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.ArrayList;
import java.util.Scanner;


public class Threads {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     ArrayList<Character> a=new ArrayList<>();
     char[] b=new char[100];
     String c="abcdefahijklmnop";
        for (int i = 0; i < c.length(); i++) {
            a.add(c.charAt(i));
        }
    int[] l=new int[c.length()];
        for (int i = 0; i < c.length(); i++) {
            l[i]=0;
        }
        for (int i = 0; i < c.length(); i++) {
            l[a.get(i)-'a']++;
        }
        for (int i = 0; i < c.length(); i++) {
              System.out.println(l[i]);
        }
  
    
    }
    
}
