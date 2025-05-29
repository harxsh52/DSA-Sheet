package Array.easy;

import java.util.HashMap;

public class long_subarray {
    // Java program to find the length of the longest
// subarray having sum k using nested loop

  
  	// Function to find longest sub-array having sum k
    public static int longestSubarray(int[] nums, int k) {
       int n=nums.length;
       HashMap<Integer,Integer> preSumMap=new HashMap<>();
       int sum=0;
       int maxLen=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
        if (sum == k) {
            maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k;
        if (preSumMap.containsKey(rem)) {
            int len = i - preSumMap.get(rem);
            maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
        if (!preSumMap.containsKey(sum)) {
            preSumMap.put(sum, i);
            }
       }
       return maxLen;
    }
    

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        int t=longestSubarray(arr, k);
        System.out.println(t);
    }
}

