package binarysearchtree;

public class search_tree {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int data){
            this.val=data;
            left=right=null;
        }
    }
        public Node searchBST(Node root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        if(root.val>val){
            return searchBST(root.left,val);
        }else{
            return searchBST(root.right,val);
        }
    }
}
