//program to demonstrate final block usage 
public class FinallyBlock {
	public static void main(String[] args) {
		try
		{
			int a=45;
			int b=0;
			int c=a/b;
			System.out.println("first statement of try block");
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic exception has occured");
		}
		finally{
			System.out.println("finally block");
		}
		System.out.println("out of the try and catch block");
	}

}
