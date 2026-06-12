package topic_07_queue;

public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;

        // isEmpty - O(1)
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // push - O(1)
        public void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // peek - O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return head.data;
        }

        // pop - O(1)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Empty queue!");
                return -1;
            }

            int front = head.data;

            if (head == tail) { // for only one element
                head = tail = null;
            } else {
                head = head.next;
            }

            return front;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.peek();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.pop();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        } // result 2, 3, 4
    }
}
