
package six;
import java.util.Scanner;
public class Six {


    public static void main(String[] args) {
        String str,rev="";
             Scanner in =new Scanner(System.in);
              str=in.nextLine();
              int len=str.length();
              for (int i =len-1; i >=0; i--) 
                  { rev=rev+str.charAt(i);}
        StringBuilder st=new StringBuilder();
        st.append(str);
        st.append("dihc");
        System.out.println(st.reverse());
        System.out.println(rev);
                  
            
       
             
    }
    
}
