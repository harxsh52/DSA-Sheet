package binarysearch;

public class duplicates_single {
    public int singleNonDuplicate(int[] nums) {
        int low=0,right=nums.length-1;
        if(nums.length<=1) return nums[nums.length-1];
        while(low<right){
            int mid=low+(right-low)/2;
            if(mid%2==1){
                mid-=1;
            }
            if(nums[mid]==nums[mid+1]){
                low=mid+2;
            }else{
                right=mid;
            }
            
        }
        return nums[low];
}}
