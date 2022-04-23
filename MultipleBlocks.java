//program to demonstrate multiple Catch blocks
public class MultipleBlocks {
	public static void main(String[] args) {
		try {
		int a[]=new int[7];
		a[4]=60/0;
		System.out.println("first statement of the try block");}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception found");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("warning : Arrayindex out of bounds exception occured");
		}
		
		
		System.out.println("out of try-catch block");
		

		
		
		
	}

}
