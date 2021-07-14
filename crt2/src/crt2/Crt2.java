/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crt2;

class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
  
    B(){
        super();
        System.out.println("B");
    }
}
public class Crt2 extends B {

    public static void main(String[] args) {
        Crt2 ob=new Crt2();
        
        
      
    }
    
}
