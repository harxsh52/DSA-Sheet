package Array.medium;

public class arrange_pos_neg {
    public int[] rearrangeArray(int[] nums) {
        int[] arr=new int[nums.length];
        int i=0;
        int j=1;
        for(int num:nums){
            if(num>=0){
                arr[i]=num;
                i+=2;
            }
            else{
                arr[j]=num;
                j+=2;
            }

        }

        return arr;
}
}
