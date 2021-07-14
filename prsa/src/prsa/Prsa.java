
package prsa;

import java.util.ArrayList;
import java.util.Scanner;

public class Prsa {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StringBuilder s=new StringBuilder();
        ArrayList l=new ArrayList();
        int z=in.nextInt();
        for (int i = 0; i < 3; i++) {
            s.append(in.nextLine());
            l.add(s.length());
        
        }
       
        
        System.out.println(z);
        System.out.println(l);
        System.out.println(s);
    }
    
}
