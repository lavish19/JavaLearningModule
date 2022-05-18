import java.util.Scanner;

//program to check vowels present in string 
public class Vowels {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("enter the string");
		String str=s.nextLine();
		str.toLowerCase();
		char[] a=str.toCharArray();
		for(int i=0;i<=str.length()-1;i++) {
			if((a[i]=='a')||(a[i]=='e')||(a[i]=='i')||(a[i]=='o')||(a[i]=='U')) {
				count++;
			}
			
		}
		System.out.println("the total numbers of vowels present in the string are "+count);
	}

}
