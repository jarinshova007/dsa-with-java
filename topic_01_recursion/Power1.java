// print x^n (stack height = n)
import java.util.Scanner;

public class Power1 {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xToThePowerNm1 = power(x, (n - 1));
        int xToThePowerN = x * xToThePowerNm1;
        return xToThePowerN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("x^n = " + power(x, n));
    }
}
