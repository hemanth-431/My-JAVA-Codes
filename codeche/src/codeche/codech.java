package codeche;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class codech
{
	public static void main (String[] args) throws java.lang.Exception
	{ try{
	    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);         
    String input = br.readLine();
	   
	   // String input = "AFCCXBXSCY";
	    String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   
    int replace[] = new int[input.length()];
    int k =0;
	HashMap<String , Integer> map = new HashMap<>();
	for (int f = 0; f < alphabets.length(); f++)
      {   
        map.put(alphabets.substring(f,f+1),f);
}
for (int f = 0; f < input.length (); f++)
      {           
         if (map.containsKey(input.substring(k,k+1)))  
        { 
             replace[f] += map.get(input.substring(k,k+1)); 
        } 
          k++;
      }
          
       //////////////////////////////////
       String key1 = br.readLine();
       String key2 = br.readLine();
       int k1=Integer.parseInt(key1);
       int k2=Integer.parseInt(key2);
       int k2_inverse = 0; 
       for(int g=0 ; g<26;g++){
           if((k2*g)%26 == 1){
               k2_inverse  = g;
          
               
           }
       }
       
       
       int function[] = new int[replace.length];
       for(int i =0 ; i < replace.length; i++){
       function[i] = ((replace[i]-k1)*(k2_inverse))%26;
       if(function[i]<0){
           function[i]=26+function[i];
       }
	}
	    
	    //////////////////////////////
	    String final_answer = "";k=0;
	    	HashMap< Integer,String> reverse_map = new HashMap<>();
	    	for (int f = 0; f < alphabets.length(); f++)
      {   
        reverse_map.put(f,alphabets.substring(f,f+1));
}
	    for (int f = 0; f < function.length; f++)
      {           
         if (map.containsValue(function[f])) 
        { 
             final_answer += reverse_map.get(function[f]);
        } 
          k++;
      }System.out.println(final_answer); 
          
}///////////////////// try close
	    catch(Exception e){
	        return;
	    }
	    
	}
}
