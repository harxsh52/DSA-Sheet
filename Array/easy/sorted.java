package Array.easy;

public class sorted {
    class Solution {
    public boolean check(int[] nums) {
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                t++;
            }
        }
        if(t>=2){
            return false;
        }
        return true;
    }
}
}
