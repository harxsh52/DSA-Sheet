package Binarytree.striver;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class spread_fire {

    // Step 1: Build parent map
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    private void markParents(TreeNode root, Map<TreeNode, TreeNode> parentMap) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.left != null) {
                parentMap.put(curr.left, curr);
                q.offer(curr.left);
            }

            if (curr.right != null) {
                parentMap.put(curr.right, curr);
                q.offer(curr.right);
            }
        }
    }

    // Step 2: Find the target node
    private TreeNode findTarget(TreeNode root, int target) {
        if (root == null) return null;
        if (root.val == target) return root;

        TreeNode left = findTarget(root.left, target);
        if (left != null) return left;

        return findTarget(root.right, target);
    }

    public int minTime(TreeNode root, int target) {
        if (root == null) return 0;

        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        markParents(root, parentMap);

        TreeNode targetNode = findTarget(root, target);
        if (targetNode == null) return 0;

        // BFS to simulate fire
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        q.offer(targetNode);
        visited.add(targetNode);

        int time = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            boolean spread = false;

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                // Spread to left
                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    q.offer(curr.left);
                    spread = true;
                }

                // Spread to right
                if (curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    q.offer(curr.right);
                    spread = true;
                }

                // Spread to parent
                TreeNode parent = parentMap.get(curr);
                if (parent != null && !visited.contains(parent)) {
                    visited.add(parent);
                    q.offer(parent);
                    spread = true;
                }
            }

            if (spread) time++;
        }

        return time;
    }
}

