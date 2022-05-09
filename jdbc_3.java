import java.sql.*;
class JdbcDemo{
	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		Student s1=dao.getStudent(11);
		System.out.println(s1.sname);
	}
}
class StudentDAO{
	public Student getStudent(int rollno) {
		try {
		Student s=new Student();
		s.rollno=rollno;
		String query="select sname from student where rollno="+rollno;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Lovesh","root","password@123");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString(1);
		s.sname=name;
				
		return s;
	}catch(Exception e) {
		System.out.println(e);
	}return null;
}}
class Student{
	int rollno;
	String sname;
}