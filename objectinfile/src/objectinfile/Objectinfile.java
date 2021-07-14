
package objectinfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Objectinfile {

   
    public static void main(String[] args) throws Exception {
       
        save obj=new save();
        obj.i=4;
        FileOutputStream fos=new FileOutputStream("hi.txt");
        ObjectOutputStream os=new ObjectOutputStream(fos);
        os.writeObject(obj);
        
        FileInputStream fis=new FileInputStream("hi.txt");
        ObjectInputStream is=new ObjectInputStream(fis);
      
      save hi=  (save) is.readObject();
        System.out.println(obj.i);
    }
    
}
class save implements Serializable{
    int i;
}