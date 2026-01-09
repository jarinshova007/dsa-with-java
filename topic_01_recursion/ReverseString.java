// Print a String in reverse

import java.util.Scanner;

public class ReverseString {
    public void reverseString(String str, int idx) {
        // base case
        if (idx == -1) {
            /*  if (idx == 0) {
            //System.out.println(str.charAt(idx));
            return;
            } */
            return;
        }

        System.out.print(str.charAt(idx));
        reverseString(str, idx - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("str : ");
        String str = new String(sc.nextLine());
        int index = str.length() - 1;

        // method call
        ReverseString reverse = new ReverseString();
        System.out.print("Reverse str : ");
        reverse.reverseString(str, index);
    }
}
