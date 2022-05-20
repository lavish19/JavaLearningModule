import java.util.Scanner;
public class leftTriangle {
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	n=s.nextInt();
	for(int i=n;i>=0;i--) {
		for(int j=0;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=n-i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
