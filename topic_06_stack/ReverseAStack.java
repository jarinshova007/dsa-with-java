package topic_06_stack;

import java.util.Stack;

public class ReverseAStack {

    // reverseIterate
    public static void reverseIterate(Stack<Integer> s) {
        Stack<Integer> newStack = new Stack<>();

        // copy element
        while (!s.isEmpty()) {
            newStack.push(s.pop());
        }

        // print
        while (!newStack.isEmpty()) {
            System.out.println(newStack.peek());
            newStack.pop();
        }
    }

    // reverseRecursive
    public static void reverseRecursive(Stack<Integer> s) {
        if (s.isEmpty()) {
            System.out.println("Empty stack!");
            return;
        }
        int top = s.pop();
        reverseRecursive(s);
        s.push(top);
    }

    public static void main(String[] args) {
        // classical approach
        Stack<Integer> s = new Stack<>();
        // Stack<Integer> newStack = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // call reverseIterate
        // reverseIterate(s);

        reverseRecursive(s);

        // print
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
