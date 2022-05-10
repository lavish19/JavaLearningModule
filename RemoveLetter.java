import java.util.Scanner;

public class RemoveLetter {
	public static void removeChar(String s, char c) {
		int n=s.length();
		int j;
		int count =0;
		char[] t=s.toCharArray();
		for(int i=j=0;i<n;i++) {
			if(t[i]!=c)
				t[j++]=t[i];
			else
				count++;
		}
		while(count>0) {
			t[j++]='\n';
			count--;
		}
		System.out.println(t);
	}
	

}
class Execute{
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter the String/sentence ");
		String str=a.nextLine();
		System.out.println("enter the letter to be removed ");
		String ltr=a.nextLine();
		char l=ltr.charAt(0);
		RemoveLetter r=new RemoveLetter();
		a.removeChar(str,l);
	}
}
