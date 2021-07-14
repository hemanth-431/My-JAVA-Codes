
package strongnumber;

public class Strongnumber {
static int mul=1;
    static int fact(int n){
        mul=mul*n;
        if(n>1)
       return fact(n-1);
        
        return mul;
    }
   
    public static void main(String[] args) {
        int n=145;
        int sum=0;
        while(n>9){
         sum+=fact(n%10);
            mul=1;
            n=n/10;
        }
        System.out.println(sum+n);
        
    }
    
}
