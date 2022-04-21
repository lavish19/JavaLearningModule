// A Java Program to show implementation
// of Stack using ArrayDeque

import java.util.*;

class S4{
    public static void main (String[] args) {
        Deque<Character> stack = new ArrayDeque<Character>();
        stack.push('A');
        stack.push('B');
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
