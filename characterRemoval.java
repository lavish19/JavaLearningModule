import java.util.Scanner;
public class characterRemoval {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string ");
	String str;
	str=s.nextLine();
	str=str.substring(1,str.length()-1);
	System.out.println(str);
	
	
			
}
}
