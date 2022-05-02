//program to demonstrate usage of interface and abstract classes in java
abstract class Pen	{
	abstract void write();
	abstract void refill();

}
 class FountainPen extends Pen{
	void write() {
		System.out.println("write");
	}
	void refill(){
		System.out.println("refill");
	}
	void changeNib() {
		System.out.println("change nib");
	}
}
 class Monkey{
	 void jump() {
		 System.out.println("jumping");
	 }
	 void bite() {
		 System.out.println("biting");
	 }
 }
 interface BasicAnimal{
	 void eat();
	 void sleep();
 }
 class Human extends Monkey implements BasicAnimal{
	 void speak() {
		 System.out.println("hello");
	 }
	public void eat() {
		 System.out.println("eating");
		 
	 }
	 public void sleep() {
		 System.out.println("sleeping");
	 }
 }
  class Play{
 public static void main(String[] args) {
	 FountainPen f=new FountainPen();
	 f.changeNib();
	 Human sen=new Human();
	 sen.sleep();
	 Monkey m=new Human();
	 m.jump();
	 m.bite();
	 BasicAnimal mukesh=new Human();
	 mukesh.eat();
	 mukesh.sleep();
	 }
 }
