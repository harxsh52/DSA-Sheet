package binarysearch;
import java.util.Arrays;
// Problem: Given an array of integers and a target integer x, find the floor and ceil of x in the array.

public class floor_ceil {
    public int[] getFloorAndCeil(int[] nums, int x) {
        Arrays.sort(nums);  // Important: Ensure the array is sorted
        int t = floor(nums, x);
        int r = ceil(nums, x);
        return new int[] {t, r};
    }

    public int floor(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= x) {
                ans = nums[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public int ceil(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= x) {
                ans = nums[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
