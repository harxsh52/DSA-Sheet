package Array;

import java.util.HashSet;

public class union {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            set.add(num);
        }
        int[] result=new int[set.size()];
        int i=0;
        for(int num:set){
            result[i++]=num;
        }
        return result;
    }
}
