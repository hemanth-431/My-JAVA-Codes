
package hi;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Hi {

   
    public static void main(String[] args) {

a obj=new a();
obj.start();
b obj1=new b();
obj1.start();

        
        
        
        
    }
    
}
class a extends Thread{
    public void show()
    {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("hi");
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }}
    public void run()
    {
        show();
    }
}
    
    
class b extends Thread{
    
    public void run()
    {
       for (int i = 0; i < 10; i++) {
            try {
                System.out.println("hello");
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(a.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    }
}
   

