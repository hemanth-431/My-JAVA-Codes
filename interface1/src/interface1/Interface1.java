
package interface1;
interface abc{
    void show();
}
interface xyz{
    
}
interface fox extends abc,xyz{
    //interface supports multiple inheritence//////
}
public class Interface1 {

  
    public static void main(String[] args) {
    abc obj= () -> System.out.println("hith");
    obj.show();
    }

    
}
