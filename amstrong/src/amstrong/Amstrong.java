
package amstrong;
import java.io.*;
import java.util.*;
public class Amstrong {
    static double sum=0;
 static double fact(int n){
       
        if(n>9)
        {   sum=sum+Math.pow(n%10,3);
          //  System.out.println(n%10);
       return fact(n/10);}
        
       // System.out.println(n);
        return sum+Math.pow(n,3);
    }
    public static void main(String[] args) {
     int n=153;
        System.out.println((int)fact(n));
    }
    
}
