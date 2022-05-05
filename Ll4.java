import java.util.LinkedList;
import java.util.*;
import java.util.ListIterator;
public class Ll4{
	public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<String>();
	l.add("mysore");
	l.add("bhopal");
	l.add("banglore");
	l.add("chandigarh");
	ListIterator list=l.listIterator();
	while(list.hasNext()) {
		System.out.println(list.next())	;
		
	}
	System.out.println("iterating bakwards");
	while(list.hasPrevious())	{
		System.out.println(list.previous());
	}
}}