package topic_07_queue;

public class QueueLL {
    static class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;

        // isEmpty
        public boolean isEmpty() {
            return head == null & tail == null;
        }

        // push
        public void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }

            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }

            currNode.next = newNode;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return head.data;
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                System.out.println("Empty queue!");
                return -1;
            }

            int front = head.data;
            head = head.next;
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
