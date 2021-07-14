
package pkginterface;

interface phone{
    void show();
}
interface iphone{
    void sh();
}
class change implements phone,iphone{
    public void show(){
        System.out.println("hello");
    }
    public void sh(){
        System.out.println("hi");
    }
}
public class Interface {

 
    public static void main(String[] args) {
        iphone obj=new change();
       phone obj1=new change();
        obj.sh();
        obj1.show();
    
        
        
    }
    
}
