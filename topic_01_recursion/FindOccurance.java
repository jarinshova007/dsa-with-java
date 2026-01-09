// Find the first and last occurance of an element in String

import java.util.Scanner;

public class FindOccurance {
    static int first = -1;
    static int last = -1;
    public static void findOccurance(String str, char element, int idx)  {
        if (idx == str.length()) {
            System.out.println("first: " + first + "\n" + "last: " + last);
        }
        char current = str.charAt(idx);
        if (current == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, element, idx++);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findOccurance(str, 'a', 0);
    }
}
