
import java.util.LinkedList;


public class Pemutations { 

    static void printPermutn(String str, String ans) 
    { 
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
         return;
        }
       
        for (int i = 0; i < str.length(); i++) { 
            
            char ch = str.charAt(i); 
  
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
           
            printPermutn(ros, ans+ch); 
        } 
    } 

    public static void main(String[] args) 
    { 
        String s = "abc"; 
        
       LinkedList<Integer> a=new LinkedList<>();
       int rem=0;
       a.add(1);
       a.add(0);
       a.add(1);
       int i=0;
       while(a.size() != 0){
        rem=(int)a.get(i) * (int)Math.pow(2, i);
	
		
	
       
       }
    System.out.println(rem);
    } 
} 