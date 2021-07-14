/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marker.pkginterface;

interface hello{
 void   show();
}
class hi implements hello{
    public void show(){
        System.out.println("hello world");
    }
}
public class MarkerInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       hi obj=new hi();
       hello o=new hi();
      if(obj instanceof hello)
          o.show();
    }
    
}
