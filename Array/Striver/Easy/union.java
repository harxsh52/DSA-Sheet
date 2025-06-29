

import java.util.HashSet;

public class union {
    public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 4};
        union u = new union();
        int[] result = u.unionArray(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");        
    }
}}
