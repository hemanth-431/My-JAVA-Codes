
package enum31;

enum mobile{
    apple(188),samsumg(182),htc(264);
             int price;
    mobile(int a){
price=a;
}
   public int call(){
       return price;
   }
}

public class Enum31 {

   
    public static void main(String[] args) {
        mobile m[]=mobile.values();
       
      
        for(mobile M : m)
        System.out.println(M.price);
    }
    
}
