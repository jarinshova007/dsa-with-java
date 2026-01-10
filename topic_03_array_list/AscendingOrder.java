package topic_03_array_list;
// Take an ArrayList of numbers as input and check if it is an array sorted in ascending order

import java.util.ArrayList;

public class AscendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // input
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(11);
        numbers.add(9);

        boolean isSorted = true;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) >= numbers.get(i + 1)) {
                isSorted = false;
            }
        }

        if (isSorted) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }
}
