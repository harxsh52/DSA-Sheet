package PriorityQueue;

import java.util.*;

public class MaxHeap {

    static class Heap {
        private final ArrayList<Integer> arr = new ArrayList<>();

        // Add element to the Max Heap
        public void add(int data) {
            arr.add(data);
            int current = arr.size() - 1;
            int parent = (current - 1) / 2;

            // Bubble up for Max Heap
            while (current > 0 && arr.get(current) > arr.get(parent)) {
                Collections.swap(arr, current, parent);
                current = parent;
                parent = (current - 1) / 2;
            }
        }

        // Peek (return max element)
        public int peek() {
            return arr.isEmpty() ? -1 : arr.get(0);
        }

        // Remove max element (root)
        public int remove() {
            if (arr.isEmpty()) return -1;

            int max = arr.get(0);
            int lastIndex = arr.size() - 1;

            // Move last to root and remove last
            arr.set(0, arr.get(lastIndex));
            arr.remove(lastIndex);

            // Heapify down
            heapify(0);

            return max;
        }

        // Heapify-down for Max Heap
        private void heapify(int i) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < arr.size() && arr.get(left) > arr.get(largest)) {
                largest = left;
            }

            if (right < arr.size() && arr.get(right) > arr.get(largest)) {
                largest = right;
            }

            if (largest != i) {
                Collections.swap(arr, i, largest);
                heapify(largest);
            }
        }

        public boolean isEmpty() {
            return arr.isEmpty();
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();

        // Add elements
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        // Remove and print in descending order
        while (!h.isEmpty()) {
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}
