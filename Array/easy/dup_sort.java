package Array.easy;

public class dup_sort {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int i=1;
        for(int j=1;j<nums.length;j++){
            if(nums[i-1]!=nums[j]){
                nums[i++]=nums[j];
            }
        }
        return i;

}
}
