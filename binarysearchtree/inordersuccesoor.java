package binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class inordersuccesoor {
    class Node{
        int data;
        Node left;
        Node right;
       Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    private List<Integer> result;
    public int inorderSuccessor(Node root, Node x) {
        // add code here.
        result=new ArrayList<>();
        inorder(root);
        int t=0;
        for(int i=0;i<result.size();i++){
            if(result.get(i)==x.data){
                t=i+1;
            }
        }
        if(t==result.size()){
            return -1;
        }
        return result.get(t);
    }
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        result.add(root.data);
        inorder(root.right);
    }
}
