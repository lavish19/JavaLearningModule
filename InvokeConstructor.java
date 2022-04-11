//program to invoke class constructor using java this keyword
public class InvokeConstructor {
	static String college="NRIIST";
	InvokeConstructor() {
		System.out.println("hello ");
	}
	InvokeConstructor(String n,int r){
		this();//calling default constructor from parameterized constructor
		System.out.println(n);
		System.out.println(r+" "+college);
	}
	
	public static void main(String[] args) {
		
		InvokeConstructor a=new InvokeConstructor("lavish",9);
	}
	

}
