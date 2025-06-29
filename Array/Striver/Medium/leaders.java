package Array.Striver.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class leaders {
    public static ArrayList<Integer> leader(int[] nums) {
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
        int[] nums = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result =leader(nums);
        System.out.println(result); // Output: [17, 5, 2]
}
}
