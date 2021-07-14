
package pkgclass.in.pkgclass;

interface b {
    
}
public class ClassInClass {

    

    public static void main(String[] args)throws Exception {
        Class c=Class.forName("pkgclass.in.pkgclass.b");
        System.out.println(c.isInterface());
    }
    
}
