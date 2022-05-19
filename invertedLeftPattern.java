import java.util.Scanner;

//program to print left star pattern 
public class invertedLeftPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter the number ");
		n=s.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
			}
	
	}


