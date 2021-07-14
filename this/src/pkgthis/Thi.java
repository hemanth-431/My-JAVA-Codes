
package pkgthis;
public class Thi
{
    public static void main(String[] args){
        This obj=new This();
    }
}
   class This {

  
    private int a;
    private int b;
    private int c;
    private int d;
   
   
   public This()
   {
       this(7,0);
   }

    public This(int w,int h)
    {
      
        this(0,0,w,h);
    }
    public This(int a,int b,int c,int d)
    {
        
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        System.out.println(a+" "+b+" "+c+" "+d);
    }
   
    
}
