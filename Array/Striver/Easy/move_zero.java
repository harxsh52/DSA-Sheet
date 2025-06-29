

public class move_zero {
     public void moveZeroes(int[] nums) {
        int q=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[q]=nums[i];
                q++;
            }
        }
        for(int i=q;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
