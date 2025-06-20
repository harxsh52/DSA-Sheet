package Binarytree.striver;

public class total_nodes {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
            left=right=null;
        }
    }
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
