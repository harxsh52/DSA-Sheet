package Greedy;

import java.util.Arrays;

public class minimumcoins {
    public int MinimumCoins(int[] coins, int amount) {
        int count = 0;
        Arrays.sort(coins);

        while (amount > 0) {
            int max = 0;

            for (int i = 0; i < coins.length; i++) {
                if (coins[i] <= amount) {
                    max = coins[i];
                } else {
                    break;
                }
            }

            if (max == 0) {
                return -1; // No coin can be used
            }

            amount -= max;
            count++;
        }

        return count;
    }
}
