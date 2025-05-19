package binarysearch.medium;

public class divisor {
        public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=nums[0];
        int ans=-1;
        for(int num:nums){
            high=Math.max(num,high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(nums,threshold,mid)){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean check(int[] nums,int t,int m){
        int e=0;
        for(int num:nums){
            e+=(num+m-1)/m;
        }
        return e<=t;
    }
}
