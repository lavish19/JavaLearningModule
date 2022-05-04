import java.util.*;
public class Arl6 {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(9);
	a.add(2);
	a.add(8);
	System.out.println("arraylist before sorting");
	for(Integer l:a)
		System.out.println(l);
	Collections.sort(a);
	System.out.println("arraylist after sorting");
	for(Integer k:a)
		System.out.println(k);
}
}
