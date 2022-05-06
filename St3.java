import java.util.*;
public class St3 {
	public static void main(String[] args) {
		Stack <String>	s=new Stack<String>();
		s.push("ball");
		s.push("bat");
		s.push("wickets");
		s.push("gloves");
		System.out.println(s);
		System.out.println("peek element of the stack "+s.peek());
		System.out.println("search element index wickets	"+s.search("wickets"));
		Iterator i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}

}
