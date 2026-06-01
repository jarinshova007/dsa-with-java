public class StackWithArray {
    static class Stack {
        int size;
        int arr[];
        int top = -1;

        Stack(int size) {
            this.size = size;
            this.arr = new int[size];
        }

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
                System.out.println("Stack is full! Cannot push " + data);
                return;
            }

            arr[++top] = data;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }

            return arr[top];
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }

            return arr[top--];
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        // push
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(10);
        s.push(11);

        System.out.println();

        // print
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
