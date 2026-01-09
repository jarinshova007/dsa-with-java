// print x^n (stack height = logn)
import java.util.Scanner;
public class Power2 {
    public static int power(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        int xToThePowerNd2 = power(x, n / 2);
        int xToThePowerN;
        if (n % 2 == 0) {
             xToThePowerN = xToThePowerNd2 * xToThePowerNd2;
        } else {
             xToThePowerN = xToThePowerNd2 * xToThePowerNd2 * x;
        }
        return xToThePowerN;
    }
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("x = ");
    int x = sc.nextInt();
    System.out.print("n = ");
    int n = sc.nextInt();
    int pow = power(x, n);
    System.out.println("x^n = " + pow);
    }
}
