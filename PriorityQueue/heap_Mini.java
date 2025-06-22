package PriorityQueue;
import java.util.*;

public class heap_Mini {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Add element to heap
        public void add(int data) {
            arr.add(data); // Add to end
            int x = arr.size() - 1; // Child index
            int par = (x - 1) / 2; // Parent index

            while (x > 0 && arr.get(x) < arr.get(par)) {
                // Swap if child < parent
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        // Peek (return min element)
        public int peek() {
            if (arr.size() == 0) return -1;
            return arr.get(0);
        }

        // Remove root (min) element
        public int remove() {
            if (arr.size() == 0) return -1;

            int data = arr.get(0);

            // Swap root with last and remove last
            int lastIndex = arr.size() - 1;
            arr.set(0, arr.get(lastIndex));
            arr.remove(lastIndex);

            // Heapify downward
            heapify(0);

            return data;
        }

        // Heapify-down for Min Heap
        private void heapify(int i) {
            int smallest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < arr.size() && arr.get(left) < arr.get(smallest)) {
                smallest = left;
            }

            if (right < arr.size() && arr.get(right) < arr.get(smallest)) {
                smallest = right;
            }

            if (smallest != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(smallest));
                arr.set(smallest, temp);
                heapify(smallest);
            }
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}
