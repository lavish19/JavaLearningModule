
 class Complex {
	 private int a;
	 private int b;
	 private Complex(int i ,int j) {
		 this.a=i;
		 this.b=j;
	 }
	 private Complex(int i	) {
		 this(i,i);
	 }
	private Complex() {
		this(0);
	}
	public String toString() {
		return this.a+"+"+this.b+"i";
	}
	class Th2{
		public static void main(String[] args) {
			Complex c=new Complex(9,8);
			Complex c1=new Complex(7);
			Complex c2=new Complex();
			System.out.println(c);
			System.out.println(c1);
			System.out.println(c2);
		}
	}
	

}
