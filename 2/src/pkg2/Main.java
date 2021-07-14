
package pkg2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList a=new ArrayList();
        for (int i = 0; i < in.nextInt() ; i++) {
            a.add(in.nextInt());
        }
        int p=in.nextInt();
        int c=0;
        for (int i = 0; i <a.size() ; i++) {
            if(p==a.get(i))
                System.out.println(a.indexOf(p));
                c++;
        }
        if(c==0)
            System.out.println("-1");
    }
    
}
