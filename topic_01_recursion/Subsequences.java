// print all the subsequences of a string
public class Subsequences {
    public static void printSubsequence(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        
        char currentChar = str.charAt(index);
        // to be
        printSubsequence(str, index + 1, newString + currentChar);
        
        // not to be
        printSubsequence(str, index + 1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";

        // method call
        // time complexity: O(2^n)
        printSubsequence(str, 0, "");
    }
}
