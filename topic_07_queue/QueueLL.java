package topic_07_queue;

public class QueueLL {
    class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class Queue {
        Node head = null;
        Node tail = null;

        // isEmpty
        public boolean isEmpty() {
            return head == null & tail == null;
        }
    }

    public static void main(String[] args) {

    }
}
