package binarysearch.hard;

public class book_allocationm {
    public int findPages(int[] nums, int m) {
        if (m > nums.length) {
            return -1; // Not enough books for students
        }

        int low = 0, high = 0;
        for (int num : nums) {
            low = Math.max(low, num); // At least one book per student
            high += num;              // Total pages as upper bound
        }

        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(nums, m, mid)) {
                ans = mid;        // Try to minimize max pages
                high = mid - 1;
            } else {
                low = mid + 1;    // Increase pages limit
            }
        }
        return ans;
    }

    private boolean isPossible(int[] nums, int m, int maxPagesAllowed) {
        int count = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num <= maxPagesAllowed) {
                currentSum += num;
            } else {
                count++;           // New student
                currentSum = num;

                if (count > m) {
                    return false;
                }
            }
        }
        return true;
    }
}
