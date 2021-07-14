/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechefsep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Codechefsep {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
        for (int k = 0; k < t; k++) {
            
        
       int l=in.nextInt();
       HashSet<Integer> a=new HashSet<>();
        for (int i = 0; i < l; i++) {
            a.add(in.nextInt());
        }
         List<Integer> list = new ArrayList<Integer>(a); 
        if(list.size()==1 && (int)list.get(0)==0){
            System.out.println("0");
        }else if(list.size()==1 && (int)list.get(0)!=0){
             System.out.println("1");
        }
        else{
            if(list.get(0)== 0)
            System.out.println(list.size());
        }
        }
    }
    
}
