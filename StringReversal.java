import java.util.Scanner;
public class StringReversal {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str;
	System.out.println("enter the string");
	str=s.nextLine();
	int length=str.length();
	char [] a=str.toCharArray();
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(a[i]);
	}
	}

}

