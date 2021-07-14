
package prjvo;

import static java.lang.Character.UnicodeBlock.of;



interface Second
{
 void same();


}


abstract  class hello
        {
public void show()
{
    System.out.println("ho");
}
}

abstract class dog extends hello{
   
}
public class Prjvo extends dog {

    public static void main(String[] args) {
      Prjvo obj=new Prjvo();
obj.show();
    }

    
}
