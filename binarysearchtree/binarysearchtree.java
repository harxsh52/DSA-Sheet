package binarysearchtree;
import java.util.*;

public class create_binarytree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    private static List<Integer> result;
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        result.add(root.data);
        inorder(root.right);

    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void main(String[] args) {
        int[] arr={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root, arr[i]);
        }
        result=new ArrayList<>();
        inorder(root);
        for(int val:result){
            System.out.print(val+" ");
        }
        System.out.println("");

    }
}
