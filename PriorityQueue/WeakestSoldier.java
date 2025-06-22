package PriorityQueue;

import java.util.*;

public class WeakestSoldier {
    static class WeakRow implements Comparable<WeakRow> {
        int index;
        int soldiers;

        WeakRow(int index, int soldiers) {
            this.index = index;
            this.soldiers = soldiers;
        }

        @Override
        public int compareTo(WeakRow other) {
            if (this.soldiers == other.soldiers) {
                return this.index - other.index; // Smaller index comes first
            }
            return this.soldiers - other.soldiers; // Fewer soldiers = weaker
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int k = 3;

        PriorityQueue<WeakRow> pq = new PriorityQueue<>();

        for (int i = 0; i < mat.length; i++) {
            int count = countSoldiers(mat[i]);
            pq.add(new WeakRow(i, count));
        }

        System.out.println("K weakest rows:");
        for (int i = 0; i < k; i++) {
            System.out.println(pq.poll().index);
        }
    }

    private static int countSoldiers(int[] row) {
        int count = 0;
        for (int val : row) {
            if (val == 1) count++;
            else break;
        }
        return count;
    }
}
