
package pkgthis.key.word;

public class ThisKeyWord {

    public static void main(String[] args) {
         
        a obj=new a(5);
      obj.show();
    }
    
}
class a
{
   int x;
  public a(int x){
      this.x=x;
  }
       public void show()
       {
           System.out.println(x);
       }
}
