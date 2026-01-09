package topic_05_linked_list;

public class PrintLinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        // constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // print linked list
    public void printLinkedList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            System.out.print(currentNode + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        PrintLinkedList list = new PrintLinkedList();

    }
}
