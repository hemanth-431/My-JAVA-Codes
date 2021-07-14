
package javaapplication201;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class JavaApplication201 {
int s=0;
    public int sum(int n)
    {
        s=s+(int) Math.pow(n,2);
       
        if(n!=0)
        sum(--n);
        
            return s;
    }
    
    public static void main(String[] args) {
 JavaApplication201 obj=new JavaApplication201();
int pro= obj.sum(5);
        System.out.println(pro);
        
    }
    
}
