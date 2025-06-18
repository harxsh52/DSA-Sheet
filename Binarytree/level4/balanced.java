package Binarytree.level4;

public class balanced {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public boolean isBalanced(Node root) {
        // code here
        if(root==null)return true;
        int rootl=height(root.left);
        int rootr=height(root.right);
        return Math.abs(rootl-rootr)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int height(Node root){
        if(root==null) return 0;
        int lheight=height(root.left);
        int rheight=height(root.right);
        
        return Math.max(lheight,rheight)+1;
    }
}
