/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author user
 */
public class Practices {

   
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
       ArrayList a=new ArrayList();
      int t=in.nextInt();
       for (int i = 0; i < t; i++) {
            long k=in.nextLong();
            int n=in.nextInt();
           int p=in.nextInt();
            for (int j = 0; j < n; j++) {
                a.add(in.nextInt());
            }
            Set b=new HashSet(a);
           if( b.equals("8"))
               System.out.println("ho");
              a.sort(null);
              if(p==0)
              {
        int max=(int)a.indexOf((int)a.get(n-1));
          
                   int nu=(int)Math.min((int)a.get(max+1),(int)a.get(max-1));
           if(k%2!=0)
                      System.out.println(a.get(max));
           else
                      System.out.println(nu);
        }
              else
              {
        int mi=(int)a.indexOf((int)a.get(0));
          
                   int nu=(int)Math.max((int)a.get(mi+1),(int)a.get(mi-1));
           if(k%2!=0)
                      System.out.println(a.get(mi));
           else
                      System.out.println(nu);
   }
}

    }
}