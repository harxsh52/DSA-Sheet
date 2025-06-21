package binarysearchtree;

public class insert_a_node {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
            left=right=null;
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        if(root.val>val){
            root.left=insertIntoBST(root.left,val);
        }else{
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }
}
