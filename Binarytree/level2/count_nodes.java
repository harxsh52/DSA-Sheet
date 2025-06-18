package Binarytree.level2;

public class count_nodes {
static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            right=left=null;
        }
    }
    public int countNodes(Node root) {
        if(root==null)return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
