import java.util.Scanner;//program to check Armstrong number
public class ArmstrongN {
public static void main(String[] args) {
	int n,r=0,sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number to be checked");
	n=s.nextInt();
	int temp=n;
	while(temp>0) {
		r=temp%10;
		sum+=r*r*r;
		temp=temp/10;
			
	}
	if(sum==n) {
		System.out.println("Armstrong number");
	}
	else
		System.out.println("not an armstrong number");
}
}
