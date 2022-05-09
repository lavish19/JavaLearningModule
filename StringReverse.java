
public class StringReverse  {
	public static void main(String[] args){
		String str="hello friends";
		String [] strArray=str.split(" ");
		for(String temp:strArray) {
			System.out.println(temp);
		}
		for(int i=0;i<3;i++) {
			char[] a=strArray[i].toCharArray();
			for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j]);
			System.out.print(" ");
		}
		
			
	}

}}
