package Binarytree.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class left_view {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    //recursion
    private List<Integer> result;
    
    private void traverseTree(Node node, int level){
        if(node == null){
            return;
        }
        
        if(result.size() == level){
            result.add(node.data);
        }
        
        
        traverseTree(node.left, level + 1);
        traverseTree(node.right, level + 1);
    }
    public List<Integer> rightSideView(Node root) {
        result = new ArrayList();
        if(root == null){
            return result;
        }
        
        traverseTree(root, 0);
        return result;
    }

    //iterative
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)return list;
        
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(i==0) list.add(curr.data);
                
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
        }
        return list;
    }
}
