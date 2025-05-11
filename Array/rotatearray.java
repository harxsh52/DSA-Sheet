package Array;

public class rotatearray {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int i,int e){
        while(i<=e){
            int temp=nums[i];
            nums[i]=nums[e];
            nums[e]=temp;
            i++;
            e--;
        }
}
}
