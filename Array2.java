import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n,sum=0,average=0;
		n=s.nextInt();
		int [] array=new int[9];
		System.out.println("enter the elements of the array");
		for(int i=0;i<=n;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("entered elements are ");
		for(int i=0;i<=n;i++) {
			System.out.println(array[i]);
		}
		System.out.println("Average of the array elements are");
		for(int i=0;i<=n;i++) {
			sum+=array[i];
		}
		System.out.println("the summ of all elements of the array "+sum);
		System.out.println("therefore the average of the array elements are ");

		System.out.println(sum/n);
	}

}
