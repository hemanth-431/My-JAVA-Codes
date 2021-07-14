
package collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        List<student> std=new ArrayList<>();
       std.add(new student(8,55));
        std.add(new student(18,45));
         std.add(new student(28,35));
          std.add(new student(38,25));
           std.add(new student(48,15));
        for(student i: std){
            System.out.println(i);
        }
    }
    
}
class student
{
    int roll;
    int marks;

    public student(int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student{" + "roll=" + roll + ", marks=" + marks + '}';
    }
    
}