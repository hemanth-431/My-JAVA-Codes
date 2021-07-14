/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.inside.arraylist;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ArrayListInsideArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int n = 3; 
  
        // Here aList is an ArrayList of ArrayLists 
        ArrayList<ArrayList<Integer> > aList =  
                  new ArrayList<ArrayList<Integer> >(n); 
  
   
        ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(1); 
        a1.add(2); 
        aList.add(a1); 
  
        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(3); 
        a2.add(4); 
        aList.add(a2); 
  
        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(10); 
        a3.add(20); 

        aList.add(a3); 
ArrayList<Integer> l1=new ArrayList<>();
ArrayList<Integer> l2=new ArrayList<>();

  // ArrayList<ArrayList<String>> list=new ArrayList
 for(int i=0;i<aList.size();i++){
       
           l1.add(aList.get(i).get(0));
           l2.add(aList.get(i).get(1));
         
        
  
  }
   for(int i=0;i<aList.size();i++){
       
        if(l1.contains(l2.get(i))){
            
        }
        
        else{
            System.out.println(l2.get(i)); 
            break;
        }
         
        
  
  }
  
    }
    
}
