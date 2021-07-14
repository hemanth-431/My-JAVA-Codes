
package fourth;


public class Fourth {

    
    public static void main(String[] args) {
        
    int c;
        c=6;
        boolean b= perfect(c);
        if(b==true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static boolean perfect(int c){
        int sum=0;
         for (int i = 1; i < c; i++) {
             if(c%i==0)
                 sum=sum+i;}
         if(sum==c)
             return(true);
         else
             return(false);
    }
            
        
              
                
            
            
            System.out.println(" ");
            
        }
  
    }
    

