
package dynamic_pro;

import java.util.Scanner;

public class Dynamic_pro {
    static int cache[];
   
    public static int rob1(int a[],int i){
        if(a==null || a.length==0)
            return 0;
        if(a.length==1)
            return a[0];
        if(i<0)
            return 0;
        int house_is_selected=rob1(a,i-2)+a[i];
        int house_not_selected=rob1(a,i-1);
        
        return Math.max(house_is_selected,house_not_selected);
        
    }
 
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int l=in.nextInt();
       int a[]=new int[l+1];
        for (int i = 0; i < l; i++) {
            a[i]=in.nextInt();
        }
        System.out.println(rob1(a,l));
      //rob1(a,l);
    }
    
}
