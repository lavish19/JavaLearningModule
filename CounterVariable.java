//program to demonstrate incrementing static counter variable 
public class CounterVariable {
	static int count=0;//only gets memory once and retains its value
	CounterVariable(){//constructor initialized
		count++;//incrementing value of the static variable
		System.out.println(count);
	}
	public static void main(String[] args) {
		CounterVariable c=new CounterVariable();
		CounterVariable a=new CounterVariable();
		CounterVariable v=new CounterVariable();
	}
}
