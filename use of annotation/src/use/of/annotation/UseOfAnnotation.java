
package use.of.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
    import java.util.ArrayList;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone
{
    String os() default "oppo";
    int version() default 1;
}
@SmartPhone(os="Android",version=2)
class nokia{
    String mode;
    int size;

    public nokia(String mode, int size) {
        this.mode = mode;
        this.size = size;
    }
    
}
public class UseOfAnnotation {

    public static void main(String[] args) {
       
       nokia obj=new nokia("fire",5);
        Class c=obj.getClass();
        Annotation an=c.getAnnotation(c);
        SmartPhone s=(SmartPhone)an;
        System.out.println(s.version());
    }
    
}
