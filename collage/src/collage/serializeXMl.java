
package collage;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class serializeXMl {
    public static void main(String[] args)throws IOException{
        try {
            Student1 s1=new Student1();
            s1.setRoll(101);
            s1.setName("hemanth");
            Student1 s2=new Student1();
            s2.setRoll(102);
            s2.setName("babblu");
            List<Student1> s=new ArrayList<>();
            s.add(s1);
            s.add(s2);
            
            Collage c = new Collage();
            c.setStudents(s);
            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("student.xml")));
                x.writeObject(c);
                x.close();
            }
        catch (FileNotFoundException ex) {
            Logger.getLogger(serializeXMl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
