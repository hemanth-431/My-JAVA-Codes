/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionioe;

import java.io.IOException;
import java.util.Scanner;
public class ExceptionIOE {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException{
        Scanner in=new Scanner (System.in);
        int i;
        String j;
        int k;
        i=in.nextInt();
        j=in.nextLine();
        int l=Integer.parseInt(j);
        k=i+l;
        System.out.println(k);
        
        // TODO code application logic here
    }
    
}
