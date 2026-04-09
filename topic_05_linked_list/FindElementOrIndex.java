package topic_05_linked_list;
// Make a Linked List & add the following elements to it : (1, 5, 7, 3, 8, 2, 3). Search for the number 7 & display its index

import java.util.Scanner;

public class FindElementOrIndex {
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

    // findNum
    public int findIdx(int el) {
        if (head == null) {
            return -1;
        }

        int idx = 1;
        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == el) {
                return idx;
            }
            currNode = currNode.next;
            idx++;
        }
        return -1;
    }

    // find element
    public int findElement(int idx) {
        if (head == null) {
            return -1;
        }

        Node currNode = head;

        int i = 1;
        while (i < idx) {
            currNode = currNode.next;
            i++;
        }
        return currNode.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FindElementOrIndex list = new FindElementOrIndex();
        list.addLast(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);

        // find index
        System.out.print("element = ");
        int el = sc.nextInt();

        int idx = list.findIdx(el);

        if (idx > 0) {
            System.out.println(el + " is found at index: " + idx);
        } else {
            System.out.println("Not found!");
        }

        // find element
        System.out.print("index = ");
        int index = sc.nextInt();

        System.out.println("The element at index " + index + ": " + list.findElement(index));
    }
}
