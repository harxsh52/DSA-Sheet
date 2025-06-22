package PriorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class indexoffreq {
    static int[] replaceWithRank(int arr[], int N) {
    Set<Integer> sortedSet = new TreeSet<>();
    Map<Integer, Integer> map = new HashMap<>();

    for (int val : arr) sortedSet.add(val);  // automatic sorting

    int rank = 1;
    for (int val : sortedSet) {
        map.put(val, rank++);
    }

    for (int i = 0; i < N; i++) {
        arr[i] = map.get(arr[i]);
    }

    return arr;
}
}
