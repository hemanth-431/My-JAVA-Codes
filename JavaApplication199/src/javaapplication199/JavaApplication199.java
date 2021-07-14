
package javaapplication199;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class person
        {
    private int no;
    private String name;
    person()
    {
        this.no=90;
        this.name="dkdk";
    }
    void show()
    {
        System.out.println("hi");
    }
}
class student extends person
{

   student()
   {
       
person obj=new person();
       obj.show();
   }

   
    
}
public class JavaApplication199 {

    
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("z");
        a.add("p");
        Collections.sort(a);
        System.out.println(a);
        
        TreeSet obj=new TreeSet();
        
        obj.add(2);
        obj.add(0);
        obj.add(9);
        obj.add(3);
             obj.add(3);
        obj.remove(3);
        System.out.println(obj);
        
    }
    
}
