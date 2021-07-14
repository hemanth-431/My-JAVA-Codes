
package hashmapset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hashmapset {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<>();
        int l=in.nextInt();
        for (int i = 0; i < 10; i++) {
            a.add(in.nextLine());
        }
       Collections.sort(a);
       
    }
    
}
