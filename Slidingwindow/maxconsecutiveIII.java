package Slidingwindow;

public class maxconsecutiveIII {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int MaxLength=0;
        int right=0;
        while(right<nums.length){
            if(nums[right]==0){
                k--;
            }
            right++;
            while(k<0){
                if(nums[left]==0){
                    k++;
                }
                left++;
            }
            MaxLength=Math.max(MaxLength,right-left);
        }
        return MaxLength;
    }
}
