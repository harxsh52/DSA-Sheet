package binarysearch.medium;

public class ship {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        for (int w : weights) {
            low = Math.max(low, w); // at least the heaviest item
            high += w;              // at most sum of all items
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                ans = mid;       // mid is a valid capacity
                high = mid - 1;  // try smaller
            } else {
                low = mid + 1;   // need more capacity
            }
        }

        return ans;
    }

    private boolean canShip(int[] weights, int D, int capacity) {
        int dayCount = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                dayCount++;
                currentLoad = 0;
            }
            currentLoad += w;
        }

        return dayCount <= D;
    }
}
