/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overrideing;

class hi
{
    public void show()
    {
        System.out.println("hi");
    }
}
class hello extends hi
{
    public void show()
    {
        System.out.println("hello");
    }
}
public class Overrideing {

    public static void main(String[] args) {
        hello obj=new hello();
        String s="a";
        String s1="b";
        System.out.println(s.compareTo(s1));
        System.out.println(s.equals(s1));
    }
    
}
