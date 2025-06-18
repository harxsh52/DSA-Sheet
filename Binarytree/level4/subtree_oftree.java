package Binarytree.level4;

public class subtree_oftree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(areTreesSame(root,subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean areTreesSame(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true; // Both are null
        if (root == null || subRoot == null)
            return false; // Either one of them is null, means both are not equal

        if (root.val != subRoot.val)
            return false; // Values are not matching

        // If code reaches here, then both the val of root and subroot were same. Traverse left and right paths of both trees.
        return areTreesSame(root.left, subRoot.left) && areTreesSame(root.right, subRoot.right);
    }
}
