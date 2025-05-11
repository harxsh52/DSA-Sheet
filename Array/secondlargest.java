package Array;

public class secondlargest {
    public int secondLargestElement(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        // If no valid second largest exists
        return (max2 == Integer.MIN_VALUE) ? -1 : max2;
    }
}
