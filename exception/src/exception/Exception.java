
package exception;

public class Exception {

    
    public static void main(String[] args)throws InterruptedException {
       
            int i=0;
            int j=3,k=0;
             try{
            k=j/i;
        }
        catch(ArithmeticException z)
        {
            System.out.println(z);
        }
        System.out.println(k);
    }
    
}
