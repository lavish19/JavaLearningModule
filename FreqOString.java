import java.util.Scanner;
public class FreqOString {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter the string or sentence ");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		int count=0,len=0;
		do {
			try {
				char [] name=str.toCharArray();
				len=name.length;
				count=0;
				for(int i=0;i<name.length;i++) {
					if((name[0]==name[i]) && ((name[0]>=65&&name[0]<=91) || (name[0]>=97 && name[0]<=127))){
						count++;
					}
				}if(count!=0) {
					System.out.println(name[0]+" "+count+"times");
				}
				str=str.replace(""+name[0],"");
			}catch(Exception e) {
				System.out.println(e);
			}
		}while(len!=0);
	}

}
