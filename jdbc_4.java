import java.sql.*;
class jdbc_4{
	public static void main(String[] args) {
		StudentDAO1 dao=new StudentDAO1();
		Student st1= new Student();
		st1.rollno=16;
		st1.sname="arun";
		dao.connect();
		dao.addStudent(st1);
	}
}
class StudentDAO1{
	Connection con=null;

	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Lovesh","root","password@123");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public Student getStudent(int rollno) {
		try {
			Student s1=new Student();
			s1.rollno=rollno;
			String query="select sname from student where rollno="+rollno;
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String name=rs.getString(1);
			s1.sname=name;
			return s1;
		
		}catch(Exception e) {
			System.out.println(e);
			
		}
		return null;
	}
public void addStudent(Student s) {
	String query="insert into student values (?,?)";
	PreparedStatement pst;
	try {
		pst=con.prepareStatement(query);
	pst.setInt(1,s.rollno);
	pst.setNString(2,s.sname);
	pst.executeQuery();
	
}catch(Exception e) {
	System.out.println(e);
}
}}

class student{
	int rollno;
	String sname;
}