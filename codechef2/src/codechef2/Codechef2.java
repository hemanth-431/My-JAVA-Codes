
package codechef2;

import java.io.IOException;

public class Codechef2 {

  
    public static void main(String[] args)throws IOException {
        int a[]=new int[4];
        int j=0;
        int b[]=new int[3];
        a[0]=0;
        a[1]=2;
        a[2]=5;
        a[3]=8
                
                ;
      for(int i=0;i<4;i++){
          for(int k=i+1;k<4;k++){
            b[j]=a[k]-a[i];}
            j=j+1;
        
      }
      for(int i:b){
            System.out.println(i);
        
      }
    }
    
}
