public class MoveAllX {
    public void moveAllX(String str, int idx, String newStr, int count) {
        // base case
        if (idx == str.length()) {
            for (int i = 1; i <= count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char current = str.charAt(idx);
        if (current == 'x') {
            //moveAllX(str, idx + 1, newStr, count + 1);
            count++;
            moveAllX(str, idx + 1, newStr, count);
        } else {
            // newString += current;
            // moveAllX(str, idx + 1, newStr, count);
            moveAllX(str, idx + 1, newStr + current, count);
        }
    }
    public static void main(String[] args) {
        String str = "xRxexmxxi"; // Remixxxxx

        // method call
        MoveAllX mvx = new MoveAllX();
        mvx.moveAllX(str, 0, "", 0);
    }
}
