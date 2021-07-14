
package collage;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

 public class deserialisation {
    public static void main(String[] args){
        try {
            XMLDecoder x=new XMLDecoder(new BufferedInputStream(new FileInputStream("student.xml") ));
            Collage c = (Collage)x.readObject();
            List<Student1> s= c.getStudents();
            for(Student1 value:s){
                System.out.println(value);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(deserialisation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
}
