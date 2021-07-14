
package list;

import java.util.ArrayList;
import static java.util.Collections.reverse;
import static java.util.Collections.sort;


public class List {

    public static void main(String[] args)throws Exception {
       ArrayList<String> values=new ArrayList();
       values.add("jnf");
       values.add("dccne");
       values.add("ahev");
       values.add("abne");
   sort(values);
     reverse(values);
       for(Object i:values){
           System.out.println(i);
       }
       
    }
    
}
//vector v=new vector();
// LinkedList<Integer> values=new LinkedList();