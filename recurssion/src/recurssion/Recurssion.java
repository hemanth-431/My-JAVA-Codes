
package recurssion;

public class Recurssion {

   
    public static void main(String[] args) {
       recurl obj=new recurl();
       
       for(int i=0;i<5;i++)
           obj.soop();
        System.out.println(obj.count);
    }
    
}
class recurl{
    int count=0;
    public void soop(){
        count=count+1;
    }
}