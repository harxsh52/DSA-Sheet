package Binarytree.practiceimmersion;

public class lowestancestor {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    public TreeNode lowestancestor(TreeNode root,TreeNode p,TreeNode q){
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode left=lowestancestor(root.left,p,q);
        TreeNode right=lowestancestor(root.right,p,q);

        if(left!=null && right!=null){
            return root;
        }
        return left!=null?left:right;

    }
}
