
package recur;

public class Recur {
static void hi(int i){
    System.out.println(i);
    if(i>0)
    hi(i-1);
    System.out.println(i);
}
    public static void main(String[] args) {
        hi(10);
    }
    
}
