
package comparators;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.Comparator;

public class Comparators {

 
    public static void main(String[] args) {


       ArrayList<Integer> values=new ArrayList<>();
       values.add(5674);
       values.add(68);
       values.add(172);
       values.add(1,849);
       Comparator<Integer> cmp=new  Cmpimpl();
        
   sort(values,cmp);
       
       for(Object i:values){
           System.out.println(i);
       }
       
    }
    
}
//vector v=new vector();
// LinkedList<Integer> values=new LinkedList();