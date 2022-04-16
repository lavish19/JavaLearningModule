
public class Exception {
	public static void main(String[] args) {
		try {
			int divide=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("code");
	}
	

}
