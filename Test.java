//program to demonstrate stack implementation
import java.util.*;
import java.io.*;
class Test {
	static void stack_push(Stack<Integer> stack) {
		System.out.println("Stack push operation");
		for(int i=0;i<=5;i++) {
			stack.push(i);
		}
	}
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Stack pop operation");
		for(int i=0;i<=5;i++) {
		Integer y=(Integer) stack.pop();
		System.out.println(y);
	}}
		static void stack_peek(Stack<Integer> stack) {
			System.out.println("Stack peek operation");
			Integer element=(Integer) stack.peek();
			System.out.println("element on top of the stack "+element);
		}
		static void stack_search(Stack<Integer> stack,int element) {
			Integer pos=(Integer)stack.search(element);
			if(pos==-1) {
				System.out.println("element not found");
			}
			else
				System.out.println("element found at position "+pos);
			
		}
		public static void main(String[] args) {
			Stack <Integer> stack=new Stack<Integer>();
			stack_push(stack);
			stack_pop(stack);
			stack_push(stack);
			stack_peek(stack);
			stack_search(stack,2);
			stack_search(stack,6);
		}
		}
		


