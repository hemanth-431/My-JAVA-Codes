package practice2;
import java.util.*;
public class Practice2 {

   
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     String a=in.nextLine();
     int k=0;
     int replace[]=new int[a.length()];
     String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     HashMap<String,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.substring(i,i+1), i);
           
        }
       
	for (int f = 0; f < a.length (); f++)
      {           
         if (map.containsKey(a.substring(k,k+1)))  
        { 
            
            System.out.println("hi");
             replace[f] += map.get(a.substring(k,k+1)); 
        } 
          k++;
      }
        
         System.out.println(map);
         for (int i = 0; i < a.length(); i++) {
             System.out.println(replace[i]);
        }
        
    }
    
}
