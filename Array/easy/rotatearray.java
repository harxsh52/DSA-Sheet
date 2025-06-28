

public class rotatearray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        // Reverse entire array
        reverse(nums, 0, n - 1);

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            nums[left] = nums[left] ^ nums[right];
            nums[right] = nums[left] ^ nums[right];
            nums[left] = nums[left] ^ nums[right];
            left++;
            right--;
        }
    }
}

