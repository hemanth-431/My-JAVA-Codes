 
package innerclass;


public class Innerclass {

    public static void main(String[] args) {
        class purchasing
{
   
    void purchaselnspiron()
    {
        System.out.println("The cost of purchaselnspiron is 10,00,000rs");
    }
    void purchaseAlianware()
    {
        System.out.println("The cost is purchaseAlianware is  10,50,000rs");
    }
        }
    class servicing                     
    {
      void  ServicingofLaptops()
        {
            System.out.println("All Services Are Applicable for Laptops");
        }
      void ServiceofPc()
      {
          System.out.println("All services are applicable for Pc");
      }
    }
    purchasing obj1=new purchasing();
    servicing obj2=new servicing();
    obj1.purchaseAlianware();
    obj1.purchaselnspiron();
    obj2.ServiceofPc();
    obj2.ServicingofLaptops();
}
    }
    


