/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class Practise {

    
   public void hi()
    {
        for (int i = 0; i <2; i++) {
            System.out.println("hello");
            hi();
            
           
        }
    }
   
    public static void main(String[] args) {
   Practise obj=new Practise();
   obj.hi();
    }
    
}
