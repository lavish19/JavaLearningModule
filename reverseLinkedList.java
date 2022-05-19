//program to reverse linked list
import java.util.*;
public class reverseLinkedList {
public static void main(String []args) {
	LinkedList <Integer> ll=new LinkedList<>();
	ll.add(5);
	ll.add(9);
	ll.add(10);
	ll.add(8);
	System.out.println("original linkedlist "+ll);
	LinkedList <Integer> ll1=new LinkedList<>();
	ll.descendingIterator().forEachRemaining(ll1::add);
	System.out.println("reversed linked list");
	System.out.println(ll1);
}
}
