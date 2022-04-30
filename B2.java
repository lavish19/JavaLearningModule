class B2 {
	int a=90;
	int b=89;
	void msg() {
		System.out.println("base class method");
	}
void f() {System.out.println("base class second method");
}}
 class Child extends B2{
	int b=54;
	void msg2() {
		System.out.println("child class method ");
	}
}
 class Test extends B2{
	 public static void main(String[] args) {
		 B2 q=new B2();
		 System.out.println(q.a);
		 System.out.println(q.b);
		 q.msg();
		 Child c=new Child();
		 System.out.println(c.a);
		 System.out.println(c.b);
		 c.msg2();
		 c.f();
		 B2 s=new Child();
		 s.msg();
		 System.out.println(s.b);
		 
		 
	 }
 }
