
package skillinglab.pg37;

class result
{
    public void displayresult()
    {
        studentdetails sd=new studentdetails();
       
        double tm=sd.totalmarks();
        System.out.println(tm);
        if((tm/360)*100>=80)
        {
            System.out.println("ELIGIBLE");
        }
        else
        {
            System.out.println("ILL");
        }
        
    }
    public class studentdetails
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
}

public class SkillinglabPg37 {

    public static void main(String[] args) {
        result r=new result();
        result.studentdetails rsd=new result().new studentdetails();
        rsd.setmarks(108,89,82);
       r.displayresult();
     }
    
}
