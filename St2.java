import java.util.*;
public class St2 {
	public static void main(String[] args) {
		Stack <Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println("is stack is empty "+s.empty());
		System.out.println(s);
		System.out.println("size of the stack "+s.size())	;
		System.out.println("iterating stack through advance loop ");
		for(Integer i:s)
			System.out.println(i);
		
	}

}
