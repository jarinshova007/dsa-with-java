import java.util.ArrayList;

public class StackAL {
    public static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push -> O(1)
        public void push(int data) {
            list.add(data);
        }

        // pop -> O(1)
        int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek -> O(1)
        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        // print (at last the stack becomes empty because of pop()ing)
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
