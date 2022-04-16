
public class exceptionHandling {
	static int divideZero(int a, int b) {
		int i=a/b;
		return i;
	}
	static int computeDivision(int a, int b) {
		int res=0;
		try {
			res=divideZero(a,b);
		}
		catch(NumberFormatException ex) {
			System.out.println("number format exception is occured");
		}
		return res;
	}
	public static void main(String[] args) {
		int a=1;
		int b=0;
		try {
			int i=divideZero(a,b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		}
	}


