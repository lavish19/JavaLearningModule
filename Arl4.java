import java.util.*;
public class Arl4 {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		System.out.println("before operations arraylist size "+a.size());
		a.add(9);
		a.add(5);
		a.add(4);
		System.out.println("after operation arraylist size "+a.size());
		a.remove(1);
		a.remove("4");
		a.add(2,0);
		a.add(3,3);
		a.add(0,1);
		a.add(1,8);
		System.out.println("Arraylsit size "+a.size());
		System.out.println("arraylist elements are ");
		for(Integer n:a)	
			System.out.println(n);
	}

}
