

public class max_cons {
    public int findMaxConsecutiveOnes(int[] nums) {
        int t=0;
        int max=0;
        for(int num:nums){
            if(num==1){
                t++;
            }
            else{
                max=Math.max(t,max);
                t=0;
            }
            
        }
        max=Math.max(t,max);
        return max;
    }
}
