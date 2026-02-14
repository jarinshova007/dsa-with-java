package topic_05_linked_list;

import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;

// LinkedList with collection framework

/* ArrayList vs LinkedList
    time complexity:
    insert: O(n) > O(1)  // LinkedList is better than arrayList for manipulation
    search: O(1) < O(n)  // ArrayList is better than LinkedList for search
 */
public class LinkedLists {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        // taking input for all items:
        // int size = 5;
        // taking input:
        // for (int i = 0; i < size; i++) {
        // list.add(sc.nextLine());
        // }

        // add items
        list.add("LIST");
        list.addFirst("a");
        System.out.print("Take input for this index: ");
        list.addFirst(sc.nextLine()); // is
        list.addFirst("This");
        list.addLast("list");
        list.remove(3);

        // add in between
        list.add(3, "Linked");

        // print
        System.out.println(list);

        // get and set
        list.set(3, "linked");
        String element = list.get(3);
        System.out.println(element); // linked

        // print size
        System.out.println("size: " + list.size());

        // print all element
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        // reverse
        // Time complexity - O(n)
        // Space complexity - O(1)

        // before reversing we can copy the list in a new list and reverse the new list,
        // so that our list will remain the same:
        // create a new list and copy items:
        // LinkedList<String> newList = new LinkedList<>();

        // int sizeOfNewList = list.size();

        // for (int i = 0; i < sizeOfNewList; i++) {
        // newList.addLast(list.get(i));
        // }

        // Collections.reverse(newList);

        Collections.reverse(list);
        System.out.println(list);

        // remove first
        // list.removeFirst();

        // remove last
        // list.removeLast();

        // remove item with index
        // list.remove(2);

        // remove item with object
        // list.remove("This");

        // find index without traverse
        int idx = list.indexOf("lists");
        if (idx >= 0 && idx < list.size()) {
            System.out.println("found at idx: " + idx);
        } else {
            System.out.println("not found!");
        }

        // find index with traverse
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == "lists") {
                System.out.println(list.get(i) + " is found at index: " + i);
                return;
            }
        }
        System.out.println("not found!");
    }
}
