
public class StackWithArray {
    // stack Array

    static int size = 5;

    static class Stack {
        int top = -1;

        int arr[] = new int[size];

        // isEmpty
        public boolean isEmpty() {
            return top == -1;
        }

        // isFull
        public boolean isFull() {
            return top == size - 1;
        }

        // push
        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack Overflow! Cannot push " + data);
                return;
            }

            top = top + 1;
            arr[top] = data; // or arr[++top] = data;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack underflow!");
                return -1;
            }

            return arr[top];
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow!");
                return -1;
            }

            int topElement = arr[top];
            top--;
            return topElement; // or return arr[top--];
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.pop(); // underflow
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(12); // overflow

        while (!s.isEmpty()) {
            System.out.println(s.peek()); // 1, 2, 3, 4, 5
            s.pop();
        }
    }
}
