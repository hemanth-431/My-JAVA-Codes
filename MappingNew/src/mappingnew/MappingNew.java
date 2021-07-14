/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappingnew;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import javafx.util.Pair;

/**
 *
 * @author user
 */
public class MappingNew {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       Properties props = new Properties();  
        for (int i = 0; i < 3;) {
           i++;
              String s=in.nextLine();
            String s1=in.nextLine();
            
props.setProperty(s,s1); // (key, value)
            
        }
     

    }
    
}
