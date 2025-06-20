package Binarytree.striver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class k_distance {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
            left=right=null;
        }
    }
        public void markParents(TreeNode root, HashMap<TreeNode, TreeNode> parents) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr.left != null) {
                parents.put(curr.left, curr);
                q.add(curr.left);
            }
            if (curr.right != null) {
                parents.put(curr.right, curr);
                q.add(curr.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, TreeNode> parents = new HashMap<>();
        markParents(root, parents);

        Set<TreeNode> vis = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        vis.add(target);

        int currDist = 0;
        while (!q.isEmpty()) {
            if (currDist == k) break;
            int size = q.size();
            currDist++;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.left != null && !vis.contains(node.left)) {
                    vis.add(node.left);
                    q.add(node.left);
                }
                if (node.right != null && !vis.contains(node.right)) {
                    vis.add(node.right);
                    q.add(node.right);
                }
                if (parents.containsKey(node) && !vis.contains(parents.get(node))) {
                    vis.add(parents.get(node));
                    q.add(parents.get(node));
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            ans.add(q.poll().val);
        }
        return ans;
    }
}
