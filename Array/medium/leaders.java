package Array.medium;

import java.util.ArrayList;
import java.util.Collections;

public class leaders {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> leader = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > max) {
                leader.add(nums[i]);
                max = nums[i];
            }
        }

        // Reverse the list to return in correct order
        Collections.reverse(leader);

        return leader;
    }    public static void main(String[] args) {
        leaders l = new leaders();
        int[] nums = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = l.leaders(nums);
        System.out.println(result); // Output: [17, 5, 2]
        int[] nums2 = {1, 2, 3, 4, 0};
}
}
