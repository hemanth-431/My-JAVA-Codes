
package encaptulation1;


public class Encaptulation1 {

    
    public static void main(String[] args) {
     Encaptulation obj=new Encaptulation();
     obj.setI(9);
      
     
        System.out.println(obj.getI());
    }
    
}
class Encaptulation {

   
   private int i;
   public void setI(int j)
   {i=j;}
   public int getI()
   {
     return i;
   }
}