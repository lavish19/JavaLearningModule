import java.util.Scanner;
class SwappinChar{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string");
	String str;
	str=s.nextLine();
	char[] a=str.toCharArray();
	char temp= a[0];
	a[0]=a[a.length-1];
	a[a.length-1]=temp;
	System.out.println(a);
	}
}