package Array.Hard;

import java.util.Arrays;

public class repeat_missing {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        Arrays.sort(nums);
        int m=0;
        int r=0;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i-1]==nums[i]){
                r=nums[i];
            }
        }
        int t=(nums.length*(nums.length+1))/2;
        m=t-sum+r;
        return new int[] {r,m};
    }
}
