
package codechef8;

import java.util.*;

public class Codechef8 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList a=new ArrayList();
        int n=in.nextInt(),c=0,d=0;
        int k=in.nextInt();
        int p=in.nextInt();
        for (int i = 1; i <=n; i++) {
            a.add(in.nextInt());
            
        }
        a.sort(null);
        for (int i = 1; i <=k; i++) {
            { if(((int)a.get(i+1)-(int)a.get(i))<=p)
                c++;}
            
                
            }
        System.out.println(c+" "+k);
          if(c==k)
        { for (int j = 2; j < k; j++) {
                    for (int l = j+1; l <=n; l++) {
                        if(((int)a.get(l)-(int)a.get(j))<=p)
                            d++;
                    }
            }
        }
      
            System.out.println(d);
        }
        
    }
    
    

