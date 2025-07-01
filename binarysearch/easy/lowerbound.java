package binarysearch.easy;

public class lowerbound {
    public int lowerBound(int[] arr, int target) {
       int low=0,high=arr.length-1,ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
     }
}
