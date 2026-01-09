// Print all the subsets of a set of first n natural numbers

import java.util.ArrayList;
// time complexity: O(2^n)
public class SubsetsOfNaturalNum {
    // printSubset method to print ArrayList
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        
        // to be
        subset.add(n); // add number
        findSubset(n - 1, subset);

        // not to be
        subset.remove(subset.size() - 1); // remove the number that has been added recently
        findSubset(n - 1, subset);
    }
    public static void main(String[] args) {
        int n = 3;

        // ArrayList
        ArrayList<Integer> subset = new ArrayList<>();

        // method call
        findSubset(n, subset);
    }
}
