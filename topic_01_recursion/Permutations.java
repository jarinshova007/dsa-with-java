public class Permutations {
    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
        char current = str.charAt(i);
        // "abc" -> "ab"
        String newString = str.substring(0, i) + str.substring(i + 1);
        printPerm(newString, permutation + current);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";

        // method call
        // time complexity: O(n!)
        printPerm(str, "");
    }
}
