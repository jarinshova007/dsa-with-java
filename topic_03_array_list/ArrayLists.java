package topic_03_array_list;
// ArrayList and it's operations

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/* ArrayList vs LinkedList
    time complexity:
    insert: O(n) > O(1)  // LinkedList is better than arrayList for manipulation
    search: O(1) < O(n)  // ArrayList is better than LinkedList for search
 */
public class ArrayLists {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list = new ArrayList<String>();
        // ArrayList<Float> list = new ArrayList<Float>();
        
        // add element
        list.add(1);
        list.add(2);
        list.add(13);
        System.out.print("Take input for this index: ");
        list.add(sc.nextInt()); // user will take the input // 5
        
        // print list
        System.out.println(list); // 1, 2, 13, 5
        
        // get element
        int el = list.get(2);
        System.out.println(el); // 13
        
        // set element
        list.set(2, 3);
        
        // print all the elements
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // add element in between
        list.add(3, 4);
        System.out.println(list); // 1, 2, 3, 4, 5
        
        // remove element
        list.remove(3);
        System.out.println(list); // 1, 2, 3, 5
        
        // print size
        int size = list.size(); // 4
        System.out.println("size of list: " + size);
        
        // sorting
        // setting 12 at 1st index
        list.set(1, 12);
        System.out.println("before sorting: " + list); // 1, 12, 3, 5
        Collections.sort(list);
        System.out.println("after sorting: " + list); // 1, 3, 5, 12
        
        // find index without traverse
        int element = 5;
        int idx = list.indexOf(element);
        if (idx >= 0 && idx < list.size()) {
            System.out.println("found at idx: " + idx);
        } else {
            System.out.println("not found!");
        }

        // traverse and find index
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                System.out.println("found at index: " + i);
                return;
            }
        }
        System.out.println("not found!");
    }
}
