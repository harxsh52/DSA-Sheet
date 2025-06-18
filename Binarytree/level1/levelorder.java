package Binarytree.striver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelorder {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
            left=right=null;
        }
    }
        public List<List<Integer>> levelOrder(TreeNode root) {
            
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> list=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                result.add(list);
                list=new ArrayList<>();
                if(!q.isEmpty()){
                    q.add(null);
                }else{
                    break;
                }
            }else{
                list.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return result;
    }
}
