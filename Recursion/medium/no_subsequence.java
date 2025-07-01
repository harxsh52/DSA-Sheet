package Recursion.medium;

public class no_subsequence {
    private static int count;
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        count=0;
        genrate(nums,k,0);
        return count;
    }
    public void genrate(int[] nums,int k,int i){
        if(i==nums.length){
            if(k==0){
                count++;
            }
            return;
        }
        genrate(nums,k,i+1);
        genrate(nums,k-nums[i],i+1);
    }
}
