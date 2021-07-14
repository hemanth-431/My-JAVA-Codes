
package extend.inheritence;

public class ExtendInheritence {

  
    public static void main(String[] args) {
        // TODO code application logic here
        b obj=new b(8);
       
    }
    
}
class a
{
   public a(){
     
       System.out.println("hi");
       
    
}
   public a(int i){
       System.out.println("hi integer");
   }
}
class b extends a
{
    public b(){
       
        System.out.println("hello");
    }
    public b(int i){
    
        System.out.println("hello int");
    }
}