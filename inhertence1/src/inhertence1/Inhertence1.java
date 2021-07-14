
package inhertence1;

public class Inhertence1 {

    public static void main(String[] args) {
        
        ab obj=new ab();
        obj.a1=4;
        obj.a2=4;
        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result1);
    }
    
}
class a
        {
    int a1,a2,result;
    public void sum(){
        

    result=a1+a2;}
}
class ab extends a
        {
    int a1,a2,result1,result;
    public void sub(){
        

    result1=a1-a2;}
public void sum(){
        

    result=a1+a2;}
}