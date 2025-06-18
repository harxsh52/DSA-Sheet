package Binarytree.striver;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack_postorder {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
            left=right=null;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;

        while (root != null || !stack.isEmpty()) {
            // Traverse to the leftmost node
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            TreeNode node = stack.peek();
            // If right child doesn't exist or is already processed
            if (node.right == null || node.right == prev) {
                result.add(node.val);
                stack.pop();
                prev = node;
                root = null;
            } else {
                root = node.right;
            }
        }

        return result;
    }
}
