package topic_05_linked_list;

// scratch implementations of linked list
public class LLScratchImplementation {
    // declaration of head node
    Node head;
    private int size;

    // constructor
    LLScratchImplementation() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        // constructor
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
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

    // removeFirst
    public void removeFirst() {
        if (head == null) {
            return;
        }

        size--;

        head = head.next;
    }

    // addLast
    public void addlast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // print linkedList
    public void printList() {
        if (head == null) {
            System.out.println("This list is empty!");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // removeLast
    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        size--;

        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLastNode = lastNode;
            lastNode = lastNode.next;
        }
        secondLastNode.next = null;
    }

    // size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LLScratchImplementation list = new LLScratchImplementation();

        // addFirst & addLast
        list.addFirst("is");
        list.addlast("a");
        list.addFirst("this");
        list.addlast("linked");
        list.addlast("list");

        // printList
        list.printList();

        // removeFirst
        list.removeFirst();
        list.printList();

        // removeLast
        list.removeLast();
        list.printList();

        // print size
        System.out.println("size of the list: " + list.size());
    }
}