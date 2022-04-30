//program to demonstrate variable inheritance in between classes establishing parent-child relationship
public class I1 {
	int p=90;

}
class A extends I1{
	int p=80;
	
}
 class B extends A{
	int p=70;
}
 class I2 extends I1{
	 public static void main(String[] args) {
		 A a=new A();
		 System.out.println(a.p);
		 I1 i=new B();
		 System.out.println(i.p);
		 
	 }
 }
