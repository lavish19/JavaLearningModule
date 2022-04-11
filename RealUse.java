//Real usage of constructor
public class RealUse {
	int id;
	String name;
	static String company="Caelius";
    float sal;
	RealUse(int i,String n){
		this.id=i;
		this.name=n;
	}
	RealUse(int i,String n,Float s){
		this(i, n);
		this.sal=s;
	}
	void display() {
		System.out.println(id+" "+name+" "+sal+" "+company);
	}
	public static void main(String[] args) {
		RealUse k=new RealUse(12,"dilip",16000f);
		RealUse v=new RealUse(9,"sharat",18000f);
		k.display();
		v.display();
		
	}

}
