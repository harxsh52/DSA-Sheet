package Binarytree.striver;
import java.util.*;

public class right_view {
     class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=right=null;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        int level=0;
        travesal(root,result,level);
        return result;
    }
    private void travesal(TreeNode root,List<Integer> result,int level){
        if(root==null){
            return;
        }
        if(result.size()==level){
            result.add(root.data);
        }
        
        travesal(root.right,result,level+1);
        travesal(root.left,result,level+1);
    }}
