

package twelve;

public class Twelve {

    
    public static void main(String[] args) {
     int b[] = new int [3];
     b[0]=3;
     b[1]=4;
     b[2]=34;
     
     // CONSTRUCTOR
         hello hi = new hello();
         hi.show(b);
    }}
class hello
{
    
    public void show(int ...x)
    {for(int i: x)
        System.out.println(i);
        
        
        
    }
    
}
