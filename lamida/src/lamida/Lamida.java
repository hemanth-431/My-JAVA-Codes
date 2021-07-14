
package lamida;
public class Lamida {

  
    public static void main(String[] args) {
        a obj=() -> {
            System.out.println("hi");
        };
        obj.show();
    }
    
}
@FunctionalInterface
interface a{
   void show();
}