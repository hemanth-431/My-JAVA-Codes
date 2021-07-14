
package propertyes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Propertyes {

    
    public static void main(String[] args) throws IOException {
       Properties  p=new Properties();
       //to store in a file
       OutputStream os=new FileOutputStream("properties.txt");
       p.setProperty("unane","Hemanth");
       p.setProperty("url","180030431" );
       p.setProperty("Pascode","Hello");
       p.store(os, null);
       
       InputStream is=new FileInputStream("properties.txt");
         p.load(is);
         System.out.println(p.getProperty("Pascode"));
             System.out.println(p.getProperty("url"));
       
    }
    
}
