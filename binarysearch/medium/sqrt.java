package binarysearch.medium;

public class sqrt {
    
    public long floorSqrt(long n) {
        long low = 1, high = n, ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long val = mid * mid;

            if (val <= n) {
                ans = mid;     // mid is a valid candidate
                low = mid + 1; // look for a possibly higher square root
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

}
