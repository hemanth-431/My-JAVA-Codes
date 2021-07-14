package singleton2;
public class SingleTon2 {

    
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){
            public void run(){
                abc z=abc.get();
                z.s=(z.s).toUpperCase();
                System.out.println(z.s);
            }
        });
        Thread t2=new Thread(new Runnable(){
            public void run(){
                abc x=abc.get();
            }
        });
        System.out.println(abc.class);
    }
    
}

  class abc{
    private static abc obj=null;
    public String s;
     abc(){
        s="hjdfgsgfrg";
    }
            public static abc get()
            {
                if(obj==null)
                        obj=new abc();
                
              return obj;
            }
   
}
   
           
   