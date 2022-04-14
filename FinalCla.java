//program to demonstrate final class
public final class FinalCla {
	public void display() {
		System.out.println("final class method");
		
	}   //final class features cannot be inherited
	public static void main(String[] args) {
		FinalCla c=new FinalCla();
		c.display();
		
	}

}
