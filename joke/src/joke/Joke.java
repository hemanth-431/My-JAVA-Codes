/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joke;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class Joke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set b=new HashSet();
             b.add(8);
             b.add("m");
             b.add(1);
           Set a=new HashSet(); 
           a.add(8);
           a.add("m");
           a.add(1);
           System.out.println(a);
           System.out.println(a.equals(b));
           if( b.equals("[8]"))
                System.out.println("hi");
           else
               System.out.println("good");
    }
    
}
