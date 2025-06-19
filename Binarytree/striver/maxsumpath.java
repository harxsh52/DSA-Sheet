package Binarytree.striver;

public class maxsumpath {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }

    }
    private int sum;
    public int maxPathSum(TreeNode root) {
        sum=Integer.MIN_VALUE;
        int t=helper(root);
        return sum;
    }
    public int helper(TreeNode root){
    if(root==null) return 0;
    int leftsum=Math.max(helper(root.left),0);
    int rightsum=Math.max(helper(root.right),0);
    sum=Math.max(sum,root.val+leftsum+rightsum);

    return Math.max(leftsum,rightsum)+root.val;
    }
}
