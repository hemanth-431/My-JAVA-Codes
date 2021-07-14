
package dynamicpro;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Dynamicpro {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
      BigInteger bInt = new BigInteger(a);
       BigDecimal bIn = new BigDecimal(a);
      int p=9;
      BigDecimal bi=BigDecimal.valueOf(p);
        System.out.println(bIn.divide(bi));
    //    System.out.println(bInt.shiftRight(1));
        
        
    }
    
}
