package DynamicProgramming.DP1;

public class houseII {
    public int rob(int[] nums) {
        if(nums.length==0)return 0;
        else if(nums.length==1)return nums[0];
        else if(nums.length==2)return Math.max(nums[0],nums[1]);
        int x=roob(nums,0,nums.length-1);
        int y=roob(nums,1,nums.length);
        return Math.max(x,y);
    }
    public int roob(int[] nums,int start,int end){
        int curr=0,prev=0;
        for(int i=start;i<end;i++){
            int num=nums[i];
            int t=curr;
            curr=Math.max(curr,prev+num);
            prev=t;
        }
        return curr;
    }
}
