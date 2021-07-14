package fourteen;

import static fourteen.a.n2;

class a
{
    int n1;
    static int n2;
    public void show()
    {
        n2=9;
    }
      
}

public class Fourteen{
    public static void main(String args[])
    {
        a.n2=5;
        a obj1= new a();
       
        obj1.n1=3;
        a.n2=4;
        obj1.show();
       
        
         System.out.println(a.n2);
        
    }
}