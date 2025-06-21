package binarysearchtree.striver;

public class deletenode {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=right=null;
        }
    }
        public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            // Node found
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode IS = successor(root.right); // Correct method name
                root.val = IS.val; // Correct field name
                root.right = deleteNode(root.right, IS.val);
            }
        }
        return root;
    }

    // Find inorder successor (smallest in right subtree)
    public TreeNode successor(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
