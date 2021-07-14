package PRACTICE;
import java.util.*;
import java.lang.*;
import java.io.*;

public class practice
{
	public static void main (String[] args) throws java.lang.Exception
	{ try{
	    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);         
   // String input = br.readLine();
	   
	   // String input = "AFCCXBXSCY";
    StringBuffer alphabets=new StringBuffer();
	  alphabets.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
   HashMap<Character , Integer> map = new HashMap<>();
   for (int f = 0; f < alphabets.length(); f++)
      {   
        map.put(alphabets.charAt(f),f);
}

                    System.out.println(map);
               
 

}///////////////////// try close
	    catch(Exception e){
	        return;
	    }
	    
	}
}