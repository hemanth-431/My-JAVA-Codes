
package enumpra;

enum mobile
{
    apple,samsung;
    
   
    int cost;
}
public class Enumpra {

    
    public static void main(String[] args) {
       mobile obj=mobile.apple;
       obj.cost=87;
       mobile obj1=mobile.apple;
        System.out.println(obj1);
        System.out.println(obj.cost);
    }
    
}
