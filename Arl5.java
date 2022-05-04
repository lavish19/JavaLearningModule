import java.util.*;
public class Arl5 {
	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add("india");
		a.add("america");
		a.add("sri-lanka");
		a.add("australia");
		a.add("sauarv");
		System.out.println("elements before sorting");
		for(String h:a)
			System.out.println(h);
	Collections.sort(a);
	 System.out.println("elements after sorting ");
	 for(String q:a	)
		 System.out.println(q);
	
	}
}
