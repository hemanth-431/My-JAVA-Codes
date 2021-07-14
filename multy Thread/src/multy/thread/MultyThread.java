
package multy.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultyThread {

    public static void main(String[] args) {
       a obj=new a();
       obj.start();
       b obj1=new b();
       Thread t=new Thread(obj1);
       t.start();
    }
    
}
class a extends Thread{
    public void show(){
    for(int i=0;i<5;i++)
    {
        try {
            System.out.println("hi");
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    public void run(){
        show();
    }
}


class b implements Runnable{
    
     public void run(){
            for(int j=0;j<5;j++)
    {
        try {
            System.out.println("hello");
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(b.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
}

/* Insted of class b
 
Runnable r=new Runnable{
public void run{
for(int i=0;i<5;i++)
{
System.out.println('Hello");
try{Thread.sllep(1000);;} catch(,.....)
}
} };
Thread t=new Thread(r);
t.start();

*/

//or

/* Thread t=new Thread(()->for(int i=0;i<5;i++)
{
System.out.println('Hello");
try{Thread.sllep(1000);;} catch(,.....)
}
}
t.start();
*/