package binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class array_sort {
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
    public static Node create_sortedarray(int[] arr,int i,int j){
        if(i>j){
            return null;
        }
        int mid=i+(j-i)/2;
        Node root=new Node(arr[mid]);
        root.left=create_sortedarray(arr, i, mid-1);
        root.right=create_sortedarray(arr, mid+1, j);
        return root;

    }
    private static void printPath(List<Integer> path) {
    for (int val : path) {
        System.out.print(val + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Node root=create_sortedarray(arr, 0, arr.length-1);
        result=new ArrayList<>();
        inorder(root);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        

    }
}
