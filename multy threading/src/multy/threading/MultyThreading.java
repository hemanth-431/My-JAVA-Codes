
package multy.threading;

import java.util.logging.Level;
import java.util.logging.Logger;
public class MultyThreading {

  public static void main(String[] args) {
      new Thread(()-> {new MultyThreading().show("Hi");}).start();
      try {
          Thread.sleep(10);
      } catch (InterruptedException ex) {
          Logger.getLogger(MultyThreading.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    new Thread(()-> {new MultyThreading().show("Hello");}).start();
}
  public void show(String str){
       for(int i=0;i<5;i++)
    {
        try {
            System.out.println(str);
            Thread.sleep(100);
        } catch (InterruptedException ex) {
           
        }
    
  }
}
}