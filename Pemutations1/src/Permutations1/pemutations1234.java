/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutations1;


/**
 *
 * @author user
 */
public class pemutations1234 {

    static public void hi(char[] s,String s1)
    {
        int l=s.length;
        int k=3;
        hello(l,s,s1,k);
    }
  static public void hello(int i,char[] s,String s1,int k)
   {
       
       if(k==0)
       {
           System.out.println(s1);
           return;
       }
       for (int j = 0; j < i; j++) {
           String  str=s1+s[j];
          
           hello(i,s,str,k-1);
       }
   }
   
    public static void main(String[] args) {
    
        String s="abcdef";
        char[] c=new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i]=s.charAt(i);
        }
       
      hi(c," ");
     
   
    }
    
}
