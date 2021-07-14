
package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        // TODO code application logic here
        a obj=new a();
        obj.add();
       obj.sub();
    }
    
}
class a extends b
{
    public void add(){
        System.out.println("hi");
    }
}
class b 
{
    public void sub()
    {
        System.out.println("hello");
    }

}
