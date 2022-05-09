import java.sql.*;
public class Jdbc_Project {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/new_lavishdb";
		String uname="root";
		String pass="Ramkrishn@009";
		String query="select EmpName from employee where EmpId=4";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("EmpName");
		System.out.println(name);
		st.close();
		con.close();
		
	}

}
