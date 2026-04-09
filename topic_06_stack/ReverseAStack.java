import java.util.Stack;

// reverse a stack
public class ReverseAStack {
    // push at bottom
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    // reverseRecursive
    public static void reverseRecursive(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseRecursive(s);
        pushAtBottom(s, top);
    }

    // reverseIterate
    public static Stack<Integer> reverseIterate(Stack<Integer> s) {
        Stack<Integer> newStack = new Stack<>();

        if (s.isEmpty()) {
            return s;
        }

        while (!s.isEmpty()) {
            newStack.push(s.pop());
        }
        return newStack;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        // reverse recursive call
        reverseRecursive(s); // 1, 2, 3, 4, 5

        // // print
        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }

        System.out.println();

        // reverse iterate call
        s = reverseIterate(s); // 5, 4, 3, 2, 1

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}