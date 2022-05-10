import java.util.Scanner;
import java.util.*;

public class Caps {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in) ;
		System.out.println("enter the String/sentence");
		String str;
		str=s.nextLine();
		String upCase;
		Scanner strScan=new Scanner(str);
		while(strScan.hasNext()) {
			String word=strScan.next();
			upCase+=Character.toUpperCase(word.charAt(0)+word.substring(1)+" ");
		}
		System.out.println("origrinal sentence "+str);
		System.out.println("capitalized first letter sentence "+upCase.trim());
		
	}

}
