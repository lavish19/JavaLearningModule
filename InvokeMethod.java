//program to invoke current class method using this keyword
public class InvokeMethod {
	void a() {
		System.out.println("hello a");
	}
	void b() {
		this.a();//same as a();
		System.out.println("hello b");
	}
	public static void main(String[] args) {
		InvokeMethod i=new InvokeMethod();
		i.b();
		
	}

}
