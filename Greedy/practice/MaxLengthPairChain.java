package Greedy.practice;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthPairChain {

    // Pair class with start and end
    static class Pair {
        int start, end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    // Function to find max chain length using greedy + comparator
    public static int maxChainLength(Pair[] pairs) {
        // Sort pairs by end time using Comparator.comparingInt
        Arrays.sort(pairs, Comparator.comparingInt(p -> p.end));

        int count = 1; // At least one pair is always part of the chain
        int lastEnd = pairs[0].end;

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i].start > lastEnd) {
                count++;
                lastEnd = pairs[i].end;
            }
        }

        return count;
    }

    // Main method
    public static void main(String[] args) {
        Pair[] pairs = {
            new Pair(5, 24),
            new Pair(15, 25),
            new Pair(27, 40),
            new Pair(50, 60)
        };

        int maxLength = maxChainLength(pairs);
        System.out.println("Maximum length of chain: " + maxLength);
    }
}
