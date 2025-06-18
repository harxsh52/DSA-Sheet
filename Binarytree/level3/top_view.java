package Binarytree.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class top_view {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            data=val;
            left=right=null;
        }
    }
    static class Pair{
        int hd;
        Node node;
        Pair(Node node,int hd){
            this.hd=hd;
            this.node=node;
        }
    }
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> view=new ArrayList<>();
        if(root==null)return view;
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int hd=curr.hd;
            Node node=curr.node;
            if(!map.containsKey(hd)){
                map.put(hd,node.data);
            }
            if(node.left!=null) q.offer(new Pair(node.left,hd-1));
            if(node.right!=null) q.offer(new Pair(node.right,hd+1));
        }
        for(int val:map.values()){
            view.add(val);
        }
        return view;
    }
}
