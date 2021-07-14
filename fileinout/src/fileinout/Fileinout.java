
package fileinout;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Fileinout {

   
    public static void main(String[] args) {
        // TODO code application logic here
        employee obj=new employee();
        obj.id=1800;
        obj.name="hhdjjf";
        obj.salary=202.0;
        
      try{
          FileOutputStream fout=new FileOutputStream("one");
        ObjectOutputStream obj1=new ObjectOutputStream(fout);
        obj1.writeObject(obj);
      fout.close();
      obj1.close();
       FileInputStream fin=new FileInputStream("one");
     ObjectInputStream in=new ObjectInputStream(fin);
   employee ob=(employee) in.readObject();
          System.out.println(ob.id);
          System.out.println(ob.name);
          System.out.println(ob.salary);
      }
      catch(Exception e){
            
        }
        
    }
    
}
