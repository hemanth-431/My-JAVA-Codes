
package call;

public class Call {

    public static void main(String[] args) {
     
       hello h=new hello();
       h.i=989;
       hi obj=new hi(h);
        
        
    }

  
    
}
  class hello
       {
           int i;
       
       }
class hi
{
   hi(hello h1) {
        System.out.println(h1.i);
    }}