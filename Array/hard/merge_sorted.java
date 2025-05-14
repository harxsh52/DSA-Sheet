package Array.hard;

import java.util.Arrays;

public class merge_sorted {
     public void merge(int[] nums1, int m, int[] nums2, int n) {
        int y=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[y++];
        }
        Arrays.sort(nums1);
        return;
    }
}
