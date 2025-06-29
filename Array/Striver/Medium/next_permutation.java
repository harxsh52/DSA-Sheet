package Array.Striver.Medium;

public class next_permutation {
        public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        if(i>=0){
        int j=nums.length-1;
        while(j>=i && nums[j]<=nums[i]){
            j--;
        }
        nums[i]=nums[i]^nums[j];
        nums[j]=nums[i]^nums[j];
        nums[i]=nums[i]^nums[j];
        }
        
        reverse(nums,i+1,nums.length-1);
    }
    private void reverse(int[] nums,int i,int j){
        while(i<j){
            nums[i]=nums[i]^nums[j];
            nums[j]=nums[i]^nums[j];
            nums[i]=nums[i]^nums[j];
            i++;
            j--;
        }
    }
}
