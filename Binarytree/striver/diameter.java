package Binarytree.striver;
//g
public class diameter {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
            left=right=null;
        }
    }
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);  // triggers diameter calculation
        return diameter;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);  // update max

        return Math.max(leftHeight, rightHeight) + 1;  // normal height
    }
}
