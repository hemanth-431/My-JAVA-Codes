
package pkgenum;




public class Enum {
 
 enum mobile{
     apple,samsung
     
 }
    public static void main(String[] args) {
        System.out.println(mobile.samsung);
      mobile m=mobile.apple;
        switch(m){
            case apple:
                    System.out.println("yes");
                    break;
            case samsung:
                    System.out.println("copy");
                
            
        }
    }
    
}
