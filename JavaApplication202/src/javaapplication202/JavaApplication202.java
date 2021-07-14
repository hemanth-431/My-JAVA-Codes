
package javaapplication202;

import java.util.logging.Level;
import java.util.logging.Logger;

class one extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            
        
        System.out.println("hi");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
    }
    }
}
class two implements Runnable
{
    public void run()
    {
        
        for (int i = 0; i < 5; i++) {
            
        
        System.out.println("hello");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            
        }
    }}
}
public class JavaApplication202 {

    public static void main(String[] args) {
        one obj=new one();
        Thread t1=new Thread(new two());
       
        
        obj.start();
       t1.start();
    }
    
}
