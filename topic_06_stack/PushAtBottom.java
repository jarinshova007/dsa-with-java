
// push an element at the bottom of a stack
import java.util.Stack;

public class PushAtBottom {
    // recursive way
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // in a different way
    // public static void pushAtBottom(Stack<Integer> s, int data) {
    // if (s.isEmpty()) {
    // s.push(data);
    // return;
    // }
    //
    // Stack<Integer> newStack = new Stack<>();
    //
    // while (!s.isEmpty()) {
    // newStack.push(s.pop());
    // }
    //
    // s.push(data);
    // while (!newStack.isEmpty()) {
    // s.push(newStack.pop());
    // }
    // }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottom(s, 11);

        // print // 4 3 2 1 11
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}