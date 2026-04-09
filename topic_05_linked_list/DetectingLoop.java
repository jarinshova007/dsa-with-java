package topic_05_linked_list;
// Detecting Loop in a Linked List

// Time complexity - O(n)
// Space complexity - O(1)

public class DetectingLoop {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head node
    Node head;

    // addLast
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print
    public void print() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public boolean detectLoop() {
        if (head == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectingLoop list = new DetectingLoop();
        list.addLast(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);

        if (list.detectLoop()) {
            System.out.println("There is a loop");
        } else {
            System.out.println("There is no loop");
        } // there is no loop or cycle

        // connecting last loop to the 3rd node from head (7)
        list.head.next.next.next.next.next.next.next = list.head.next.next;

        if (list.detectLoop()) {
            System.out.println("There is a loop");
        } else {
            System.out.println("There is no loop");
        } //// there is a loop or cycle
    }
}
