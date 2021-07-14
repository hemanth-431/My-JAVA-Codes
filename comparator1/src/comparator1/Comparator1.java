
package comparator1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator1 {

 
    public static void main(String[] args) {


       ArrayList<Integer> values=new ArrayList();
       values.add(5674);
       values.add(68);
       values.add(172);
       values.add(1,841);
       Comparator<Integer> cmp=new  Comparator<Integer>()
       {
                public int compare(Integer o1, Integer o2) {
      if(o1%10<o2%10)
          return 1;
     
      return -1;
      
    }

   
           
       };
        
   Collections.sort(values,cmp);
       
       for(Object i:values){
           System.out.println(i);
       }
       
    }
    
}
//vector v=new vector();
// LinkedList<Integer> values=new LinkedList();