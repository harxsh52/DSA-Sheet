package binarysearchtree.striver;

public class kthsmallestelement {
    int track;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
            left=right=null;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        track = 0;
        return dfs(root, k);
    }

    private Integer dfs(TreeNode node, int k) {
        if (node.left != null) {
            Integer res = dfs(node.left, k);
            if (res != null) return res;
        }
        track += 1;
        if (track == k) {
            return new Integer(node.val);
        }
        if (node.right != null) {
            Integer res = dfs(node.right, k);
            if (res != null) return res;
        }
        return null;
    }
}
