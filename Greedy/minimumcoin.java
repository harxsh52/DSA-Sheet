package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minimumcoin {

    static List<Integer> minPartition(int n) {
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 200};  // Custom denominations

        // Sort the coin array in descending order for greedy selection
        List<Integer> coins = new ArrayList<>();
        for (int coin : arr) {
            coins.add(coin);
        }
        Collections.sort(coins, Collections.reverseOrder());

        List<Integer> result = new ArrayList<>();
        for (int coin : coins) {
            while (n >= coin) {
                result.add(coin);
                n -= coin;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int amount = 1059;

        List<Integer> coinsUsed = minPartition(amount);
        System.out.println("Coins used to make " + amount + ":");
        for (int coin : coinsUsed) {
            System.out.print(coin + " ");
        }
    }
}
