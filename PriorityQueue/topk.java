package PriorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topk {
    class Freq implements Comparable<Freq> {
        int num;
        int freq;

        Freq(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }

        @Override
        public int compareTo(Freq other) {
            if (this.freq == other.freq) {
                return other.num - this.num; // tie-breaker: larger number first
            }
            return this.freq - other.freq; // min-heap based on frequency
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int val : nums) {
            freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<Freq> minHeap = new PriorityQueue<>();

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.add(new Freq(entry.getKey(), entry.getValue()));

            // Ensure heap size remains at most k
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Now extract the top k elements
        int[] result = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            result[i++] = minHeap.poll().num;
        }

        return result;
    }
}
