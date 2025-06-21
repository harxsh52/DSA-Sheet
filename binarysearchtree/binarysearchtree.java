package binarysearchtree;
import java.util.*;

public class binarysearchtree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    //Gobally declared list
    private static List<Integer> result;

    //print inorder 
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        result.add(root.data);
        inorder(root.right);

    }

    //creating binary search tree
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

    //searching in a BST
    public static boolean search(Node root, int key) {
    if (root == null) {
        return false;
    }
    if (root.data == key) {
        return true;
    }
    if (key < root.data) {
        return search(root.left, key);  // go left
    } else {
        return search(root.right, key); // go right
    }
}

//delete a node

    //function calling
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

        boolean q=search(root, 9);
        System.out.println(q);

    }

}
