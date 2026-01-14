
// print fibonacci series in different ways
import java.util.Scanner;

public class Fibonacci {
    // public static int fibonacci(int N) {
    // if (N == 0) {
    // return 0;
    // }
    // if (N == 1) {
    // return 1;
    // }

    // int fibo_Nm1 = fibonacci(N - 1);
    // int fibo_Nm2 = fibonacci(N - 2);
    // int fibo_N = fibo_Nm1 + fibo_Nm2;

    // return fibo_N;
    // }

    // different recursive way to return a fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // print fibonaccci series with iterate
    public static void fiboIterate(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(fibonacci(i));
            if (i < end) {
                System.out.print(" ");
            }
        }
    }

    // print fibonaccci series with recursive
    public static void fiboRecursive(int i, int n) { // what if the return type is integer???
        if (i == n) {
            System.out.println(fibonacci(i));
            return;
        }
        System.out.print(fibonacci(i) + " ");
        fiboRecursive(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("lastNum: ");
        int lastNum = sc.nextInt(); // 12

        System.out.print("manually: ");
        for (int i = 0; i <= lastNum; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();

        // print fibonaccci series with iterate
        System.out.print("iterative approach: ");
        fiboIterate(0, lastNum);

        System.out.println();

        // print fibonaccci series with iterate
        System.out.print("recursive approach: ");
        fiboRecursive(0, lastNum);
    }
}
