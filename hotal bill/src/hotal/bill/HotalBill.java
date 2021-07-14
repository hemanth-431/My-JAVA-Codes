
package hotal.bill;

import java.util.Scanner;


public class HotalBill {

  
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float d=0;
       int a=in.nextInt();
      
       float gst=(float)0.06*a;
        System.out.println("Gst is "+gst);
        if(a>1000)
        {
           float f=(float)(0.1*a);
            System.out.println("The Discount is "+f);
            float l=a-f;
            System.out.println("The Amount to be Paid is "+l);
        }
        if(a<1000)
        {
          float f=(float)(0.05*a);
            System.out.println("The Discount is "+f);
            float l=a-f;
            System.out.println("The Amount to be Paid is "+l);
        }
    }
    
}
