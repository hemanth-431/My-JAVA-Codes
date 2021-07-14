package Inver;

import java.util.ArrayList;
import java.util.Scanner;

public class inver { 
     public static void main(String[] args) 
    { 
    Scanner in=new Scanner(System.in);
    int test=in.nextInt();
        for (int k = 0; k < test; k++) {
            
        
    ArrayList a=new ArrayList();
    int t=in.nextInt();
    int temp;
        for (int i = 0; i < t; i++) {
            a.add(in.nextInt());
        }
        int c = 0; 
        for (int i = 0; i < t - 1; i++) 
            for (int j = i + 1; j < t; j++) 
                if ((int)a.get(i) > (int)a.get(j))
                    c++; 
  a.sort(null);
        for (int i = 0; i < t; i++) {
            System.out.print(a.get(i)+" ");
        }
        System.out.println("\n");
        System.out.println(c);
    
        }
    
 
       
    } 
} 