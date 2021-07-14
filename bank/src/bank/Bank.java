
package bank;

import java.util.Scanner;

public class Bank {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       
        
        int acno=in.nextInt();
        
      
        int required=in.nextInt();
        int amount=in.nextInt();
        int deposit=in.nextInt();
        input obj1=new input();
        output obj2=new output();
        if(acno==180030431){
        if(required>0)
        { if(required<amount)
            obj2.show(amount,required);}
        if(deposit>0)
            obj1.show(amount, deposit);
    }
        else
        {
            System.out.println("Wrong Input");
        }
    }
}
    

class input
{
    public void show(int amount,int deposit){
            System.out.println(amount+deposit+" is the Balance Left");
}
}
class output
{
     public void show(int amount,int required){
            System.out.println(amount-required+" is the Balance left");
}
}