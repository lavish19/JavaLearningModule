import java.util.Scanner;

interface Bike{
	public static final String color = "Black";
	int topSpeed=140;
	String model(String name);
	void company();
}
class RE implements Bike{
	public String model(String name) {
	
		System.out.println("model name "+name+" color "+color+" topSpeed "+topSpeed);
		String mod=name;
		return mod;
	
	}
	public void company() {
		System.out.println("royal enfield");
	}

	
}
class Hero implements Bike{
	public String model(String name) {
		Scanner s=new Scanner(System.in);
		
	System.out.println("model name "+name+" color "+color+" topSpeed "+topSpeed);
	String mod=name;
	return mod;
	}

public void company() {
	System.out.println("hero");
}
}
class SampleI{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Bike b;
		b=new RE();
		String cruiser=b.model("meteor");
		System.out.println(cruiser);
		b=new Hero();
		String commuter=b.model("karizma");
		System.out.println(commuter);
	}
}