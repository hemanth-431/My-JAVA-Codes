package codech;
import java.util.ArrayList;
import java.util.Scanner;

  public class Codech {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int z=0;z<t;z++)
        {
       int c= in.nextInt();
        int count=0,sec=0,count1=0,sec1=0;
        StringBuilder s=new StringBuilder();
         ArrayList l=new ArrayList();
       
        for (int i = 0; i < 3; i++) {
            s.append(in.nextLine());
            l.add(s.length());
        
        }
        
      
        for (int i = 0; i < (int)l.get(1); i++) {
            if(s.charAt(i)=='1')
                count=count+1;
            else
                sec=sec+1;
        }
      for (int i = (int)l.get(1); i < (int)l.get(2); i++) {
            if(s.charAt(i)=='1')
                count1=count1+1;
            else
                sec1=sec1+1;
        }
      if(count==count1 && sec==sec1)
            System.out.println("YES");
      else
            System.out.println("NO");
          
      
        }   
    
}
}