import java.util.Scanner;

//program to illustrate comparison of strings using comparison function
public class StringCompare {
	public static void main(String[] args) {
		String a,b,c;
		System.out.println("enter the value of three strings");
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		b=s.nextLine();
		c=s.nextLine();
		if(a.equals(b) && a.equals(c)){
			System.out.println("All enterd strings are equal"+ a + b + c);}
			else if(a.equals(b)) {
				System.out.println("String A equals B");
			}
			else if(a.equals(c)) {
				System.out.println("String A equals C");
			}
			else if(b.equals(c)) {
				System.out.println("strings B equals c");
			}
		
		
		else
			{System.out.println("Strings are not equal");}
	}
}
