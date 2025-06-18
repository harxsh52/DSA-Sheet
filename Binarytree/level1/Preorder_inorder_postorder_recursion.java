package Binarytree.striver;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Preorder_inorder_postorder_recursion {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
            left=right=null;
        }
    }
    class Solution {
    List<List<Integer>> treeTraversal(TreeNode root) {
        //your code goes here
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> result1=new ArrayList<>();
        inorder(root,result1);
        result.add(result1);
        result1=new ArrayList<>();
        preorder(root,result1);
        result.add(result1);
        result1=new ArrayList<>();
        postorder(root,result1);
        result.add(result1);
        return result;
    }
    public static void preorder(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        result.add(root.data);
        preorder(root.left,result);
        preorder(root.right,result);
    }
    public static void inorder(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        inorder(root.left,result);
        result.add(root.data);
        inorder(root.right,result);
    }
    public static void postorder(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        postorder(root.left,result);
        postorder(root.right,result);
        result.add(root.data);
    }

}
    
}
