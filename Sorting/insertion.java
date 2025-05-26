package Sorting;

public class insertion {
    public static void insertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at the correct position
            arr[j + 1] = key;
        }
    }
    public static void instertion(int[] arr,int i, int n) {
        if (i >= n) {
            return;
        }
        int key = arr[i];
        int j = i - 1;

        // Shift larger elements to the right
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Insert key at the correct position
        arr[j + 1] = key;

        // Recursive call for the next element
        instertion(arr, i + 1, n);

    }
}
