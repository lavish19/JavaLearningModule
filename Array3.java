import java.util.Scanner;
public class Array3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				System.out.println("enter the narray size");
				int n=s.nextInt();
				int sum=0;
		int [] a=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enterd elements are ");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
			
		}
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		System.out.println("sum of the elements of the array is "+sum);
		
		
		
	}

}
