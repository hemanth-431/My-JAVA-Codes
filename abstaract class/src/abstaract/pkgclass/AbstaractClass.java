package abstaract.pkgclass;
public class AbstaractClass {

    public static void main(String[] args) {
        phone obj=new moto();
        obj.call();
        obj.dance();
        obj.games();
        obj.movie();
    }
    
}
abstract class phone 
{
  
        public void call(){
            System.out.println("call"); 
            
        }
        public abstract void dance();
        public abstract void movie();
        public abstract void games();
        
    }
 abstract class iphone extends phone  {
    public void dance()
    {
        System.out.println("dance");
    }
    
    
}
 class moto extends iphone{
    public void movie()
    {
        System.out.println("movie");
    }
    public void games()
    {
        System.out.println("games");
    }
}

