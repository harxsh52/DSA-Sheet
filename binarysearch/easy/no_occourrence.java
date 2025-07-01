package binarysearch.easy;
public class no_occourrence {
    public int searchRange(int[] nums, int target) {
        return findFirst(nums, target)-findLast(nums, target)+1;

    }
    public static int findFirst(int[] nums,int target){
        int left=0,right=nums.length-1,first=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                first=mid;
                right=mid-1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return first;
    }
    public static int findLast(int[] nums,int target){
        int left=0,right=nums.length-1,last=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                last=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return last;
    }
}