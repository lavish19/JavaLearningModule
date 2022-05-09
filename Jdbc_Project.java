import java.sql.*;
public class Jdbc_Project {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/new_lavishdb";
		String uname="root";
		String pass="password@123";
		String query="select * from employee";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		String userData="";
		while(rs.next()) {
			userData=rs.getInt(1)+" : "+rs.getString(2);
			System.out.println(userData);
		}
		rs.next();
		userData=rs.getInt(1)+" : "+rs.getString(2);
		rs.next();
	    userData=rs.getInt(1)+" : "+rs.getString(2);
	    rs.next();
	    userData=rs.getInt(1)+" : "+rs.getString(2);
		System.out.println(userData);
		st.close();
		con.close();
		
	}

}
