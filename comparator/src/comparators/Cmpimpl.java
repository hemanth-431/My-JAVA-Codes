
package comparators;
import java.util.Comparator;
public class Cmpimpl implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
      if(o1%10<o2%10)
          return 1;
     
      return -1;
    }
    
}
