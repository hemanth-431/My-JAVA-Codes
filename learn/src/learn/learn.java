package learn;
import java.io.*;
import java.util.*;

import static java.lang.Math.*;


public class learn{
    public static void main(String[] args) {
        try {
            Reader br = new Reader();
            PrintWriter out = new PrintWriter(System.out);

            int T = br.num();
            for(int l = 0; l < T; l++){
                int[] x = br.arr(2);
                int N = x[0];
                int Q = x[1];
                String s = br.line();
                TreeSet<Integer> works = new TreeSet<Integer>();

                for(int i = 0; i < s.length()-2;i++){
                    if(s.charAt(i+1) == s.charAt(i)){
                        works.add(i-1);
                        works.add(i);
                    }else if(s.charAt(i+2) == s.charAt(i)){
                        works.add(i);
                    }else if(s.charAt(i+1) == s.charAt(i+2)){
                        works.add(i);
                    }
                }

                //System.out.println(works);

                for(int i = 0; i < Q; i++){
                    x = br.arr(2);
                    int A = x[0]-1;
                    int B = x[1]-1;

                    if(works.lower(B-1) == null){
                        out.println("NO");
                        continue;
                    }
                    int test = works.lower(B-1);

                    if(test >= A){
                        out.println("YES");
                    }else{
                        out.println("NO");
                    }
                }
//                int[][] dp = new int[N+1][26];
//                for(int i = 1; i < N; i++){
//                    for(int j= 0; j < 26; j++){
//                        dp[i][j] = dp[i-1][j];
//                    }
//                    dp[i][s.charAt(i-1) - 'a']++;
//                }
//
//                for(int i = 0; i < Q; i++){
//                    x = br.arr(2);
//                    int R = x[0];
//                    int L = x[1];
//                    boolean works = false;
//                    for(int j = 0; j < 26; j++){
//                        int num = dp[L][j] - dp[R-1][j];
//                        if(num > (L-R+1)/2){
//                            System.out.println((char)(j + 'a'));
//                            System.out.println(num);
//                            System.out.println((R-L+1)/2);
//                            works = true;
//                            break;
//                        }
//                    }
//                    System.out.println(works?"YES":"NO");
//                }

            }

            out.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    static class Reader {
        public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public int[] arr(int N) throws Exception {
            int[] ret = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                ret[i] = Integer.parseInt(st.nextToken());
            }
            return ret;
        }

        public int num() throws Exception {
            return Integer.parseInt(br.readLine());
        }

        public String line() throws Exception {
            return br.readLine();
        }
    }
}
