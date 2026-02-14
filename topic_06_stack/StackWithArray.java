package topic_06_stack;
// implement a stack with array

public class StackWithArray {

    static class Stack {
        int arr[] = new int[150];
        int top = 0;

        // isEmpty
        public boolean isEmpty() {
            return arr.length == 0;
        }

        // push
        public void push(int data) {
            if (isEmpty()) {
                arr[top] = data;
                return;
            }
            arr[top + 1] = data;
        }

        // pop
        public int pop() {
            int top = arr[arr.length - 1];
            top = arr[arr.length - 2];
            return
        }
    }

    public static void main(String[] args) {

    }
}
