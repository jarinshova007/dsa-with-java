// Remove duplicates in a String

public class RemoveDuplicateChar {
    // map for capital letter
    public static boolean mapCap[] = new boolean[26];
    // map for small letter
    public static boolean mapSmall[] = new boolean[26];
    
    // removes duplicates letters only
    public static void removeDuplicate(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);

        if (currentChar >= 'a' && currentChar <= 'z') {
            if (mapSmall[currentChar - 'a']) {
            removeDuplicate(str, idx + 1, newStr);
            } else {
            mapSmall[currentChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr + currentChar);
            }
        } else if (currentChar >= 'A' && currentChar <= 'Z') {
            if (mapCap[currentChar - 'A']) {
            removeDuplicate(str, idx + 1, newStr);
            } else {
            mapCap[currentChar - 'A'] = true;
            removeDuplicate(str, idx + 1, newStr + currentChar);
            }
        } else {
            removeDuplicate(str, idx + 1, newStr + currentChar);
        }
    }
        public static void main(String[] args) {
            String str = "aAaAbBbBBcCccCCddDDdeeeE@ . @ . jjjJJjJj";
            removeDuplicate(str, 0, ""); // aAbBcCdDeE@ . @ . jJ
    }
}
