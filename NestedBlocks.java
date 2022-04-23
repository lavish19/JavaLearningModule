//program to demonstrate nested try catch blocks	usage
public class NestedBlocks {
	public static void main(String[] args) throws ArithmeticException {
	try {
		try {
			try {
				int a[]= {1,2,3,4,5};
				System.out.println(a[10]);
				
			}
			catch(ArithmeticException e) {
				System.out.println("warning:Arithmeticexception has occured");
				System.out.println("handled in try 3 block");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("warning:Arithmetic exception has occured");
			System.out.println("handled in try 2 block");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("Array index out of bounds exception has occured");
			System.out.println("handled in try main block");
		}
	}
	catch(ArithmeticException e5) {
		System.out.println("some Exception");
		System.out.println("handled in try main block");
	}
	}
}
	
