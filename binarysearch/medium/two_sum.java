package binarysearch.medium;

public class two_sum {

    public int[] twoSum(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                return new int[]{left+1,right+1};
            }
            else if(nums[left]+nums[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}

