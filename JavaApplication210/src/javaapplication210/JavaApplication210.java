
package javaapplication210;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication210 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
       
       ArrayList s=new ArrayList();
        for (int i = 0; i < n; i++) {
            s.add(in.nextLine());
        }
        Scanner on=new Scanner(System.in);
        int y=on.nextInt();
       ArrayList s1=new ArrayList();
        
        for (int i = 0; i < y; i++) {
            s1.add(in.nextLine());
           
        }
        System.out.println("jfk");
        for (int i = 0; i <y; i++) {
            count=0;
            for (int j = 0; j < n; j++) {
                if(s1.get(i).equals(s.get(j)))
                    count++;
            }
            System.out.println(count);
        }
        
    }
    
}
