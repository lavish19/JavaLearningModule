//program to demonstrate nested try catch exception blocks usage
public class Nest {
	public static void main(String[] args){
		try {
			try {
				System.out.println("inside parent block");
				int a = 40/0;
				System.out.println(a);
				}
			catch(ArithmeticException e1) {
				System.out.println("warning:arithmetic exception occured");
			}
			try {
				int a=40/0;
				System.out.println("inside child try block");
				System.out.println(a);
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("warning:arrayindexoutofboundsexception occured");
			}
			System.out.println("just some statement");
		}
		catch(ArithmeticException e3) {
			System.out.println("error");
			System.out.println("inside try catch block 1");
			
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("Arrayindex out of bounds error occured");
			System.out.println("inside try catch block1");
			
		}
		
	}

}
