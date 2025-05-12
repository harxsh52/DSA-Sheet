package Array.medium;
import java.util.*;

public class  _conslong {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int max = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // Skip duplicates
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1; // Reset count if sequence breaks
            }
            max = Math.max(max, count);
        }

        return max;
    }
}


