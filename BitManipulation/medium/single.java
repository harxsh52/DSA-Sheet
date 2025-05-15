package BitManipulation.medium;

import java.util.Arrays;

public class single {
    public int[] singleNumber(int[] nums) {        
        //your code goes here
        Arrays.sort(nums);
        int a=0;
        for(int num:nums){
            a^=num;
        }
        int diff=a & (-a);
        int num1=0,num2=0;
        for(int num:nums){
            if((num & diff)==0){
                num1^=num;
            }
            else{
                num2^=num;
            }
        }
        return new int[] {num2,num1};
    }
}
