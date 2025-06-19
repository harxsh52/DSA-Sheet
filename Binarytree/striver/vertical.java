package Binarytree.striver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class vertical {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
            left=right=null;
        }
    }
    static class Triplet{
        int row;
        int col;
        TreeNode node;
        Triplet(TreeNode node,int row,int col){
            this.node=node;
            this.row=row;
            this.col=col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)return result;
        Queue<Triplet> q=new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        q.offer(new Triplet(root,0,0));
        while(!q.isEmpty()){
            Triplet curr=q.poll();
            int row=curr.row;
            int col=curr.col;
            TreeNode node=curr.node;
            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).offer(node.val);
            if(node.left!=null)q.offer(new Triplet(node.left,row+1,col-1));
            if(node.right!=null)q.offer(new Triplet(node.right,row+1,col+1));
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> r:map.values()){
            List<Integer> col=new ArrayList<>();
            for(PriorityQueue<Integer> w:r.values()){
                while(!w.isEmpty()){
                    col.add(w.poll());
                }
            }
            result.add(col);
        }
        return result;
    }
}
