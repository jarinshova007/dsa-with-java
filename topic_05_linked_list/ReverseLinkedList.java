package topic_05_linked_list;
// reverse a linkedlist without using extra space and usinng extra space

public class ReverseLinkedList {
    private int size;

    ReverseLinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node head;

    // addLast
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        size--;

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    // addFirst
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // printList
    public void printList() {
        if (head == null) {
            System.out.println("This is an empty list!");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // size
    public int size() {
        return size;
    }

    // iterative approach
    // Time complexity - O(n)
    // Space complexity - O(1)
    public void reverseListIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null; // cutting the prevNode to currNode connection (at the beginning)
        head = prevNode; // new head is the last node because at the end current node is null
    }

    // recursive approach
    // Time complexity - O(n)
    // Space complexity - O(1)
    public Node reverseListRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // reverse using extra space:
    // Time complexity - O(n)
    // Space complexity - O(n)
    public void reverseUsingExtraSpace() {
        if (head == null || head.next == null) {
            return;
        }
        ReverseLinkedList newList = new ReverseLinkedList();

        Node currNode = head;
        while (currNode != null) {
            newList.addFirst(currNode.data);
            currNode = currNode.next;
        }
        head = newList.head;
    }

    public static void main(String[] args) {
        // reverse with Collections
        // Time complexity - O(n)
        // Space complexity - O(1)

        ReverseLinkedList list = new ReverseLinkedList();

        list.printList(); // This is an empty list!

        // add elements
        list.addLast("this");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");

        // print list
        list.printList();

        // iterative method call
        list.reverseListIterate();
        list.printList();

        // recursive method call
        list.head = list.reverseListRecursive(list.head);
        list.printList();

        // reverseUsingExtraSpace method call
        list.reverseUsingExtraSpace();
        list.printList();
    }
}
