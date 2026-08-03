import java.util.Scanner;

public class CountSort {
    // Overall Time Complexity: O(n + k)
    // Overall Space Complexity: O(n + k)
    // here, n = size of arr and k = size of count array
    public static void countSort(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // create a new array
        int k = max + 1;
        int count[] = new int[k];

        // Initialize all indices to 0 (it's optional for java as new int[] sets 0 to
        // every index automatically)
        // for (int i = 0; i < (max + 1); i++) {
        // count[i] = 0;
        // }

        // frequency array of count
        for (int i = 0; i < arr.length; i++) {
            // count[arr[i]] = count[arr[i]] + 1;
            count[arr[i]]++;
        }

        // cumulative frequency array (prefix sum) of count
        for (int i = 1; i < k; i++) {
            // count[i] = count[i] + count[i - 1];
            count[i] += count[i - 1];
        }

        // create a new array of size (arr.length)
        int result[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            result[--count[arr[i]]] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("size = ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // method call
        countSort(arr);

        // print array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}