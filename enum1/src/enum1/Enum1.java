
package enum1;


public class Enum1 {

  
    public static void main(String[] args) {
        abc obj=abc.INSTANCE;
       obj.i=7;
       obj.show();
       abc obj2= abc.INSTANCE;
       obj2.i=8;
       obj.show();
       System.out.println(abc.INSTANCE);
        
    }
    
}
enum abc
{
    INSTANCE;
    int i;
   public void show()
   {
       System.out.println(i);
   }
}


//JAV DATA BASE CONNECTIVITY
