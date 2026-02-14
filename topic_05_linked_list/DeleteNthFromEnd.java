package topic_05_linked_list;
// Find the nth node from the end & remove it.

// Time complexity - O(n)
// Space complexity - O(1)

public class DeleteNthFromEnd {
    class NodeList {
        int data;
        NodeList next;

        NodeList(int data) {
            this.data = data;
            this.next = null;
        }

        NodeList() {
            this.next = null;
        }
    }

    // head
    NodeList head;

    // new node
    NodeList dummy = new NodeList();

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // addLast
    public void add(int data) {
        NodeList newNode = new NodeList(data);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        NodeList currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteNthFromEnd(int n) {
        // size
        int size = 0;
        NodeList currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            size++;
        }

        if (n == size) {
            head = head.next;
            return;
        }

        int idxToSearch = size - n;
        NodeList prevNode = head;

        int i = 1;
        while (i < idxToSearch) {
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
    }

    // print list
    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        NodeList currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteNthFromEnd list = new DeleteNthFromEnd();

        // add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.print();
        System.out.println();

        // deleting the 4th node fron last
        list.deleteNthFromEnd(4);
        list.print();
    }
}
