//program to demonstrate throwable exception usage
public class Throwable {
		static void checkStock(String color,int model) {
			if(color!="black" && model!=1) {
				throw new ArithmeticException("product not in stock");
			}
			else
				System.out.println("Available");
		}
	
	public static void main(String[] args) {
		System.out.println("welcome to checking process");
		checkStock("blue",2);
		
	}

}
