package binarysearchtree;

public class binarytree_preorder {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=right=null;
        }
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int val:preorder){
            root=insert(root,val);
        }
        return root;
    }
    public TreeNode insert(TreeNode root,int val){
        if(root==null)return new TreeNode(val);
        if(val<root.val) root.left=insert(root.left,val);
        else root.right=insert(root.right,val);
        return root;
    }
}
