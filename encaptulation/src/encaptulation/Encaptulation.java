
package encaptulation;


public class Encaptulation {
    public static void main(String[] args){
        
    hello obj=new hello();
   obj.setI(6);
           System.out.println(obj.getI());

}}
class hello{
    

   private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

   
  
}
