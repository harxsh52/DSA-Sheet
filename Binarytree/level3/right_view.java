package Binarytree.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class right_view {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=right=null;
        }
    }
    //itertion

    public List<Integer> rrightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(i==size-1)result.add(curr.data);
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
        }
        return result;
    }

    //recursion
        private List<Integer> result;
        private void traverseTree(TreeNode node, int level){
        if(node == null){
            return;
        }
        
        if(result.size() == level){
            result.add(node.data);
        }
        
        traverseTree(node.right, level + 1);
        traverseTree(node.left, level + 1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        result = new ArrayList();
        if(root == null){
            return result;
        }
        
        traverseTree(root, 0);
        return result;
    }
}
