
package pattern;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        char a[][]=new char[100][100];
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                a[i][j]=' ';
            }
            
        }
        
        for (int l = 0; l < t; l++) {
         
          a[0][l]='*';

        }
                for (int i = 1; i < t-1; i++) {
                    
                        a[i][i]='*';
  
        }
             for (int i = 1; i <t-1; i++) {
                 
                     a[i][t-1-i]='*';
                     
                 
            
        }
                for (int i = 0; i < t; i++) {
                    a[t-1][i]='*';
            
        }
                for (int i = 1; i < t-1; i++) {
                    a[i][0]='*';
            
        }
                for (int i = 1; i <t-1 ; i++) {
                    a[i][t-1]='*';
            
        }
                for (int i = 0; i < t; i++) {
                    for (int j = 0; j < t; j++) {
                        System.out.print((char)a[i][j]);
                    }
                    System.out.println("");
        }
    }
    
}
