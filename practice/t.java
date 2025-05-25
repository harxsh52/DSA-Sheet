package practice;

public class t {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int total = 0;
        
        // Initial: take first k elements from the left
        for (int i = 0; i < k; i++) {
            total += nums[i];
        }
        
        int maxSum = total;
        
        // Try taking elements from the right instead of the left one by one
        for (int i = 0; i < k; i++) {
            total = total - nums[k - 1 - i] + nums[n - 1 - i];
            maxSum = Math.max(maxSum, total);
        }
        
        return maxSum;
    }
}

