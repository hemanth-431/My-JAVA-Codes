package coodech;

import java.util.Scanner;


public class Coodech
{
    public static void main(String[] args)
    {
       Scanner in=new Scanner(System.in);
        System.out.println("dd/mm/yyyy");
        int sum=0;
       int dd=in.nextInt();
       
       int mm=in.nextInt();
       
       int yy=in.nextInt();
        for (int i = 1; i < mm; i++) {
           
            if(i==2)
                sum=sum+28;
            if(i==4 || i==6 || i==9 || i==11)
                sum=sum+30;
            else
                sum=sum+31;
        }
         sum=sum+dd;
        System.out.println("No.of days is "+sum);
        if(sum%4==0)
            System.out.println("Leap Year");
       
    }
}