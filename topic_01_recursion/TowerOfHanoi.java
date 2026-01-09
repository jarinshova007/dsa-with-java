import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Disk " + n + " is successfully transferred from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Disk " + n + " is successfully transferred from " + source + " to " + destination);
        towerOfHanoi(n - 1, helper, source, destination);
        //System.out.println("Disk " + (n - 1) + " is successfully transferred from " + source + " to " + destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        // method call
        towerOfHanoi(n, "S", "H", "D"); // time complexity : O(2^n - 1)
    }
}