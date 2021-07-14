
package additivenum;

import java.math.BigInteger;
import java.util.Scanner;

public class Additivenum {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        BigInteger num=new BigInteger(s);
        
     //   System.out.println();
        for (int i = 1; i < s.length(); i++) {
       BigInteger a=new BigInteger(s.substring(0,i));
            for (int j = i; j < s.length()-1; j++) {
                BigInteger b=new BigInteger(s.substring(i,j+1));
                Additivenum nm=new Additivenum();
                nm.helper(a,b,s.substring(j+1));
                
            }
        }
        
    }
    public boolean helper(BigInteger a,BigInteger b,String s){
        a=a.add(b);
        String sa=a.toString();
        if(s.indexOf(sa)==0 && helper(b,a,s.substring(sa.length())))
        return true;
        return false;
    
}
    
}
