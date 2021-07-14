
package enum3;





 
 enum mobile{
     apple(1000),samsung(122);
     int price;
     mobile(int a){//constructor
         price =a;
     }
     public int getprice(){
         return price;
     }
     
 }
public class Enum3 {
    public static void main(String[] args) {
        System.out.println(mobile.samsung.getprice());
       
            
        
    }
    
}
