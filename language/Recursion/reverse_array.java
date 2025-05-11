package language.Recursion;

public class reverse_array {
    public static void reverseArray(int[] arr) {
        reverseHelper(arr, 0, arr.length - 1);
    }

    private static void reverseHelper(int[] arr, int start, int end) {
        if (start >= end) return;

        // Swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseHelper(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // ✅ correct array initialization
        reverseArray(arr);          // Call the method

        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
