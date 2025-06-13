package stackqueue.striver;

public class trapping_rainwater {
    public int trap(int[] height) {
        int left=0,sum=0,lmax=height[left],right=height.length-1,rmax=height[right];
        while(left<right){
            if(lmax<=rmax){
                sum+=lmax-height[left];
                left++;
                lmax=Math.max(lmax,height[left]);
            }else{
                sum+=rmax-height[right];
                right--;
                rmax=Math.max(rmax,height[right]);
            }
        }
        return sum;
    }
}

