package topic_03_array_list;

import java.util.ArrayList;
import java.util.Scanner;

// find an integer number x from a 1D ArrayList
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(13);
        list.add(11);

        System.out.print("element = "); // 13
        int el = sc.nextInt();

        // search
        int idx = list.indexOf(el);
        System.out.println("index of " + el + ": " + idx); // 3
    }
}
