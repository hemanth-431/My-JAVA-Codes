
package pkgsuper;


public class Super {

    public static void main(String[] args) {
       
        b obj=new b();
        obj.book();
        
    }
    
}
class a{
   
        int i=4;
   
}
class b extends a{
    int i=6;
    public void book(){
        
      System.out.println(super.i);
    }
     
}
