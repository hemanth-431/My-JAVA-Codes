
package polymorphism;

class movie
{
    private String name;

    public movie(String name) {
        this.name = name;
        System.out.println(name);
    }
    public String plot(){
        return "hello";
    }
}
class jaws extends movie{

    public jaws() {
        super("jaws");
        System.out.println("hi");
    }
    
    public String plot(){
        return "defj";
    }
}
class indi extends movie{

    public indi() {
        super("efhrf");
    }

    @Override
    public String plot() {
      return "hfv"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
public class Polymorphism {

    public static void main(String[] args) {
       
    }
    public static movie randommovie(){
    int random=1;
    new jaws();
    return null;
    }
}
