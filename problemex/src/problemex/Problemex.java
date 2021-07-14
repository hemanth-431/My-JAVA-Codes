/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemex;

/*
class hello{
   void hello(){
        System.out.println("hi");
    }
}
class hmmm extends hello{
    void mmm(){
        System.out.println("hmmmmmm");
    }
}
*/
abstract class hello{
  abstract void hell();
  void sleep(){
      System.out.println("helllo");
  }
    
}
class hep extends hello{

    void hell() {
        System.out.println("maamulu");//To change body of generated methods, choose Tools | Templates.
    }
  
}

public class Problemex{
    
    public static void main(String[] args) {
  
        hep ob=new hep();
        ob.sleep();
    }
    
}
