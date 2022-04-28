//program to demonstrate more than one usage of interface
interface X{
	public void myMethod();

}
interface Y{
	public void myMethod();
}
public class M4 implements X,Y{
	public void myMethod() {
		System.out.println("more than one interfaces");
	}
	public static void main(String[] args) {
		M4 m=new M4();
		m.myMethod();
	}
}
