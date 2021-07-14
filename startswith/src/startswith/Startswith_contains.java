/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startswith;

/**
 *
 * @author user
 */
public class Startswith_contains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a="abcdef";
        String b="ABCDEF";
        if(a.startsWith(b))
            System.out.println("true");
        else
            System.out.println("false");
      if(a.contains(b))
            System.out.println("hi");
      else
            System.out.println("bye");
      if(a.equalsIgnoreCase(b))
            System.out.println("hello");
      else
            System.out.println("goodbye");
    }
    
}
