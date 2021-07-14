
package swing3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
//import java.io.FileNotFoundException;
//import java.util.logging.Level;
//import java.util.logging.Logger;


public class Swing3 {

    public static void main(String[] args)throws IOException {
      
        // FileOutputStream fos=new FileOutputStream("demo.txt");
        //DataOutputStream dos=new DataOutputStream(fos);
       // dos.writeUTF("Demo Content   burst");
       // dos.writeUTF("hfihihrg");
        
  int c=0;
        FileInputStream fis=new FileInputStream("C:\\Users\\user\\Documents\\NetBeansProjects\\swing3\\kill.txt");
        int i;
        StringBuffer a=new StringBuffer();
        while((i=fis.read())!=-1)
        {
       a.append((char)i);
        c++;}
        System.out.println(c);
        for (int j = 0; j < c; j++) {
            System.out.print(a.charAt(j));
        }
        
     //   while((i=fis.read())!=-1)
        //     System.out.print((char)i);
        }
       
       
         

           
           
       }
       
    
    

// fin.read!=-1