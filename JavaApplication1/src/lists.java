
import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

public class lists {
    public static void main(String[] args){
        
    
   Scanner in = new Scanner(System.in);
   int t=in.nextInt();
   ArrayList list=new ArrayList();
int i,j;   
   for(j=0;j<t;j++)
   {
     i=in.nextInt();
     list.add(i);
     
   }
   
    System.out.println(list);
}
}