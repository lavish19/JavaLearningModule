//program to demonstrate usage of interface in class
interface BluePrint {
	void rooms();
	default void structure() {
		System.out.println("house have floors");
	}}
	class Bungalow implements BluePrint{
		public void rooms() {
			int rooms=6;
			int kitchen=2;
			int bedrooms=3;
			int total=rooms+kitchen+bedrooms;
			System.out.println("total rooms "+total);
		}
		public void structure() {
			System.out.println("house have 2 floors");
		}}
	class Duplex implements BluePrint{
			public void rooms() {
				int rooms=4;
				int kitchen=2;
				int bedrooms=2;
				int total=rooms+kitchen+bedrooms;
				System.out.println("total rooms "+total);
			}
			public void structure() {
				System.out.println("house have 1 floor");
			}
		}
	
	class Builder{
		public static void main(String[] args) {
			Bungalow b=new Bungalow();
			b.rooms();
			b.structure();
			Duplex d=new Duplex();
			d.rooms();
			d.structure();
		}
	}


