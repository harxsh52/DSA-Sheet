package Binarytree.striver;

public class balancedbinarytree {
    static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
            right=left=null;
        }
    }
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int l = height(root.left);
        int r = height(root.right);

        return Math.abs(l - r) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
}
