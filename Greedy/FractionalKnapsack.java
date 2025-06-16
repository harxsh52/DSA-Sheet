package Greedy;

import java.util.*;

public class FractionalKnapsack {

    static class Item {
        int value, weight;
        Item(int v, int w) {
            this.value = v;
            this.weight = w;
        }
    }

    public static double fractionalKnapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }

        // Sort using Comparator.comparingInt (multiplied to preserve decimal precision)
        Arrays.sort(items, Comparator.comparingInt((Item item) -> (int)((double)item.value / item.weight * 1000)).reversed());

        double totalValue = 0.0;

        for (int i = 0; i < n; i++) {
            if (capacity == 0) break;

            if (items[i].weight <= capacity) {
                totalValue += items[i].value;
                capacity -= items[i].weight;
            } else {
                totalValue += (double)items[i].value * ((double)capacity / items[i].weight);
                capacity = 0;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;

        double maxValue = fractionalKnapsack(values, weights, capacity);
        System.out.println("Maximum value in fractional knapsack: " + maxValue);
    }
}
