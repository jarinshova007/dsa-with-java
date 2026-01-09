// print numbers from 5 to 1
// print numbers from 1 to 5

public class PrintNumbers {
    public static void printDescending(int n) {
    if (n == 0) {
        return;
    }
    
    System.out.print(n + " ");
    printDescending(n - 1);
    }

    public static void printAscending(int m) {
        if (m == 6) {
            return;
        }
        System.out.print(m + " ");
        printAscending(m + 1);
    }
    
    public static void main(String[] args) {
        int n = 5;
        int m = 1;

        System.out.print("Descending order: ");
        printDescending(n);

        System.out.println();
        
        System.out.print("Ascending order: ");
        printAscending(m);
    }
}
