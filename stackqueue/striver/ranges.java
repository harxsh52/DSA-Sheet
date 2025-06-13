package stackqueue.striver;

import java.util.Stack;

public class ranges {
    public class Solution {
    public long subArrayRanges(int[] nums) {
        return getSumOfMax(nums) - getSumOfMin(nums);
    }

    // Sum of subarray maximums
    private long getSumOfMax(int[] nums) {
        long sum = 0;
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            int cur = (i == n) ? Integer.MAX_VALUE : nums[i];
            while (!stack.isEmpty() && nums[stack.peek()] < cur) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;
                long count = (mid - left) * (right - mid);
                sum += count * nums[mid];
            }
            stack.push(i);
        }

        return sum;
    }

    // Sum of subarray minimums
    private long getSumOfMin(int[] nums) {
        long sum = 0;
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            int cur = (i == n) ? Integer.MIN_VALUE : nums[i];
            while (!stack.isEmpty() && nums[stack.peek()] > cur) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;
                long count = (mid - left) * (right - mid);
                sum += count * nums[mid];
            }
            stack.push(i);
        }

        return sum;
    }
}

}
