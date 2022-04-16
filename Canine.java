package superKeyword;

public class Canine {
void legs() {
	System.out.println(4);
}
public class Rottweiler extends Canine{
	void eat() {
		System.out.println("eating");
	}
	void bark() {
		System.out.println("barking");
	}
	void work() {
	super.legs();
	bark();
	eat();
	
}
class Main{
	public static void main(String[] args) {
		Rottweiler r= new Rottweiler();
		r.work();
		
	}
}
}
}
