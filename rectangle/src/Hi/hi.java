package Hi;
public class hi{
    public static void main(String[] args)
    {
 
        
        Cuboid obj1=new Cuboid(4,44,4);
        System.out.println(obj1.getVolume());
}
}
 class Rectangle {
    private double width;
    private double length;
 
    public Rectangle(double width, double length) {
        this.length = (length > 0) ? length : 0;
        this.width = (width > 0) ? width : 0;
        System.out.println(getWidth()); 
    }
 
    public double getWidth() {
        
        return width;
    }
 
    public double getLength() {
        return length;
    }
 
    public double getArea() {
        return length * width;
    }
}
 
  class Cuboid extends Rectangle {
    private double height;
 
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height > 0) ? height : 0;
    }
 
    public double getHeight() {
        return height;
    }
 
    public double getVolume() {
        return height * getArea();
    }
}