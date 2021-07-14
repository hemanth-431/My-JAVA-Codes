
package to.find.out.dubliates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class ToFindOutDubliates {

  
    public static void main(String[] args) {
        List a=new ArrayList<>();
        a.add("gaj");
        a.add("coo");
        a.add("coo");
      Set<String> keys=new HashSet<>();
      for(Object key:a){
          if(keys.add((String) key)==false)
              System.out.println(key);
      }
        
    }
    
}


/* 
Membe Inner class :                 Static Inner Class:              Anonimus inner class:                     
                                        
    class a{                            claaa a{                      class a or interface a{
    class b{                            Static int i;                 }
int j;                                  Static class b{                 main(){
}}                                      int j;}                          a obj = new a(){
main()                                  main(){                          public void show(){
{                                       a.i=8;                           sout("hi");}}
a obj=new a();                          a.b obj=new a.b();                obj.show();
a.b obj1=obj.new b();                        obj.j=3;}}
obj1.j=4;
}
*/
