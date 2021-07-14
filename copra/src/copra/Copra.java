
package copra;
import java.util.*;
public class Copra {

    public static void main(String[] args) {
        TreeSet h=new TreeSet();
        h.add(89);
        h.add(67);
        System.out.println(h);
        Scanner in=new Scanner(System.in);
    //  StringBuffer a=new StringBuffer();
  //    a.append(in.nextLine());
    
      
       StringTokenizer st = new StringTokenizer(in.nextLine());
        System.out.println(st.hashCode());
      
      /*  int b[]=new int[26];
        for (int i = 0; i <=26; i++) {
            b[i]=0;
        }
        for (int i = 0; i < a.length(); i++) {
           b[a.charAt(i)-'a']++;
            
        }
        for (int i = 0; i <=26; i++) {
            
            System.out.print(b[i]+" ");
        }*/
       
    }
    
}
