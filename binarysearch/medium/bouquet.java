package binarysearch.medium;

public class bouquet {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length) return -1;
        int low=min(bloomDay);
        int high=max(bloomDay);
        int ans=-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1; // try to find a smaller valid day
            } else {
                low = mid + 1;  // need more days
            }
        }
        return ans;
    }
        private boolean canMake(int[] bloomDay, int m, int k, int mid) {
        int bouquets = 0;
        int flowers = 0;

        for (int day : bloomDay) {
            if (day <= mid) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0; // reset if flower hasn't bloomed
            }
        }

        return bouquets >= m;
    }
    private int min(int[] bloomDay){
        int min=0;
        for(int num:bloomDay){
            min=Math.min(min,num);
        }
        return min;
    }
    private int max(int[] bloomDay){
        int max=0;
        for(int num:bloomDay){
            max=Math.max(max,num);
        }
        return max;
    }
}
