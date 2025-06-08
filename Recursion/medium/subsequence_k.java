package Recursion.medium;

public class subsequence_k {
    class Solution {
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        int[] count = new int[1]; // to simulate pass-by-reference
        generate(nums, 0, k, count, 0, false); // start with picked = false
        return count[0];
    }

    public void generate(int[] nums, int i, int target, int[] count, int currentSum, boolean picked) {
        if (i >= nums.length) {
            if (picked && currentSum == target) {
                count[0]++;
            }
            return;
        }

        // Don't pick current element
        generate(nums, i + 1, target, count, currentSum, picked);

        // Pick current element
        generate(nums, i + 1, target, count, currentSum + nums[i], true);
    }
}

}
