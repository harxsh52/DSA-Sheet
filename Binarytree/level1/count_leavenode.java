package Binarytree.level1;

public class count_leavenode {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static int countLeafNodes(Node root) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) return 1;
            return countLeafNodes(root.left) + countLeafNodes(root.right);
        }
}
