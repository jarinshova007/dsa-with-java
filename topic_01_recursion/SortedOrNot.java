// check if an array is sorted (Strictly Increasing)
public class SortedOrNot {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        int current = arr[idx];
        /* if (current >= arr[idx + 1]) {
            return false;
        }
        return isSorted(arr, idx + 1); */
        // in another logic
        if (current < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {4, 2, 7, 9, 3}; // unsorted
        int arr2[] = {2, 3, 4, 5, 6}; // sorted
        int arr3[] = {2, 3, 3, 5, 6}; // unsorted

        // method call for arr1
        if (isSorted(arr1, 0)) {
            System.out.println("sorted");
        } else {
            System.out.println("unsorted");
        }

        // method call for arr2
        if (isSorted(arr2, 0)) {
            System.out.println("sorted");
        } else {
            System.out.println("unsorted");
        }

        // method call for arr3
        if (isSorted(arr3, 0)) {
            System.out.println("sorted");
        } else {
            System.out.println("unsorted");
        }
    }
}
