package topic_03_array_list;

import java.util.ArrayList;

// read and print a 2D ArrayList
class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //way1:
        // row1
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        // row2
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        list.add(row1);
        list.add(row2);

        // print list
        System.out.println(list);

        // print with loop to have the proper output
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // way2 (initialize with loop):
        ArrayList<ArrayList<Integer>> _list = new ArrayList<>();

        for (int i = 0; i <=)

        // way3 (taking input from user):
    }
}