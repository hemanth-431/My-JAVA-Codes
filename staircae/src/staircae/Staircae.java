
package staircae;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Staircae {

    public static void main(String[] args) {
       // String a[] = new String[] { "A", "B", "C", "D" };
       // int c[] = new int[] { 3, 3, 2, 2 };
        int b[][]=new int[][] {{-2, 0, 3, -5, 2, -1}, {0, 2}, {2, 5}, {0, 5}};
    //  List<Integer> list=Arrays.asList(a);
        int n=b.length-1;
        int sum=0;
        Staircae s=new Staircae();
        int i=0;
      //  System.out.println(i+" "+j);
       
        System.out.println(s.sumRange(b,i,n,sum));
    }
      int sumRange(int b[][],int i,int n,int sum) {
          sum+=sumRange(b,b[n][0],n-1,sum);
        return sum;
        
    }
    
}
