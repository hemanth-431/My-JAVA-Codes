/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       ArrayList a=new ArrayList();
      
            a.add(in.nextLine());
            a.add(in.nextLine());
            a.add(in.nextLine());
       Collections.reverse(a);
     boolean f=  a.get(0).equals(a.get(1));
            System.out.println(a.get(0));
            System.out.println(a.get(2));
        
    }
    
}
