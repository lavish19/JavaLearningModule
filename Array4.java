import java.util.Scanner;
public class Array4 {
	public static  void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		n=s.nextInt();
		int [] a=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("the elements of the array is");
		for(int j=0;j<n;j++) {
			System.out.println(a[j]);
		}
		System.out.println("enter the value of the element to be searched ");
		int v;
		v=s.nextInt();
		for(int k=0;k<n;k++) {
			if(a[k]==v){
				System.out.println("value found "+a[k]+" at array index position "+ k);
				break;
			}
			else {
				continue;
		}
	}
	}
}
