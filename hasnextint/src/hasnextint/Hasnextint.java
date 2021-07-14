
package hasnextint;

import java.util.Scanner;

public class Hasnextint {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        boolean b=in.hasNextInt();
        if(b)
        {
        int l=in.nextInt();
        System.out.println(l);
        }
    }
    
}
// it takes only one value for both 'l' && 'b'........,; 