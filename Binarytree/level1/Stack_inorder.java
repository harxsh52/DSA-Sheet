package Binarytree.striver;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack_inorder {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
            left=right=null;
        }
    }
     public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();

        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            result.add(root.val);
            root=root.right;
        }
        return result;
    }
}
