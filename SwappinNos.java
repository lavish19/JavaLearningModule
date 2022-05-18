import java.util.Scanner;

//program to demonstrate swapping of numbers without using third variable

public class SwappinNos {
	public static void main(String [] args) {
		int n,m;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers ");
		n=s.nextInt();
		m=s.nextInt();
		System.out.println("entered numbers are "+n+" "+m);
		n=n+m;
		m=n-m;
		n=n-m;
		System.out.println("swapped numbers are "+n+" "+m);

}
	}
