package Binarytree.level2;

import java.util.ArrayList;
import java.util.List;

public class kdistance_root {
    static class Node{
        int data;
        Node left;
        Node right;
    }
    ArrayList<Integer> Kdistance(Node root, int k) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        dfs(root, k, result);
        return result;
    }

    private void dfs(Node node, int k, List<Integer> result) {
        if (node == null) return;

        if (k == 0) {
            result.add(node.data);
            return;
        }

        dfs(node.left, k - 1, result);
        dfs(node.right, k - 1, result);
    }
}
