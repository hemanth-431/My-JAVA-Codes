
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
static int r=0,count=1;
    static void hell(ArrayList<Integer> a,int k){
        if(a.size()==1)
        { System.out.println(a.get(0));}
        else 
        if(a.size()>=k){
            if((r+k)>(a.size()))
            { r=r+k-a.size()-1;
            a.remove(r);
         //   r=(r+1)%a.size();
            hell(a,k);
            }else{
            a.remove(r+k-1);
            r=(r+1)%a.size();
            hell(a,k);}
        }
        else
        {
        
  if(count!=k){
           r=(r+1)%a.size();
           count++;
           hell(a,k);
  }
  else{
      count=1;
      a.remove(r);
      hell(a,k);
  }
           
        }
     
        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(i+1);
        }
        int k=in.nextInt();
       hell(a,k);
    }
    
}
