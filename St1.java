import java.util.*;
public class St1 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(9);
		s.push(10);
		s.push(99);
		s.push(0);
		s.push(02);
		System.out.println("is stack is empty "+s.empty());
		System.out.println("elements of stack is "+ s);
		s.pop();//deletes last elements from the stack
		System.out.println(s);
		s.remove(1);
		System.out.println(s);
		
		
		
	}

}
