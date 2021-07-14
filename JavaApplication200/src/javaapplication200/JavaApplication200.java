/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication200;

  class hi
    {
      static class inner
      {
          
        public void fun(){
            System.out.println("hi");
    }
    }
      inner obj1=new inner();
  }
  
public class JavaApplication200 {

  
    public static void main(String[] args) {
       hi obj=new hi();
       obj.obj1.fun();
       
    }
    
}
