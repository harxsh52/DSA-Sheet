package PriorityQueue;
import java.util.*;


public class maximumsum_combination {
    // User function Template for Java

    static class Pair {
        int sum;
        int i;
        int j;

        Pair(int sum, int i, int j) {
            this.sum = sum;
            this.i = i;
            this.j = j;
        }
    }

    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // Step 1: Sort both arrays in ascending order
        Arrays.sort(A);
        Arrays.sort(B);

        // Max heap (PriorityQueue with custom comparator)
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((p1, p2) -> p2.sum - p1.sum);
        Set<String> visited = new HashSet<>();

        // Step 2: Add the initial largest pair
        int i = N - 1, j = N - 1;
        maxHeap.add(new Pair(A[i] + B[j], i, j));
        visited.add(i + "_" + j);

        // Step 3: Extract K largest sums
        List<Integer> result = new ArrayList<>();
        while (K-- > 0 && !maxHeap.isEmpty()) {
            Pair curr = maxHeap.poll();
            result.add(curr.sum);

            // Next possible pair (i-1, j)
            if (curr.i - 1 >= 0) {
                String key1 = (curr.i - 1) + "_" + curr.j;
                if (!visited.contains(key1)) {
                    maxHeap.add(new Pair(A[curr.i - 1] + B[curr.j], curr.i - 1, curr.j));
                    visited.add(key1);
                }
            }

            // Next possible pair (i, j-1)
            if (curr.j - 1 >= 0) {
                String key2 = curr.i + "_" + (curr.j - 1);
                if (!visited.contains(key2)) {
                    maxHeap.add(new Pair(A[curr.i] + B[curr.j - 1], curr.i, curr.j - 1));
                    visited.add(key2);
                }
            }
        }

        return result;
    }
}

