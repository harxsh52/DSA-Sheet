package Binarytree.striver;

import java.util.ArrayList;
import java.util.List;

public class roottoleaf {
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=right=null;
        }
    }
        public List<List<Integer>> allRootToLeaf(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        
        List<Integer> currentPath = new ArrayList<>();
        dfs(root, currentPath, result);
        return result;
    }

    private void dfs(TreeNode node, List<Integer> path, List<List<Integer>> result) {
        if (node == null) return;

        path.add(node.data);

        // If it's a leaf node, save a copy of the path
        if (node.left == null && node.right == null) {
            result.add(new ArrayList<>(path));
        } else {
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }

        // Backtrack
        path.remove(path.size() - 1);
    }
}
