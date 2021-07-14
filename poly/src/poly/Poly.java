
package poly;

class car{
private int engine;
private int wells;
private int horn;

    public car(int engine, int wells, int horn) {
        this.engine = engine;
        this.wells = wells;
        this.horn = horn;
        System.out.println(engine);
        System.out.println(wells);
        System.out.println(horn);
       
    }
     public void show(){
         System.out.println("hi");
    }
}
class hi extends car
{

    public hi(int engine, int wells, int horn) {
        super(engine, wells, horn);
    }

    @Override
    public void show() {
        super.show(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
public class Poly {

    public static void main(String[] args) {
        
       new hi(3,4,3).show();
       
    }
    
}
