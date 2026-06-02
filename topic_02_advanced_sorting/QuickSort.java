package topic_02_advanced_sorting;

// worst case - O(n^2)
// Average case 0 O(nlogn)
// mostly used in average case and when memory efficiency is a concern
public class QuickSort {
    // partition
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];

        int i = low - 1;
        for (int j = low; j < high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // pivot index
    }

    // quickSort
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);

            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 7, 10, 16, 9, 19, 3 };

        int n = arr.length;
        quickSort(arr, 0, n - 1);

        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
