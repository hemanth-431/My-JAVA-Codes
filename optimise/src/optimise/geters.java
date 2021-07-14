
package optimise;

import java.util.Scanner;

class hi
{
    Scanner in=new Scanner(System.in);
 private int age;
 private String id;
 private String location;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Enter age");
        age=in.nextInt();
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        System.out.println("Enter id");
        id=in.nextLine();
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        System.out.println("Enter location");
        location=in.nextLine();
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Enter name");
        name=in.nextLine();
        this.name = name;
    }
    
}
public class geters {

    public static void main(String[] args) {
        
        hi obj=new hi();
      
       obj.setAge(0);
        obj.setId("34");
       
       obj.setName(null);
       obj.setLocation(null);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getId());
        System.out.println(obj.getLocation());
    }
    
}
