
package encaptulation1;


public class encaptulation2 {
    
    public static void main(String[] args)
    {
        emp obj=new emp();
        obj.set(3,"djedj");
        System.out.println(obj.get());
        
           
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

