
package class1;

import java.util.Scanner;

public class Class1 {

   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float f=in.nextInt();
        for (int i = 0; i < 5; i++) {
              f=(float) (f-(float)f*0.0028);
        }
       
      
        System.out.println(f);
    }
    
}
