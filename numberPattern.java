import java.util.Scanner;
public class numberPattern {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n;
	System.out.println("enter the number");
	n=s.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++){
			System.out.print(i+1);
		}
		System.out.println();
	}
}
}
