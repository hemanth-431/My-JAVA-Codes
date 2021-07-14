/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Filereader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
     //   FileReader fr=new FileReader("C:\\Users\\user\\Desktop\\SEQuestions.txt");
     
         FileWriter fr=new FileWriter("C:\\Users\\user\\Desktop\\SEQuestions.txt");
       BufferedWriter br=new BufferedWriter(fr);
        for (int i = 0; i < 3; i++) {
            String s="bbbbbbbbbb";
            try {
               br.append(s);
            } catch (IOException ex) {
                Logger.getLogger(Filereader.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
