//program to print factorial of number entered
import java.util.Scanner;
public class Factorial {
public static void main(String [] args) {
	int n; int f=1;
	System.out.println("enter the number");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(int i=1;i<=n;i++) {
		f*=i;;
	}
	System.out.println(f);
}
}
