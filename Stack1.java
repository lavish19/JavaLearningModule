import java.util.Stack;
public class Stack1 {
	public static void main(String[] args) {
		Stack <String> animal=new Stack<String>();
		animal.push("elephant");
		animal.push("dog");
		animal.push("horse");
		animal.push("cat");
		System.out.println("Stack "+animal);
		System.out.println("popping elements from the stack");
		animal.pop();//deletes the last that is the top element of the stack
		System.out.println("Stack "+animal);
		
		
	}

}
