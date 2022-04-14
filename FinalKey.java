//program to demonstrate usage of variable of final keyword
public class FinalKey {
	final int rno=31;
	final String name="henry";
	
		public void display() {
			System.out.println("Roll no. "+rno+" "+"Name "+name);
			
	}
		public class Key{
			public static void main(String[] args) {
				FinalKey k=new FinalKey();
				k.display();
			}
		}

}
