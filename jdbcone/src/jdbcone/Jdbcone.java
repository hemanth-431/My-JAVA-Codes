
package jdbcone;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class Jdbcone 

   public static void main(String[] args)throws Exception
	{
		String url="jdbc:mysql://localhost:3306/abc";
		String uname="root";
		String pass="BVH022208";
		String query="select title from student where roll=1";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		java.sql.Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	rs.next();
	String name=rs.getString("title");
	System.out.println(name);
	st.close();
	con.close();
		
	}
    
}
