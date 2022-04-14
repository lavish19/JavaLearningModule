
public  class FinalMeth {
	public final void display() {
		System.out.println("this is final method");
		
	}
	class Main extends FinalMeth{
		public final void change() {
			System.out.println("final methods cannot be overidden");
		}
	}                         //final method cannot be inherited
	class Result{
		public static void main(String[] args) {
			FinalMeth m=new FinalMeth();
			
			m.display();
			
			
			
		}
	}

}
