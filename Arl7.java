import java.util.*;
public class Arl7 {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	a.add("q");
	a.add("O");
	a.add("s");
	a.add("B");
	System.out.println("normal order sorting");
	Collections.sort(a);
	for(String e:a)
		System.out.println(e);
	Collections.sort(a,Collections.reverseOrder());
	System.out.println("after reverse/descending order sorting");
	
	for(String g:a)	
		System.out.println(g);
	ArrayList<Integer> s=new ArrayList<Integer>();
	s.add(3);
	s.add(9);
	s.add(0);
	s.add(1);
	s.add(2);
	s.add(69);
	System.out.println("noraml sorting");
	Collections.sort(s);
	for(Integer i:s)
		System.out.println(i);
	System.out.println("sorting in descending order");
	Collections.sort(s,Collections.reverseOrder());
	for(Integer b:s) {
		System.out.println(b);
	}
}
}
