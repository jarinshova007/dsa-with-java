// Stack with Linked List

public class StackLL {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class Stack {
        // head node
        Node head;

        // isEmpty method
        public boolean isEmpty() {
            return head == null;
        }

        // push -> O(1)
        public void push(int data) {
            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;
        }

        // pop -> O(1)
        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            Node top = head;
            head = head.next;
            return top.data;
        }

        // peek -> O(1)
        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            Node top = head;
            return top.data;
        }
    }

    public static void main(String[] args) {
        // create an empty stack
        Stack s = new Stack();

        // push elements
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // print (at last the stack becomes empty because of pop()ing)
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
