/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Codechef1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
          int count=0;
            int l=in.nextInt();
            String s=in.nextLine();
            for(int j=0;j<l;j++)
            {
            if('a'==s.charAt(j)|| 'e'==s.charAt(j)||'i'==s.charAt(j)||'o'==s.charAt(j)||'u'==s.charAt(j))
               count=count+1;
                }
           System.out.println(count);      
        }        
        // TODO code application logic here
       
    }
    

