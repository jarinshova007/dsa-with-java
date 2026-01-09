// // print all the unique subsequences of a string

import java.util.HashSet;

public class UniqueSubsequences {
    public static void printUniqueSubsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }
        
        char currentChar = str.charAt(idx);
        // to be
        printUniqueSubsequences(str, idx + 1, newString + currentChar, set);

        // not to be
        printUniqueSubsequences(str, idx + 1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        // HashSet
        HashSet<String> set = new HashSet<String>();

        // method call
        printUniqueSubsequences(str, 0, "", set);
    }
}
