package topic_04_linked_list;
import java.util.LinkedList;
import java.util.logging.Handler;
// add first and add last operations of linkedlist
public class Adding {
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
    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode = head;
            return;
        }
        // traverse
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // print linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // add first / last
        Adding list = new Adding();
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("a");
        list.addLast("linked list");

        // print
        list.printList();
    }
}