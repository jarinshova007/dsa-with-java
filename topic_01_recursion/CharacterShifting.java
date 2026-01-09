// abczEfGZ to bcdaFgHA

import java.util.Scanner;

public class CharacterShifting {
    public static void charShifting(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(idx);
        if (current >= 'a' && current <= 'z') {
            if (current == 'z') {
                newStr += 'a';
                charShifting(str, idx + 1, newStr);
            } else {
            char newCurrent = (char) (current + 1);
                charShifting(str, idx + 1, newStr + newCurrent);
            }
        } else if (current >= 'A' && current <= 'Z') {
            if (current == 'Z') {
                newStr += 'A';
                charShifting(str, idx + 1, newStr);
            } else {
            newStr += (char) (current + 1);
                charShifting(str, idx + 1, newStr);
            }
        }
    }
    public static void main(String[] args) {
        String str = "abczEfGZ";
        charShifting(str, 0, "");
    }
}
