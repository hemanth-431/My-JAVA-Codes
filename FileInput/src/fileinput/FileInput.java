
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class FileInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        StringBuilder ss=new StringBuilder();
        
        try {
            InputStreamReader r=new InputStreamReader(new FileInputStream("C:\\Users\\user\\Desktop\\SEQuestions.txt"));
            int data=r.read();
            while(data!= -1)
            {
               ss.append((char)data);
                data=r.read();
            }
            System.out.println(ss);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
