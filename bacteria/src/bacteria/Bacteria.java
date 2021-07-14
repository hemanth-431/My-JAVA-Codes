
package bacteria;

import java.util.Scanner;


public class Bacteria {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        for (int i = 0; i < 5; i++) {
            a=a-(float)(a*0.0028);
            
        }
        double b=2.43;
        System.out.println("The Bacteria is "+Math.round(a));
    }
    
}
