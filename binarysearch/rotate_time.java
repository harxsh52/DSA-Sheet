package binarysearch;

public class rotate_time {
    class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
                if(nums[mid]>nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid;
                }
        }
        return nums[low];
    }
}
    public static void main(String[] args) {
        Solution solution = new rotate_time().new Solution();
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(solution.findMin(nums)); // Output: 1
    }
}
