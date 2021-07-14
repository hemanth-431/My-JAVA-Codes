
package handling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Handling {

  
    public static void main(String[] args)throws Exception{
        FileOutputStream fos=new FileOutputStream("demo.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("Demo Content   burst");
        dos.writeUTF("hfihihrg");
        FileInputStream fis=new FileInputStream("demo.txt");
        DataInputStream dis=new DataInputStream(fis);
        String str=dis.readUTF();
        String str1=dis.readUTF();
        System.out.println(str1);
         System.out.println(str);
        
    }
    }
    

