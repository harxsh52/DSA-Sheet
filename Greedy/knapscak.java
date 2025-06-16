package Greedy;

import java.util.Arrays;

public class knapscak {
    static class Item {
        int value, weight;
        Item(int v, int w) {
            this.value = v;
            this.weight = w;
        }
    }

    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }

        // Sort items by value per weight in descending order
        Arrays.sort(items, (a, b) -> Double.compare((double)b.value / b.weight, (double)a.value / a.weight));

        double totalValue = 0.0;

        for (int i = 0; i < n; i++) {
            if (W == 0) break;
            if (items[i].weight <= W) {
                totalValue += items[i].value;
                W -= items[i].weight;
            } else {
                totalValue += (double)items[i].value * ((double)W / items[i].weight);
                W = 0;
            }
        }

        return totalValue;
    }
}
