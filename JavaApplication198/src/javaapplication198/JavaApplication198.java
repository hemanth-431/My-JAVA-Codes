
package javaapplication198;

import java.util.ArrayList;
import java.util.Collections;

class library
{
    int roll;
    String name;
    String initial;
    library(int roll,String name,String initial)
    {
        this.roll=roll;
        this.name=name;
        this.initial=initial;
    }
    public int roll()
    {
        return roll;
    }
    public String name()
    {
        return name;
}
    public String initial()
    {
        return initial;
    }
}
public class JavaApplication198 {

    public static void main(String[] args) {
        ArrayList l=new ArrayList();
       library obj1=new library(6,"honey","hdhnf");
       library obj2=new library(7,"babblu","hdhnf");
       library obj3=new library(8,"hemanth","cnknv");
        
        l.add(obj1.name);
        l.add(obj2.name);
        l.add(obj3.name);
        
        Collections.sort(l);
        for (int i = 0; i < (int)l.size(); i++) {
            if(l.get(i)==obj1.name)
                System.out.println(obj1.roll+" "+obj1.name+" "+obj1.initial);
            if(l.get(i)==obj2.name)
                System.out.println(obj2.roll+" "+obj2.name+" "+obj2.initial);
            if(l.get(i)==obj3.name)
                System.out.println(obj3.roll+" "+obj3.name+" "+obj3.initial);
        }
        
    }
    
}
