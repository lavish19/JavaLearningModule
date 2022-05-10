import java.util.Scanner;

public class CntVowels {
	public static void main(String[] args) {
		int a = 0,e = 0,i = 0,o = 0,u=0;
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the statement");
		str=s.nextLine();
		str=str.toLowerCase();
		for(int j=0;j<str.length();j++) {
			char ch=str.charAt(j);
			if(ch=='a') {
				++a;
			}
			else if(ch=='e') {
				++e;
			}
			else if(ch=='i') {
				++i;
			}
			else if(ch=='o') {
				++o;
			}
			else if(ch=='u') {
				++u;
			}
		}System.out.println("entered statement "+str);
		System.out.println("frequency of vowels ");
		System.out.println("a-"+a+" e- "+e+" i- "+" o- "+" u- "+u);
	}

}
