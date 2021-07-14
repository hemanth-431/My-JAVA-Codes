


package dynamic_pro;

import java.util.Scanner;

public class staricase {
    public static void main(String args[]){
    //    Scanner in=new Scanner(System.in);
        int n=3;
        int a[]=new int[n+1];
        staricase s=new staricase();
        System.out.println(s.stair(a,n));
        
    }
    int stair(int dp[],int n){
        
      if (n < 0)
			return 0;
		if (n == 0)
			return 1;
		if (dp[n] != 0) {
			return dp[n];
		} else {
			return dp[n] = stair(dp,n - 1) + stair(dp,n - 2);
		}

      
    }
}
