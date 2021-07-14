
package nested.classes;

class outer
{
    int a=10;
    static int b=30;
    static class inner
    {
        void m1(outer x)
        {
            System.out.println("b= "+b);
            System.out.println("a= "+x.a);
        }
        static void m2(outer x)
        {
            System.out.println("b= "+b);
            System.out.println("a= "+x.a);
        }
    }
    inner obj=new inner();
}
public class NestedClasses {

    public static void main(String[] args) {
        outer obj1=new outer();
        obj1.obj.m1(obj1);
        obj1.obj.m2(obj1);
    }
    
}
