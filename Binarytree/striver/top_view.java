package Binarytree.striver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class top_view {
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=right=null;
        }
    }
    class Pair{
        int hd;
        TreeNode node;
        Pair(TreeNode node,int hd){
            this.hd=hd;
            this.node=node;

        }
    }
    public List<Integer> topView(TreeNode root) {
        //your code goes here
        List<Integer> result=new ArrayList<>();
        if(root==null)return result;
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int hd=curr.hd;
            TreeNode node=curr.node;
            if(!map.containsKey(hd)){
                map.put(hd,node.data);
            }
            if(node.left!=null)q.offer(new Pair(node.left,hd-1));
            if(node.right!=null)q.offer(new Pair(node.right,hd+1));
        }
        for(int val:map.values()){
            result.add(val);
        }
        return result;
    }
}
