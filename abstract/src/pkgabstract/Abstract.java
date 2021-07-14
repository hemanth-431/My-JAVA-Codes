
package pkgabstract;
public class Abstract 
{
    public static void main(String[] args) {
        iphone obj=new iphone();
        moto obj1=new moto();
       show(obj);
        show(obj1);
    }
    public static void show(iphone obj){
        obj.showclass();
    }
    public static void show(moto obj1){
        obj1.showclass();
    }
}
class iphone
{
    public void showclass(){
        System.out.println("3.6 iphone");
    }
}
class moto{
    public void showclass(){
        System.out.println("4.6 moto");
    }
}

