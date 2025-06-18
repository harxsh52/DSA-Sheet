package Binarytree.striver;

public class mirror {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            left=right=null;
        }
    }
    void mirror(Node root) {
        // Your code here
        if(root==null)return;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }
}
