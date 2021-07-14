package syncronised;
class Syncronise{  
void printTable(int n){//method not synchronized  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread1 extends Thread{  
    Syncronise obj=new Syncronise();
int t;  
MyThread1(int t){  
this.t=t;  
}  
public void run(){  
obj.printTable(5);  
}  
  
}  
class MyThread2 extends Thread{  
    Syncronise obj=new Syncronise();
int t;  
MyThread2(int t){  
this.t=t;  
}  
public void run(){  
obj.printTable(100);  
}  
}  
  
public class Syncronised{  
public static void main(String args[]){  
MyThread1 t1=new MyThread1(8);  
MyThread2 t2=new MyThread2(7);  
t1.start();  
t2.start();  
}  
}  