//program to demonstrate usage of static variable 
public class Static_Method {
int rno;
String name;
static String college="NRIIST";
Static_Method(int r,String n){
	rno=r;
	name=n;
}
void display() {
	System.out.println(rno+" "+name+" "+college);
}
public static void main(String[] args) {
	Static_Method s1=new Static_Method(12,"lavish");
	Static_Method s2=new Static_Method(45,"mahesh");
	Static_Method s3=new Static_Method(9,"kumar");
	s1.display();
	s2.display();
	s3.display();
}
}
