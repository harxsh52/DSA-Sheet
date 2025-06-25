package Array.easy;

import java.util.*;

public class OptimizedModFrequency {
    public static void main(String[] args) {
        int[] nums = {4, 8, 9, 8, 4, 2, 1, 3, 5, 6};
        int b = 3;

        int[] count = new int[b];
        for (int num : nums) {
            count[num % b]++;
        }

        int[] freq = new int[b]; // freq[r] = # of triplets with sum % b == r

        for (int i = 0; i < b; i++) {
            for (int j = i; j < b; j++) {
                for (int k = j; k < b; k++) {
                    int modSum = (i + j + k) % b;

                    long ways = 0;

                    if (i == j && j == k) {
                        // All same
                        if (count[i] >= 3)
                            ways = count[i] * (count[i] - 1L) * (count[i] - 2L) / 6;
                    } else if (i == j && j != k) {
                        // i == j != k
                        if (count[i] >= 2)
                            ways = count[i] * (count[i] - 1L) / 2 * count[k];
                    } else if (i != j && j == k) {
                        // j == k != i
                        if (count[j] >= 2)
                            ways = count[j] * (count[j] - 1L) / 2 * count[i];
                    } else if (i == k && i != j) {
                        // i == k != j
                        if (count[i] >= 2)
                            ways = count[i] * (count[i] - 1L) / 2 * count[j];
                    } else {
                        // All different
                        ways = (long) count[i] * count[j] * count[k];
                    }

                    freq[modSum] += ways;
                }
            }
        }

        // Print the result
        System.out.println("Optimized Frequency of (sum % " + b + "): " + Arrays.toString(freq));
    }
}


