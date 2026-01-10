package topic_03_array_list;

import java.util.ArrayList;

// Find the maximum & minimum number in a 1D arrayList of integer numbers
class MaxAndMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        // add
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(13);
        list.add(11);

        int max = list.get(0);
        int min = list.get(0);
        int idxOfMax = 0;
        int idxOfMin = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                idxOfMax = i;
            }
            if (list.get(i) < min) {
                min = list.get(i);
                idxOfMin = i;
            }
        }
        System.out.println("maximum = " + max + ", index = " + idxOfMax); // 13, idx = 3
        System.out.println("minimum = " + min + ", index = " + idxOfMin); // 1, idx = 2
    }
}