/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author user
 */
public class Fileoutput {

     public static void main(String[] args) throws IOException {
        StringBuilder ss=new StringBuilder();
        
        try {
               
          OutputStreamWriter r=new OutputStreamWriter(new FileOutputStream("C:\\Users\\user\\Desktop\\SEQuestions.txt"));
          InputStreamReader r1=new InputStreamReader(new FileInputStream("C:\\Users\\user\\Desktop\\SEQuestions.txt"));
           r.write("hello\n");
           
            r.close();
            char encoding = (char) r1.read();
            while(encoding!='\n')
            {    System.out.println(encoding);
            encoding=(char)r1.read();}
            
            
        } catch (FileNotFoundException ex) {
            
        }}
}
