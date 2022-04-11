//demonstrating static variable can be directly accessed in static methods
public class StaticMethod {
	static int n;
	static String name;
	static void display() {
		System.out.println("number - "+n);
		System.out.println("Name - "+name);
	}
	public static void main(String[] args) {
		n=25;
		name="lavish";
		display();
	}

}
