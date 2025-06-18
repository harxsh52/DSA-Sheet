package Binarytree.level4;

public class maxsum {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    private static int sum;
    public int maxPathSum(TreeNode root) {
        sum=Integer.MIN_VALUE;
        maxSumhelper(root);
        return sum;
    }
    public static int maxSumhelper(TreeNode root){
        if(root==null)return 0;
        int leftmax=Math.max(maxSumhelper(root.left),0);
        int rightmax=Math.max(maxSumhelper(root.right),0);

        int current=root.val+leftmax+rightmax;
        sum=Math.max(current,sum);
        return root.val+Math.max(leftmax,rightmax);
    }
}
