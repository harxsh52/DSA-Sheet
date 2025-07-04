package Greedy;

import java.util.Arrays;

public class mini_platform {
    public int findPlatform(int[] Arrival, int[] Departure) {
        Arrays.sort(Arrival);
        Arrays.sort(Departure);
        
        int platformNeeded = 1, maxPlatform = 1;
        int i = 1, j = 0;
        int n = Arrival.length;
        
        while (i < n && j < n) {
            // New train arrives before the earliest current train departs → need one more platform
            if (Arrival[i] <= Departure[j]) {
                platformNeeded++;
                i++;
            } else {
                // One train departs → one platform freed
                platformNeeded--;
                j++;
            }
            // Keep track of the maximum number of platforms needed at any time
            maxPlatform = Math.max(maxPlatform, platformNeeded);
        }
        
        return maxPlatform;
    }
}
