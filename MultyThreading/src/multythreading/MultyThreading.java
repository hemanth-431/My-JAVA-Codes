
package multythreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultyThreading {

    public static void main(String[] args) {
       a obj=new a();
       obj.start();
       b obj1=new b();
       obj1.start();
    }
    
}
class a extends Thread
{
    public void show(){
    for(int i=0;i<5;i++)
    {
        try {
            System.out.println("hi");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    public void run(){
        show();
    }
}


class b extends Thread{
    public void show(){
    for(int j=0;j<5;j++)
    {
        try {
            System.out.println("hello");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(b.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
     public void run(){
        show();
    }
}