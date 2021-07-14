
package annotation15.pkg9;

@interface SmartPhone
{
    String os() default "oppo";
    int version() default 1;
}
@SmartPhone(os="Android",version=2)
class nokia{
    
}
public class Annotation159 {

    
    public static void main(String[] args) {
        
    }
    
}
