
package singleton;


public class Singleton {

 
    
    public static void main(String[] args) {
      abc x=abc.get();
      x.s=(x.s).toUpperCase();
        System.out.println(x.s);
        
     abc y=abc.get();
     y.s=(y.s).toLowerCase();
        System.out.println(y.s);
    }
    
}
class abc{
    private static abc obj=null;
    public String s;
     abc(){
        s="hjdfgsgfrg";
    }
            public static abc get()
            {
                if(obj==null)
                        obj=new abc();
                
              return obj;
            }
   
}