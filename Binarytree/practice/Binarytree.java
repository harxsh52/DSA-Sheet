package Binarytree.practice;
import java.util.*;

public class preorder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            right=left=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(idx>=nodes.length||nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }

    }
    public static void preorderprint(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data +" ");
        preorderprint(root.left);
        preorderprint(root.right);
    }
    public static void inorderprint(Node root){
        if(root==null){
            return;
        }
        inorderprint(root.left);
        System.out.print(root.data +" ");
        inorderprint(root.right);
    }
    public static void postorderprint(Node root){
        if(root==null){
            return;
        }
        postorderprint(root.left);
        postorderprint(root.right);
        System.out.print(root.data);
    }
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println("");
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
        return;
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        preorderprint(root);
        System.out.println();
        inorderprint(root);
        System.out.println("");
        postorderprint(root);
        System.out.println("");
        levelorder(root);
    }
}
