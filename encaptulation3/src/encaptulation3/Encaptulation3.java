
package encaptulation3;
public class Encaptulation3 {
    
    public static void main(String[] args)
    {
        emp obj=new emp();
        obj.set(3,"djedj");
        System.out.println(obj.get());
        System.out.println(obj.getI());
           
    }
    }
class emp
{
    private int empno;
    private String empname;
    public void set(int i,String n){
        empno=i;
        empname=n;
    }
    public int getI(){
        return(empno);
        
    }
   public String get(){
       return(empname);
   }
    
}

