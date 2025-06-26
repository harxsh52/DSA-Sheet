package Binarytree.practiceimmersion;

public class pathsum {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static boolean sum(TreeNode root,int targetSum){
        if(root==null)return false;
        if(root.left==null && root.right==null){
            return targetSum==root.val;
        }
        boolean leftSum=sum(root.left,targetSum-root.val);
        boolean rightSum=sum(root.right,targetSum-root.val);
        return leftSum || rightSum;
    }
}
