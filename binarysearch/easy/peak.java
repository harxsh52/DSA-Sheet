package binarysearch.easy;

public class peak {
    class Solution {
    public int findPeakElement(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
            
        }
        return low;
    }
}

    public static void main(String[] args) {
        Solution sol = new peak().new Solution();
        int[] nums = {1, 2, 3, 1};
        System.out.println(sol.findPeakElement(nums)); // Output: 2
    }
}
