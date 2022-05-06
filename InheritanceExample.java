class A{
	int a=1;
}
class B extends A{
	int a=2;
	
}
class C extends B{
	int a=3;	
}
class D extends C{
	int a=4;
	
}
class E{
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		C c=new C();
		D d=new D();
		System.out.println(a.a);
		System.out.println(b.a);
		System.out.println(c.a);
		System.out.println(d.a);
		A s=new D();
		System.out.println(s.a);
		B s1=new C();
		System.out.println(s1.a);
		
		
		
		
		
	}
}