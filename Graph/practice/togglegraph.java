package Graph.practice;
  import java.util.*;
public class togglegraph {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bn=sc.nextInt();
        int n = 5; // number of nodes
        int[][] edges = {
            {0, 1}, {0, 2}, {1, 3}, {3, 4}
        };

        boolean isDirected = false; // ← Change this to true for directed graph
        if(bn == 1) {
            isDirected = true; // Toggle to directed graph
        } else if (bn == 0) {
            isDirected = false; // Toggle to undirected graph
        } else {
            System.out.println("Invalid input. Please enter 0 for undirected or 1 for directed.");
            return;
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);

            if (!isDirected) {
                adj.get(v).add(u);
            }
        }

        // Print adjacency list
        System.out.println(isDirected ? "Directed Graph:" : "Undirected Graph:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " → ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}

