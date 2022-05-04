import java.util.*;
public class Arl2 {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(9);
		for(int i=0;i<9;i++) {//using for loops
			System.out.println(a.get(i));
			
		}
		System.out.println("using advance loops");
		for(Integer i:a)	
			System.out.println(i);
		System.out.println("using while loop");
		int count=0;
		while(a.size()>count)	{
			System.out.println(a.get(count));
		}
		System.out.println("using iterator");
		Iterator it=a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
