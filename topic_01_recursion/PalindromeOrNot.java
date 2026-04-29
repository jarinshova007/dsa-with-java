public class PalindromeOrNot {
    public static void palindromeOrNot(String str, int idx) {
        if (idx == str.length() / 2) {
            System.out.println("palindrome!");
            return;
        }
        char left = str.charAt(idx);
        char right = str.charAt(str.length() - 1 - idx);

        if (left == right) {
            palindromeOrNot(str, idx + 1);
        } else {
            System.out.println("not palindrome!");
            return;
        }
    }

    // in a different way
    public static boolean isPalindrome(String str, int idx) {
        if (idx == str.length() / 2) {
            return true;
        }
        char right = str.charAt(idx);
        char left = str.charAt(str.length() - idx - 1);
        if (right == left) {
            return isPalindrome(str, idx + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "level";
        palindromeOrNot(str, 0);
    }
}