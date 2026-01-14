
// Print factorial of a number n
import java.util.Scanner;

public class Factorial {
    public static int factorial(int N) {
        if (N == 0 || N == 1) {
            return 1;
        }
        int fact_Nm1 = factorial(N - 1);
        int fact_N = fact_Nm1 * N;
        return fact_N;
    }

    // different recursive way:
    // public static int factorial(int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (n == 1) {
    // return 1;
    // }
    // return factorial(n - 1) * n;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num = ");
        int num = sc.nextInt();
        // recursive function call
        int fact_num = factorial(num);
        System.out.println("factorial of num: " + fact_num);
    }
}
