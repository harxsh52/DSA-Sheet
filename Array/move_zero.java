package Array;

public class move_zero {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int i=0;
        for(int num:nums){
            if(num!=0){
            nums[i++]=num;
        }
        }
        for(int t=i;t<nums.length;t++){
            nums[t]=0;
        }
        
        return;
    }
}
