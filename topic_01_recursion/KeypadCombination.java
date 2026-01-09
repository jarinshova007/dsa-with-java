// print keypad combination of button phone
public class KeypadCombination {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printComb(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentDigit = str.charAt(idx);
        String maping = keypad[currentDigit - '0'];
        for (int i = 0; i < maping.length(); i++) {
            printComb(str, idx + 1, newString + maping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23"; // input

        // method call
        // time complexity: O(4^n)
        printComb(str, 0, "");
    }
}
