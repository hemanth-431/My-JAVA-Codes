
package polymorphysam;

class hello 
{
    String name;
    public hello(String name)
    {
        this.name=name;
        System.out.println(name);
    }
    public String plot()
    {
        return "no plot Here";
    }
}
class hi extends hello
{
    public hi(){
    super("jf");
}
}
public class Polymorphysam extends hi {

    public static void main(String[] args) {
       
       new hi();
       int r=(int)(Math.random()*5)+1;
        System.out.println(r);
        
       
    }
    
}
