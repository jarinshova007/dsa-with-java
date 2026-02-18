package topic_05_linked_list;
// Find the nth node from end

public class FindNThFromEnd {

    private int size;

    FindNThFromEnd() {
        this.size = 0;
    }

    // Node class
    class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // head
    Node head;

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // addLast
    public void addLast(int data) {
        // new node with the given data
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // print
    public void print() {
        if (isEmpty()) {
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

    public int findNthNodeFromLast(int n) {
        if (isEmpty()) {
            System.out.println("Empty list!");
            return -1;
        }

        Node currNode = head;
        int idxToSearch = size - n + 1;
        int i = 1;
        while (i < idxToSearch) {
            currNode = currNode.next;
            i++;
        }
        return currNode.data;
    }

    public static void main(String[] args) {
        // find n from end

        FindNThFromEnd list = new FindNThFromEnd();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.print();

        int nThNode = list.findNthNodeFromLast(4); // 2
        System.out.println(nThNode);
    }
}
