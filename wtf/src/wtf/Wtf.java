/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wtf;

import java.util.ArrayList;
import java.util.Scanner;


public class Wtf {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        
        ArrayList a=new ArrayList();
        for (int i = 0;i<b; i++) {
            a.add(in.nextInt());
        
        }
        int l=a.size();
      int l1=l/2;
        System.out.println((int)a.get(0)+""+(int)a.get(l-1)+""+(int)a.get(l1));
        if(((int)a.get(0)>(int)a.get(l-1)) ||((int)a.get(0)> (int)a.get(l1))){
            System.out.println("first");}
        else
            if(((int)a.get(l-1)>(int)a.get(0)) ||((int)a.get(l-1)> (int)a.get(l1)))
                System.out.println("last");
        else
                if(((int)a.get(l1)>(int)a.get(0)) ||((int)a.get(l1)> (int)a.get(l-1)))
                    System.out.println("middle");
        
        
    }
    
}
