
package property.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyInput {

    
    public static void main(String[] args) throws IOException {
       Properties  p=new Properties();
       //to store in a file
       InputStream is=new FileInputStream("properties.txt");
      
         p.load(is);
         System.out.println(p.getProperty("Pascode"));
       
       
       
    }
    
}
