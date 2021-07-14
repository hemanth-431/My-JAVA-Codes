
package studentdetails;


public class Studentdetails
    {
    public static void main(String args[])
    {
        hi obj=new hi();
        obj.setmarks(100, 78, 88);
        System.out.println( obj.totalmarks());
    }
    }
        class hi
        {
        double maths,physics,che;
        
        void setmarks(double maths,double physics,double che)
        {
           
            this.maths=maths;
            this.physics=physics;
            this.che=che;
            
        }
        double totalmarks()
        {
            
            double totalmarks=this.maths+this.physics+this.che;
          
            return totalmarks;
        }
    }

