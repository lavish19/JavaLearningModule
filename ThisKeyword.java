//program to demonstrate this keyword usage
public class ThisKeyword {
int rno;
String name;
String color;
ThisKeyword(int r,String n,String c ){
	this.rno=r;
	this.name=n;
	this.color=c;
}
void display() {
	System.out.println(rno+" "+name+" "+color);
}
	public static void main(String[] args) {
		ThisKeyword k=new ThisKeyword(21,"amir","blue");
		ThisKeyword b=new ThisKeyword(9,"george","red");
		k.display();
		b.display();
	}
}

