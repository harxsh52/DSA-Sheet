package Binarytree.striver;

public class children_sum {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static int isSumProperty(Node root) {
        // add your code here
        if(check(root)){
            return 1;
        }
        return 0;
    }
   public static boolean check(Node root) {
    if (root == null) return true;
    if (root.left == null && root.right == null) return true; // leaf node

    int left = (root.left != null) ? root.left.data : 0;
    int right = (root.right != null) ? root.right.data : 0;

    return (root.data == left + right) && check(root.left) && check(root.right);
}
}
