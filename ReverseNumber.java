import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		int n,r,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter  the number ");
		n=s.nextInt();
		int temp=n;
		while(temp>0) {
			r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
			
		}
		System.out.println("reverse number is "+sum);
		}
				
	}


