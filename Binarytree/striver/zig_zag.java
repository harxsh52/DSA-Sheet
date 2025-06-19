package Binarytree.striver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zig_zag {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                if(result.size()%2!=0){
                    Collections.reverse(list);
                }
                result.add(list);
                list=new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }else{
                    q.offer(null);
                }
            }else{
                list.add(curr.val);
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            
        }
        return result;
    }
}
