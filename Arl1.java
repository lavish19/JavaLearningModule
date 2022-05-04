import java.util.ArrayList;
import java.util.*;
public class Arl1{
	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList<String>();
		a.add("rohan");
		a.add("shyam");
		a.add("neel");
		System.out.println("original arraylist is ");
		for(String str:a)	
			System.out.println(str);
			a.add(0,"Ram");
			a.add(1,"jhon");
			System.out.println("arraylist after add operation ");
			for(String s:a) 
				System.out.println(s);
			a.remove("neel");
			a.remove("rohan");
			System.out.println("arraylist after remove method");
			for(String r:a)	
				System.out.println(r);
			a.remove(1);
			System.out.println("arraylist after remove method");
			for(String f:a)
				System.out.println(f);
				
			}
		}
	
