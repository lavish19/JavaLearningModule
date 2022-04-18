import java.util.Scanner;

//program to demonstrate joining two string using concatenation function
public class Concat {
	public static void main(String[] args) {
		String a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enetr the value of first variable");
		a=s.nextLine();
		System.out.println("enter the value of second variable");
		b=s.nextLine();
		String c=a.concat( b);
		System.out.println("concatenated String is "+c);
		
				
	}

}
