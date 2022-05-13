import java.util.Scanner;
public class NumPow {
	public static void main(String[] args) {
		int n; int r=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		n=s.nextInt();
		System.out.println("enter the power of the number");
		int p;
		p=s.nextInt();
		for(int i=0;i<p;i++) {
			r*=n;
		}
		System.out.println("calculated power of the number is "+r);
	}

}
