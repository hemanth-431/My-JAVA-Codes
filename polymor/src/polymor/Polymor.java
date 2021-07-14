
package polymor;

class hello
{
    private String name;
    private int i;
    public hello(String name,int i)
    {
        this.name=name;
        this.i=i;
        System.out.println(name);
        System.out.println(i);
    }
    public void show()
    {
        System.out.println("hehho");
    }
}
class hi extends hello
{

    public hi(String name, int i) {
        super(name, i);
        super.show();
    }
    

   
}
public class Polymor {

    public static void main(String[] args) {
        new hi("jiejf",8);
       
    }
    
}
