import java.util.Scanner;
public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int number=1;
		int spaces=n;
		for(int i=0;i<=n;i++) {
			for(int s=1;s<=spaces;s++) {
				System.out.print(" ");
			}
			number=1;
			for(int j=0;j<=i;j++) {
				System.out.print(number +" ");
				number=number*(i-j)/(j+1);
			}
			spaces--;
			System.out.println();
		}
	}

}
