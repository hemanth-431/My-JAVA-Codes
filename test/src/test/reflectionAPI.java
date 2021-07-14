
package test;

import java.lang.reflect.Method;


public class reflectionAPI {
    public static void main(String[] args) throws Exception{
        
         Class c= Class.forName("test.Test");
         Test t=(Test)c.newInstance();
         Method m=c.getDeclaredMethod("show", null);
         m.setAccessible(true);
         m.invoke(t,null);
         
         
    }
    
   
}
