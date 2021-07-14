
package interface12;


interface hi
{
    void hi();
    void hell();
    void fun();
    void good();
}
abstract class helo implements hi
{
 public void hi()
 {
     System.out.println("ummmm"); 
 }
   
}
class  hmm extends helo
        {
  
    @Override
    public void hi() {
        System.out.println("hi");
    }

    @Override
    public void hell() {
        System.out.println("hell");
    }

    @Override
    public void fun() {
        System.out.println("fun");
    }

    @Override
    public void good() {
        System.out.println("good");
    }
}
class dept 
{
    public hmm dept(String str)
    {
        if(str=="hi")
            return new hmm();
        else
            if(str==null)
                return new hmm();
        return null;
    }
}

public class Interface12 {

    public static void main(String[] args) {
      
    }
    
}
