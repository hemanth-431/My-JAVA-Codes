package Library1;
import java.io.*;
import java.lang.*;
import java.util.*;
public class Library12 {
private int book_id;
private String book_name;
private String book_author;
public int getBook_id() {
return book_id;
}
public String getBook_name() {
return book_name;
}
public String getBook_author() {
return book_author;
}
public Library12(int book_id,String book_name,String book_author)
{
this.book_id=book_id;
this.book_name=book_name;
this.book_author=book_author;
}

public int compareTo(Library12 l)
{
return this.book_author.compareTo(l.book_author);
}
public static void main(String args[])
{
Library12 ob1=new Library12(1004,"C","Swamy");
Library12 ob2=new Library12(1006,"OS","Galvin");
Library12 ob3=new Library12(1003,"CN","Tanenbaum");
ArrayList<Library12> l=new ArrayList<Library12>();
l.add(ob1);
l.add(ob2);
l.add(ob3);
Collections.sort(l, new LibraryComparator());
for(Library12 ob:l)
{
System.out.println(ob.getBook_id() + " " +ob.getBook_name()+" "+ob.getBook_author() );
}
}
}
class LibraryComparator implements Comparator<Library12>
{
public int compare(Library12 l1,Library12 l2)
{
 return (l1.getBook_author()).compareTo(l2.getBook_author());
}
}
