package code;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Code {
    public static void main(String args[]) {
        int t, n, k;
        String str_k;

        Scanner in = new Scanner(System.in);
        t = Integer.parseInt(in.nextLine());

       
        for(;t != 0; t--) {
            
            n = Integer.parseInt(in.nextLine());
            str_k = in.nextLine();
            k = getMod(str_k, n);	
            
            int ones_cnt = k;
            int zeros_cnt = n - k;
            
            if (n%2 != 0 || !(n%2 == 0 && k == n/2) ) {
                if (zeros_cnt < ones_cnt) {
                    System.out.println(zeros_cnt*2);
                } else {
                   
                    System.out.println(ones_cnt*2);
                }
            } else {
                System.out.println(ones_cnt*2 - 1);
            }

        

        }
    }

    public static int getMod(String number, int mod_num) 
    { 
        int res = 0; 
  
        for (int i = 0; i < number.length(); i++) 
            res = (res * 10 + (int)number.charAt(i) 
                                     - '0') % mod_num; 
  
        return res; 
    }

    public static int countAbsSums(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i=0; i<arr.size()-1; i++) {
            sum += Math.abs(arr.get(i) - arr.get(i+1));
        }
        return sum;
    }
}