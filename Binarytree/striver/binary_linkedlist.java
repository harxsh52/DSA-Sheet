package Binarytree.striver;

import java.util.List;

public class binary_linkedlist {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
    private List<Integer> result;
    public void flatten(TreeNode root) {
        recursion(root);
        return ;
        
    }
    public void preorder(TreeNode root){
        if(root==null)return;
        result.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public void recursion(TreeNode root){
        if(root==null)return;
        TreeNode left=root.left;
        TreeNode right=root.right;

        root.left=null;
        recursion(left);
        recursion(right);
        root.right=left;
        TreeNode curr=root;
        while(curr.right !=null)curr=curr.right;
        curr.right=right;
    }
}
