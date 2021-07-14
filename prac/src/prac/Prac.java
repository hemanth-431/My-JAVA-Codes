
package prac;

import java.util.ArrayList;
import java.util.List;






public class Prac {

    
    public static void main(String[] args) {
       
List<student> std=new ArrayList<>();
       std.add(new student(4,"hdihf"));
 std.add(new student(5,"dihf"));
 
 for(student i:std)
 {
     System.out.println(i);
 }
    }
    
}
class student
{
    int roll;
    String name;
    public student(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
        
    }

    @Override
    public String toString() {
        return "student{" + "roll=" + roll + ", name=" + name + '}';
    }
    
}