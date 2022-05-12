import java.util.Scanner;//for value 5
public class HollowDiamond {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,j,n;
		System.out.println("enter the value of n");
		n=s.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if((i+j==4)||(i-j==2)||(i+j==8)||(j-i==2)) 
					System.out.print("*");
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			
		
	}

}
