/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg180030431;

/**
 *
 * @author user
 */
public class M_in_n_no_and_possible_ways {

    static public void hi(char[] s,String s1)
    {
        int l=s.length;
        int k=3;
        hello(l,s,s1,k);
    }
  static public void hello(int i,char[] s,String s1,int k)
   {
      int l=0;
       
       if(k==0)
       {
         if(s1.charAt(1)!=s1.charAt(2) && s1.charAt(1)!=s1.charAt(3) && s1.charAt(2)!=s1.charAt(3))
              
           
           return;
       }
       for (int j = 0; j < i; j++) {
           String  str=s1+s[j];
          
           hello(i,s,str,k-1);
       }
   }
   
    public static void main(String[] args) {
    
        String s="123456789";
        char[] c=new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i]=s.charAt(i);
        }
       
      hi(c," ");
     
   
    }
    
}
