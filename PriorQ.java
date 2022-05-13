// Java program to add elements
// to a Queue

import java.util.*;

public class PriorQ {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("h");
		pq.add("f");
		pq.add("a");

		System.out.println(pq);
	}
}
