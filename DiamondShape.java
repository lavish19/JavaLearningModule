import java.util.Scanner;
class DiamondShape{
	public static void main(String[] args) {
		int i,j,k,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n");
		n=s.nextInt();
		for(i=0;i<n;i++) {
			for(j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		    for(i=1;i<=n-1;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(k=0;k<=n-1-i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
