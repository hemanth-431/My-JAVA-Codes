
import java.io.*;
public class pracyh                              
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream(args[0]);
int letters=0,words=0,lines=0;
int i;
while((i=fin.read())!=-1)
{
    letters++;
  if(i==' ')
   {
    words++;
   }
  if(i=='\n')
   {
    lines++;
   }
}
System.out.println("NUMBER OF LETTERS"+letters);
System.out.println("NUMBER OF WORDS"+words);
System.out.println("NUMBER OF LINES"+lines);
fin.close();
}catch(Exception e){}
}
}